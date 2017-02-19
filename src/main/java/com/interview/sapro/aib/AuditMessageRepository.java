package com.interview.sapro.aib;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Copyright (c) 2017  Ghodratollah Naderi Darehkat
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * Project:Simple Bank Employees Dashboard Application
 * Author: Ghodratollah Naderi
 * E-Mail: Naderi.ghodrat@gmail.com
 * Date  : 19/02/2017
 */
@Repository
public interface AuditMessageRepository extends CrudRepository<AuditMessage, Long> {
}
