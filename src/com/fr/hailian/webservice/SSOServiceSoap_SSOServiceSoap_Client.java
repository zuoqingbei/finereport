
package com.fr.hailian.webservice;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.12
 * 2017-08-08T15:22:48.111+08:00
 * Generated source version: 3.1.12
 * 
 */
public final class SSOServiceSoap_SSOServiceSoap_Client {

    private static final QName SERVICE_NAME = new QName("http://sso.nwh.cn", "SSOService");

    private SSOServiceSoap_SSOServiceSoap_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = SSOService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        SSOService ss = new SSOService(wsdlURL, SERVICE_NAME);
        SSOServiceSoap port = ss.getSSOServiceSoap();  
        
        {
        System.out.println("Invoking getTargetEntry...");
        java.lang.String _getTargetEntry_info = "";
        java.lang.String _getTargetEntry__return = port.getTargetEntry(_getTargetEntry_info);
        System.out.println("getTargetEntry.result=" + _getTargetEntry__return);


        }
        {
        System.out.println("Invoking getUserInfoByToken...");
        java.lang.String _getUserInfoByToken_info = "";
        java.lang.String _getUserInfoByToken__return = port.getUserInfoByToken(_getUserInfoByToken_info);
        System.out.println("getUserInfoByToken.result=" + _getUserInfoByToken__return);


        }
        {
        System.out.println("Invoking helloWorld...");
        java.lang.String _helloWorld_msg = "";
        java.lang.String _helloWorld__return = port.helloWorld(_helloWorld_msg);
        System.out.println("helloWorld.result=" + _helloWorld__return);


        }
        {
        System.out.println("Invoking changePassword...");
        java.lang.String _changePassword_loginName = "";
        java.lang.String _changePassword_oldPasswd = "";
        java.lang.String _changePassword_newPasswd = "";
        java.lang.String _changePassword__return = port.changePassword(_changePassword_loginName, _changePassword_oldPasswd, _changePassword_newPasswd);
        System.out.println("changePassword.result=" + _changePassword__return);


        }
        {
        System.out.println("Invoking getUserResource...");
        java.lang.String _getUserResource_info = "";
        java.lang.String _getUserResource__return = port.getUserResource(_getUserResource_info);
        System.out.println("getUserResource.result=" + _getUserResource__return);


        }
        {
        System.out.println("Invoking getUserState...");
        java.lang.String _getUserState_loginName = "";
        java.lang.String _getUserState__return = port.getUserState(_getUserState_loginName);
        System.out.println("getUserState.result=" + _getUserState__return);


        }
        {
        System.out.println("Invoking userValidate...");
        java.lang.String _userValidate_info = "";
        java.lang.String _userValidate__return = port.userValidate(_userValidate_info);
        System.out.println("userValidate.result=" + _userValidate__return);


        }
        {
        System.out.println("Invoking logout...");
        java.lang.String _logout_info = "";
        java.lang.String _logout__return = port.logout(_logout_info);
        System.out.println("logout.result=" + _logout__return);


        }

        System.exit(0);
    }

}
