@Form @152 @Graduate
Feature: admission/graduate-school/request-information/
  I want to submit and verify form submits with the correct data

  @Grad @152
  Scenario Outline: Submit Grad form
    Given I am on grad "<gradForm>" page
    When I close the privacy policy popup
    And I input the first name last name and email for the form
    And I select a program "<program>"
    And I select a term "<term>"
    And I input the grad phone number
    And I select a grad country
    And I select a state
    And I input a city
    And I input the zip code
    And I click the grad submit button
    Then I am on the correct "<thankYou>" page

    Examples: 
      | gradForm                                                             | program  | term     | thankYou                                                                      |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1184 | tfa_1042 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1184 | tfa_1089 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1184 | tfa_1042 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1184 | tfa_1089 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1184 | tfa_1186 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1184 | tfa_1196 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1184 | tfa_1219 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1184 | tfa_1220 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1184 | tfa_1257 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1184 | tfa_1263 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1043 | tfa_1100 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1043 | tfa_1101 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1043 | tfa_1102 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1043 | tfa_1103 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1043 | tfa_1187 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1043 | tfa_1188 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1043 | tfa_1197 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1043 | tfa_1221 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1043 | tfa_1222 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1043 | tfa_1223 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1043 | tfa_1252 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1043 | tfa_1259 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1208 | tfa_1217 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1208 | tfa_1224 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1208 | tfa_1225 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1208 | tfa_1226 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1208 | tfa_1227 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1208 | tfa_1228 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1208 | tfa_1229 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1208 | tfa_1230 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1208 | tfa_1231 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1208 | tfa_1232 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1208 | tfa_1253 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1208 | tfa_1259 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1117 | tfa_1121 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1117 | tfa_1189 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1117 | tfa_1233 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1117 | tfa_1250 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1123 | tfa_1127 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1123 | tfa_1198 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1123 | tfa_1234 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1123 | tfa_1264 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1052 | tfa_1055 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1052 | tfa_1056 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1052 | tfa_1200 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1052 | tfa_1235 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1058 | tfa_1062 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1058 | tfa_1202 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1058 | tfa_1236 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1058 | tfa_1265 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1064 | tfa_1068 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1064 | tfa_1203 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1064 | tfa_1237 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1064 | tfa_1266 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1070 | tfa_1074 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1070 | tfa_1204 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1070 | tfa_1238 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1070 | tfa_1267 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1213 | tfa_1239 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1213 | tfa_1240 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1213 | tfa_1241 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1213 | tfa_1242 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1213 | tfa_1243 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1213 | tfa_1244 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1213 | tfa_1245 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1213 | tfa_1254 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1076 | tfa_1152 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1076 | tfa_1153 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1076 | tfa_1154 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1076 | tfa_1155 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1076 | tfa_1192 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1076 | tfa_1193 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1076 | tfa_1206 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1076 | tfa_1249 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1076 | tfa_1250 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1076 | tfa_1251 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1076 | tfa_1255 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1076 | tfa_1261 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1157 | tfa_1165 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1157 | tfa_1166 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1157 | tfa_1167 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1157 | tfa_1168 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1157 | tfa_1194 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1157 | tfa_1195 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1157 | tfa_1207 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1157 | tfa_1246 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1157 | tfa_1247 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1157 | tfa_1248 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1157 | tfa_1256 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
      | http://www.babson.edu/admission/graduate-school/request-information/ | tfa_1157 | tfa_1262 | http://www.babson.edu/admission/graduate-school/request-information/thank-you |
