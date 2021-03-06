package org.interledger.encoding.asn.serializers.oer;

/*-
 * ========================LICENSE_START=================================
 * Interledger Codec Framework
 * %%
 * Copyright (C) 2017 - 2018 Hyperledger and its contributors
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * =========================LICENSE_END==================================
 */

import com.google.common.io.BaseEncoding;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

/**
 * Parameterized unit tests for encoding an instance of {@link String} as an IA5String.
 */
@RunWith(Parameterized.class)
public class IA5StringOerSerializerTest extends AbstractSerializerTest<String> {

  /**
   * Construct an instance of this parameterized test with the supplied inputs.
   *
   * @param stringValue The expected value, as a {@link String}, of the supplied {@code asn1Bytes}.
   * @param asn1Bytes   A byte array representing octets to be encoded.
   */
  public IA5StringOerSerializerTest(final String stringValue, final byte[] asn1Bytes) {
    super(stringValue, String.class, asn1Bytes);
  }

  /**
   * The data for this test...
   */
  @Parameters
  public static Collection<Object[]> data() {
    return Arrays.asList(new Object[][] {
        // [input_value][num_octets_written][byte_values]
        // 0
        {"", BaseEncoding.base16().decode("00")},
        // 1
        {"a", BaseEncoding.base16().decode("0161")},
        // 2
        {"abc", BaseEncoding.base16().decode("03616263")},
        // 3
        {"hello world", BaseEncoding.base16().decode("0B68656C6C6F20776F726C64")},
        // 4
        {"g.test.foo", BaseEncoding.base16().decode("0A672E746573742E666F6F")},
        // 4
        {"g.test.1024.AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
            + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
            + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
            + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
            + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
            + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
            + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
            + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
            + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
            + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
            + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
            + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
            + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
            + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA",
            BaseEncoding.base16()
                .decode("8203FF672E746573742E313032342E4141414141414141414"
                + "1414141414141414141414141414141414141414141414141414141414141414141414141"
                + "4141414141414141414141414141414141414141414141414141414141414141414141414"
                + "1414141414141414141414141414141414141414141414141414141414141414141414141"
                + "4141414141414141414141414141414141414141414141414141414141414141414141414"
                + "1414141414141414141414141414141414141414141414141414141414141414141414141"
                + "4141414141414141414141414141414141414141414141414141414141414141414141414"
                + "1414141414141414141414141414141414141414141414141414141414141414141414141"
                + "4141414141414141414141414141414141414141414141414141414141414141414141414"
                + "1414141414141414141414141414141414141414141414141414141414141414141414141"
                + "4141414141414141414141414141414141414141414141414141414141414141414141414"
                + "1414141414141414141414141414141414141414141414141414141414141414141414141"
                + "4141414141414141414141414141414141414141414141414141414141414141414141414"
                + "1414141414141414141414141414141414141414141414141414141414141414141414141"
                + "4141414141414141414141414141414141414141414141414141414141414141414141414"
                + "1414141414141414141414141414141414141414141414141414141414141414141414141"
                + "4141414141414141414141414141414141414141414141414141414141414141414141414"
                + "1414141414141414141414141414141414141414141414141414141414141414141414141"
                + "4141414141414141414141414141414141414141414141414141414141414141414141414"
                + "1414141414141414141414141414141414141414141414141414141414141414141414141"
                + "4141414141414141414141414141414141414141414141414141414141414141414141414"
                + "1414141414141414141414141414141414141414141414141414141414141414141414141"
                + "4141414141414141414141414141414141414141414141414141414141414141414141414"
                + "1414141414141414141414141414141414141414141414141414141414141414141414141"
                + "4141414141414141414141414141414141414141414141414141414141414141414141414"
                + "1414141414141414141414141414141414141414141414141414141414141414141414141"
                + "4141414141414141414141414141414141414141414141414141414141414141414141414"
                + "1414141414141414141414141414141414141414141414141414141414141414141414141"
                + "41414141414141414141414141414141")},});
  }

}
