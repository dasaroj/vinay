<%@ include file="/html/employee/init.jsp"%>
<portlet:actionURL name="updateContactDetails"
	var="updateContactDetails" ></portlet:actionURL>
<aui:script use="aui-base,aui-node,aui-io-request-deprecated">
var A=new AUI();
A.ready(function()
  {
  A.one('#emergencyContactAdd').hide();
  });
   var addButton=A.one('#<portlet:namespace />emgContactAdd');
   addButton.on('click',
   function()
   {
   alert("adding contact details");
   A.one('#<portlet:namespace/>emgContactAdd').hide();
   A.one('#<portlet:namespace/>emgContactDelete').hide();
   A.one('#emergencyContactAdd').show();
   A.all('input[type=text]').set('disabled',false);
   A.all('input[type=select]').set('disabled',false);
   A.all('input[type=radio]').set('disabled',false);
   });
   var cancelButton=A.one('#<portlet:namespace />cancelEmgContacts');
   cancelButton.on('click',
   function()
   {
    A.one('#emergencyContactAdd').hide();
    A.one('#assignedEmergencyContactsAddDelete').show();
     A.one('#<portlet:namespace/>emgContactAdd').show();
   A.one('#<portlet:namespace/>emgContactDelete').show();
   });
</aui:script>
<%
Map empId = (Map) request.getSession(false).getAttribute(
		"empId");
long employeeId = (Long)empId.get("empId");
String jsp=(String)empId.get("jsp");
long fileEntryId=(Long)empId.get("fileId");
	DynamicQuery emergencyContactsDynamicQuery = DynamicQueryFactoryUtil
			.forClass(EmpEmergencyContact.class,
					PortletClassLoaderUtil.getClassLoader());
	emergencyContactsDynamicQuery.add(PropertyFactoryUtil.forName(
			"employeeId").eq(employeeId));
	List<EmpEmergencyContact> emergencyDetails = EmpPersonalDetailsLocalServiceUtil
			.dynamicQuery(emergencyContactsDynamicQuery);
	EmpEmergencyContact empEmergencyContact = null;
%>
<div id="emergencyContactAdd" class="panel">
	<div class="panel-heading">
		<h3>Add Emergency Contact</h3>
	</div>
	<div class="panel-body">
		<aui:form name="addEmergencyContact" id="addEmergencyContact"
			 method="post" action="<%=updateContactDetails %>">
			 <aui:input name="emgEmpId" value="<%=employeeId %>" type="hidden"></aui:input>
			 <aui:input name="conFileId" value="<%=fileEntryId %>" type="hidden"></aui:input>
			<div class="row-fluid">
				<div class="span10">
					<aui:input name="emg_name" label="Name" inlineLabel="left"></aui:input>
				</div>
			</div>
			<div class="row-fluid">
				<div class="span10">
					<aui:input name="emg_relationship" label="Relationship"
						inlineLabel="left"></aui:input>
				</div>
			</div>
			<div class="row-fluid">
				<div class="span10">
					<aui:input name="emg_hm_telephone" label="Home Telephone"
						inlineLabel="left">
					</aui:input>
				</div>
			</div>
			<div class="row-fluid">
				<div class="span10">
					<aui:input name="emg_mobile" label="Mobile" inlineLabel="left"></aui:input>
				</div>
			</div>
			<div class="row-fluid">
				<div class="span10">
					<aui:input name="emg_work_telephone" label="Work Telephone"
						inlineLabel="left"></aui:input>
				</div>
			</div>
			<aui:button type="submit" cssClass="button btn-primary" value="save"
				id="submitEmgDetails"></aui:button>
			<aui:button type="reset" id="cancelEmgContacts" name="cancelEmgContacts"
			value="Cancel" cssClass="button btn-danger"></aui:button>
		</aui:form>
	</div>
</div>
<div id="assignedEmergencyContactsAddDelete" class="panel">
	<div class="panel-heading">
		<h3>Assigned Emergency Contacts</h3>
	</div>
	<div class="panel-body">
		<aui:button id="emgContactAdd" name="emgContactAdd" value="Add" 
		cssClass="button btn-primary"></aui:button>
		<aui:button id="emgContactDelete" value="Delete"
			name="emgContactDelete" cssClass="button btn-danger"></aui:button>
		<liferay-ui:search-container delta="5"
			emptyResultsMessage="No records are available for Emergency Contaccts"
			deltaConfigurable="true" rowChecker="<%= new RowChecker(renderResponse) %>">
			<liferay-ui:search-container-results>
				<%
					List<EmpEmergencyContact> emergencyContactDetails = emergencyDetails;
							results = emergencyContactDetails;
							total = emergencyContactDetails.size();
							pageContext.setAttribute("results", results);
							pageContext.setAttribute("total", total);
				%>
			</liferay-ui:search-container-results>
			<liferay-ui:search-container-row className="EmpEmergencyContact"
				modelVar="id">
				<liferay-ui:search-container-column-text name="Name" property="name" />
				<liferay-ui:search-container-column-text name="Relation"
					property="relationship" />
				<liferay-ui:search-container-column-text name="Home Telephone"
					property="homeTelephone" />
				<liferay-ui:search-container-column-text name="Mobile"
					property="mobile" />
				<liferay-ui:search-container-column-text name="Work Telephone"
					property="workTelephone" />
			</liferay-ui:search-container-row>
			<liferay-ui:search-iterator />
		</liferay-ui:search-container>
	</div>
</div>
