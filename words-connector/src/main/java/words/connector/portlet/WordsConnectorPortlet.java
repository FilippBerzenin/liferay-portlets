package words.connector.portlet;

import words.connector.constants.WordsConnectorPortletKeys;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;

import org.osgi.service.component.annotations.Component;

/**
 * @author Fylyp
 */
@Component(immediate = true, property = { "com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css", "com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=WordsConnector", "javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + WordsConnectorPortletKeys.WORDSCONNECTOR,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" }, service = Portlet.class)
public class WordsConnectorPortlet extends MVCPortlet {
	
	@ProcessAction(name="addWords")
	public void sampleActionMethod(ActionRequest request, ActionResponse response)
	                throws IOException, PortletException, PortalException, SystemException{
		
		System.out.println("This is sampleActionMethod ..."); 
		String firstWord = ParamUtil.getString(request, "firstWord");
		String secondWord = ParamUtil.getString(request, "secondWord");
		System.out.println("firstWord: "+firstWord);
		System.out.println("secondWord: "+secondWord);
		response.setRenderParameter("newWord", firstWord+secondWord);
		System.out.println(firstWord+secondWord);
	}

//	@ProcessAction(name="/addEmployee")
//	public void addEmployee(ActionRequest actionRequest, ActionResponse actionResponse)
//			throws IOException, PortletException {
//		System.out.println("------------------------------------------------");
//		String employeeName = ParamUtil.getString(actionRequest, "employeeName");
//		String employeeAddress = ParamUtil.getString(actionRequest, "employeeAddress");
//		System.out.println(employeeName);
//		System.out.println(employeeAddress);
////		Map<String, String> employeeMap = new HashMap<String, String>();
////		employeeMap.put("employeeName", employeeName);
////		employeeMap.put("employeeAddress", employeeAddress);
////		actionRequest.setAttribute("employeeMap", employeeMap);
////		actionResponse.setRenderParameter("mvcPath", "/displayEmployee.jsp");
//	}

//	public void addWords(ActionRequest actionRequest, ActionResponse actionResponse)
//			throws IOException, PortletException {
//		String firstWord = ParamUtil.getString(actionRequest, "firstInputForm");
//		System.out.println(firstWord);
//		String secondWord = ParamUtil.getString(actionRequest, "secondInputForm");
//		System.out.println(secondWord);
////		Map<String, String> employeeMap = new HashMap<String, String>();
////		employeeMap.put("employeeName", employeeName);
////		employeeMap.put("employeeAddress", employeeAddress);
//		actionRequest.setAttribute("newWord", firstWord+secondWord);
//		actionResponse.setRenderParameter("mvcPath", "META-INF/resources/view.jsp");
//	}
//
//	public void addEmployee(ActionRequest actionRequest, ActionResponse actionResponse)
//			throws IOException, PortletException {
//		String employeeName = ParamUtil.getString(actionRequest, "employeeName");
//		String employeeAddress = ParamUtil.getString(actionRequest, "employeeAddress");
//		Map<String, String> employeeMap = new HashMap<String, String>();
//		employeeMap.put("employeeName", employeeName);
//		employeeMap.put("employeeAddress", employeeAddress);
//		actionRequest.setAttribute("employeeMap", employeeMap);
//		actionResponse.setRenderParameter("mvcPath", "/html/jsps/displayEmployee.jsp");
//	}
}