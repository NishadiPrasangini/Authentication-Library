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
 * @param <T> an object of the message type specific to the protocol implemented. To be set to 'String' if there
 *            isn't anything specific.
 */

public interface Authenticator <T>{

    //Athenticate the user name and password

    /**
     *
     * @param username username of the device logging
     * @param password password of the device logging
     */
    void basicAuth(String username,String password);

    //Get the callback from IOT server

    /**
     *
     * @param message the message (of the type specific to the protocol) received from the device.
     *
     * Responce can be success or fail.
     */
    void callback(T message);
}
