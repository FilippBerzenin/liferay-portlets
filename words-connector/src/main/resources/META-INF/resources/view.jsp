<%@ include file="/init.jsp"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<portlet:defineObjects />
<portlet:actionURL name="addWords" var="sampleActionMethodURL">
</portlet:actionURL>

<div>
	<h1>Words connector</h1>
	<h3>Please, enter words in forms and get result</h3>
	<form action="${sampleActionMethodURL}" method="post">
		<table>
			<thead>
			</thead>
			<tbody>
				<tr>
					<td>First word :</td>
					<td><input type="text" name="<portlet:namespace/>firstWord"></td>
				</tr>
				<tr>
					<td>Second word :</td>
					<td><input type="text" name="<portlet:namespace/>secondWord"></td>
				</tr>
				<tr>
					<td><input type="submit" value="Submit"></td>
				</tr>
				<tr>
					<td><%=ParamUtil.getString(renderRequest, "newWord")%>
					<td>
				</tr>
			</tbody>
		</table>
	</form>
</div>