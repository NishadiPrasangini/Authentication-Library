/*
 *
 *   Copyright (c) ${date}, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *   WSO2 Inc. licenses this file to you under the Apache License,
 *   Version 2.0 (the "License"); you may not use this file except
 *   in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 * /.
 */

package org.wso2.authenticationlib;

/**
 * Created by nishadi on 10/17/17.
 */


/**
 */
public class AuthDevice {


private String userName;
private String password;



    /**
     * Sets username.
     * @param username Required: Username as a {@link String}.
     */
    protected void setUsername(String username) {
        userName = username;
    }

    /**
     * Sets password
     * @param password Required: Password as a {@link String}
     *
     */

    protected void setPassword(String password){
        password=password;

    }

    protected String getusername(String userName){
        userName=userName;
        return userName;
    }

    protected String getPassword(String password){
        password=password;
        return password;
    }


}
