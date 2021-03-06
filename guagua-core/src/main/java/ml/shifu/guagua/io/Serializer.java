/*
 * Copyright [2013-2014] eBay Software Foundation
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ml.shifu.guagua.io;

/**
 * {@link Serializer} is used to serialize {@link Bytable} object to bytes and de-serialize bytes to {@link Bytable}
 * object.
 * 
 * <p>
 * A CONTRACT here: To make sure halt status in {@link Bytable} can be serialized or de-serialized. Please make sure to
 * write and read halt status in {@link Bytable}.
 */
public interface Serializer<RESULT extends Bytable> {

    /**
     * Transform object to byte array.
     */
    byte[] objectToBytes(RESULT result);

    /**
     * Transform byte array to object. Because of generic erasion, className should be provided.
     */
    RESULT bytesToObject(byte[] data, String className);
}
