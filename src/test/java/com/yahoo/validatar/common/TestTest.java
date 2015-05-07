/*
 * Copyright 2014-2015 Yahoo! Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.yahoo.validatar.common;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTest {
    @Test
    public void testGetSet() {
        com.yahoo.validatar.common.Test test = new com.yahoo.validatar.common.Test();

        test.setFailedAssertMessage("sample message");
        Assert.assertEquals(test.getFailedAssertMessage(), "sample message");

        test.setTestFailed();
        Assert.assertTrue(test.failed());

        test.setTestSuccess();
        Assert.assertFalse(test.failed());
    }
}
