/*
 * Copyright [2018] [Guan Zhenhang]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.ghang.reference.guide.test;

import io.ghang.reference.guide.model.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author : Guan Zhenhang
 * @date : 2018/12/16 0016
 * <p>
 * 三个注解中,RunWith是为了运行spring环境,SpringBootTest是为了指定与测试类不同包的person类,
 * EnableConfigurationProperties是指明person类装载配置信息
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Person.class)
@EnableConfigurationProperties(Person.class)
public class PersonTest {

    @Autowired
    Person person;

    @Test
    public void testPerson() {
        System.out.println(person);
    }
}
