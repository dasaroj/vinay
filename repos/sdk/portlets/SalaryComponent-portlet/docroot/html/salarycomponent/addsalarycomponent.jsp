																																																																										<%@page import="com.liferay.portal.kernel.servlet.SessionMessages"%>
<%@ include file="/html/salarycomponent/init.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Salary Component</title>
<portlet:actionURL var="savesalarycomponent" name="saveSalaryComponent">
</portlet:actionURL>
<portlet:renderURL var="listview">
	<portlet:param name="mvcPath" value="/html/salarycomponent/list.jsp" />
</portlet:renderURL>
<aui:script>
AUI().ready('event', 'node','transition',function(A){
  setTimeout(function(){
    A.one('#addsalarycomponentMessage').transition('fadeOut');
},1000)
 });

</aui:script>
</head>
<body>
<% if(SessionMessages.contains(renderRequest.getPortletSession(),"salarycomponentName-empty-error")){%>
<p id="addsalarycomponentMessage"><liferay-ui:message key="Please Enter SalarycomponentName"/></p>
<%} 
 if(SessionMessages.contains(renderRequest.getPortletSession(),"salarycomponentName-duplicate-error")){
%>
<p id="addsalarycomponentMessage"><liferay-ui:message key="SalarycomponentName already Exits"/></p>
<%} 
%>
<aui:form  action="<%=savesalarycomponent.toString()%>">
<div class="form-horizontal clearfix">
	<input name="<portlet:namespace/>salarycomponentId" type="hidden" id="salarycomponentId">
	<aui:input name="componentName" showRequiredLabel="false" id="componentname" label="Component Name" inlineLabel="left"><aui:validator name="required"></aui:validator> </aui:input>
	<div class="control-group">
		<label class="control-label">Type</label>
		<aui:input name="type" type="radio" value="Earning" label="Earning" inlineField="true"></aui:input>
		<aui:input name="type" type="radio" value="Deduction" label="Deduction" inlineField="true"></aui:input>
	</div>
	<div class="control-group">
		<label class="control-label">Add to</label>
		<aui:input name="totalPayable" type="checkbox"   label="Total Payable" inlineField="true"></aui:input>
		<aui:input name="costToCompany" type="checkbox"  label="Cost to Company" inlineField="true"></aui:input>
	</div>
	<div class="control-group">
		<label class="control-label">valueType</label>
		<aui:input type="checkbox" name="valueType" inlineField="true" label="Amount"></aui:input>
		<aui:input type="checkbox" name="valueType" inlineField="true" label="Percentage"></aui:input>
	</div>
	<div class="control-group">
		<div class="controls">
			<aui:button type="submit" value="Submit"/> 
			<aui:button type="reset" href="<%=listview%>" value="Cancel"/>
		</div>
	</div>
</div>
</aui:form>
</body>
</html>