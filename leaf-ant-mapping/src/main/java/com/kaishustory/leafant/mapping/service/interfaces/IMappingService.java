/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.kaishustory.leafant.mapping.service.interfaces;

import com.kaishustory.leafant.common.model.LoadStatus;
import com.kaishustory.leafant.common.model.SyncStatus;
import com.kaishustory.leafant.common.utils.Option;

/**
 * 映射管理接口
 **/
public interface IMappingService {

    /**
     * 更改已初始化状态
     *
     * @param loadStatus 状态
     */
    void updateInitialized(LoadStatus loadStatus);

    /**
     * 更新同步状态
     *
     * @param syncStatus 同步状态
     * @return 是否成功
     */
    Option updateSyncStatus(SyncStatus syncStatus);
}
