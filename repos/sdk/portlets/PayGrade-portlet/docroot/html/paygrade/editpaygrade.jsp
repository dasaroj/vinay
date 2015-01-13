<%@page import="com.liferay.portal.kernel.servlet.SessionMessages"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQuery"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.portlet.PortletClassLoaderUtil"%>
<%@page import="com.rknowsys.eapp.hrm.model.PayGrade"%>
<%@page import="com.rknowsys.eapp.hrm.PayGradeAction"%>
<%@page import="com.rknowsys.eapp.hrm.CustomComparatorUtil"%>
<%@page import="com.rknowsys.eapp.hrm.service.PayGradeCurrencyLocalServiceUtil"%>
<%@page import="com.rknowsys.eapp.hrm.model.PayGradeCurrency"%>
<%@ include file="/html/paygrade/init.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit PayGrade</title>
<portlet:actionURL var="savepaygradecurrency" name="savePayGradeCurrency">
</portlet:actionURL>
<portlet:renderURL var="paygrade">
	<portlet:param name="mvcPath" value="/html/paygrade/paygradelist.jsp" />
</portlet:renderURL>
<portlet:resourceURL var="deletepaygradecurreny" id="deletePayGradeCurrency"/>
<portlet:renderURL var="listview">
	<portlet:param name="mvcPath" value="/html/paygrade/editpaygrade.jsp" />
</portlet:renderURL>

<aui:script>
AUI().use(
  'aui-node',
  function(A) {
    var node = A.one('#currencydelete');
    node.on(
      'click',
      function() {
    var idArray = [];
      A.all('input[name=<portlet:namespace/>rowIds]:checked').each(function(object) {
      idArray.push(object.get("value"));
    
        });
       if(idArray==""){
			  alert("Please select records!");
		  }else{
			  var d = confirm("Are you sure you want to delete the selected records ?");
		  if(d){
		   var url = '<%=deletepaygradecurreny%>';
          A.io.request(url,
         {
          data: {  
                <portlet:namespace />paygradecurrencyIds: idArray,  
                 },
          on: {
               success: function() { 
                   alert('deleted successfully');
                   window.location='<%=listview%>';
              },
               failure: function() {
                  
                 }
                }
                 }
                );
		  																		
		  console.log(idArray);
	  
      return true;
  }
  else
    return false;
}             
      }
    );
  }
);

AUI().use(
  'aui-autocomplete',
  function (A) {
    var continents = ['Doller', 'Euro', 'Dinar', 'Africa', 'Rupie', 'Indian Rupee'];

    new A.AutoComplete(
      {
        contentBox: '#myAutoComplete',
        dataSource: continents
      }
    ).render();
  }
);


</aui:script>

</head>
<body>
 <%

PayGrade paygrade3 =(PayGrade) portletSession.getAttribute("paygrade3");
Long paygradeid = paygrade3.getPayGradeId();
System.out.println("id ======= " +paygradeid);

%> 


<div class="panel panel-default">
	<div class="panel-heading">
	<font  class="panel-title"><b>PayGrade</b></font>
	 </div>
	 <div class="panel-body">
	 <div class="paygradeform form-horizontal">
		<aui:form name="paygradeForm">
			<aui:input name="paygradeId" type="hidden" id="paygradeId"  value="<%=paygrade3.getPayGradeId()%>"/>
			<div class="control-group">
			<label class="control-label">Name<em>*</em> </label>
			<div class="controls">
			<input name="<portlet:namespace/>paygradeName" id="paygrade" type="text" required = "required" readonly="readonly" value="<%=paygrade3.getPayGradeName()%>">
			</div>
			</div>
		</aui:form>
	</div>
	</div>
</div>
		 
	<div class="panel panel-default">
		<div class="panel-heading">
		  <font class="panel-title"><b>Add Currency</b></font>
		</div>
 <div class="panel-body">
 
	<% if(SessionMessages.contains(renderRequest.getPortletSession(),"paygradecurrency-empty-error")){%>
	<liferay-ui:message key="Please Enter PayGradeCurrency"/>
	<%} 
	if(SessionMessages.contains(renderRequest.getPortletSession(),"paygradecurrency-duplicate-error")){
	%>
	<liferay-ui:message key="PayGradeCurrency already Exits"/>
	<%} 
	%>
    <div id="currencyform" class="form-horizontal"> 
   
		<aui:form name="myForm" action="<%=savepaygradecurrency.toString()%>">
		 <aui:input name="paygradeId" type="hidden" id="paygradeId"  value="<%=paygrade3.getPayGradeId()%>"/>
		 <aui:input name="paygradecurrencyId" type="hidden" id="paygradecurrencyId"/> 
		 <div class="control-group">
			 <label class="control-label">Currency:<em>*</em> </label>
			 <div class="controls">
			<input name="<portlet:namespace/>currency" id="myAutoComplete" required="required" type="text" >
			</div>
        </div>
        <div class="control-group">
			<label class="control-label">Minimum Salary</label>
			<div class="controls">
			<input name="<portlet:namespace/>minSalary" id="paygrade" type="text">
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">Maximum Salary</label>
			<div class="controls">
		 	<input name="<portlet:namespace/>maxSalary" id="paygrade" type="text">
		 	</div>
		</div>
		 <div class="control-group">
		 	<div class="controls">
				<aui:button type="Submit" value="Submit" />
				<aui:button  type="reset" href="<%=paygrade.toString()%>" value="Cancel" id ="currencycancel"/>
				<button id="currencydelete" class="btn btn-danger" type="button"><i class="icon-trash"></i> Delete </button>
			</div>
		</div>	
	</aui:form>
	</div>
	 
<%
PortletURL iteratorURL = renderResponse.createRenderURL();
iteratorURL.setParameter("mvcPath", "/html/paygrade/editpaygrade.jsp");
%>
<%!
  com.liferay.portal.kernel.dao.search.SearchContainer<PayGradeCurrency> searchContainer;
%>

 <liferay-ui:search-container delta="5" emptyResultsMessage="No records is available for PayGradeCurrency" rowChecker="<%= new RowChecker(renderResponse) %>"  deltaConfigurable="true"  iteratorURL="<%=iteratorURL%>">
		<liferay-ui:search-container-results>
		<%
		DynamicQuery paygradecurrencyquery = DynamicQueryFactoryUtil.forClass(PayGradeCurrency.class, PortletClassLoaderUtil.getClassLoader());
		paygradecurrencyquery.add(PropertyFactoryUtil.forName("payGradeId").eq(paygradeid));
		 
		 results =  PayGradeCurrencyLocalServiceUtil.dynamicQuery(paygradecurrencyquery);
		System.out.println("results == " +results.size());
		total = results.size();
		pageContext.setAttribute("results", results);
		pageContext.setAttribute("total", total);
				
		%>
	</liferay-ui:search-container-results>
	<liferay-ui:search-container-row className="PayGradeCurrency" keyProperty="payGradeCurrencyId" modelVar="PayGradeCurrency"  rowVar="curRow" escapedModel="<%= true %>">
	     <liferay-ui:search-container-column-text  name="Currency" property="currency"/>
	     <liferay-ui:search-container-column-text  name="Min Salary" property="minSalary"/>
	     <liferay-ui:search-container-column-text  name="Max Salary" property="maxSalary"/>
	     
		 <liferay-ui:search-container-column-jsp name="Edit"  path="/html/paygrade/editcurrency.jsp"/>
		 
	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator/>
	
</liferay-ui:search-container>

 </div>
</div>

</body>


</html>