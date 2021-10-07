@Form @152 @Graduate
Feature: admission/graduate-school/mba/
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
      | gradForm                                              | program  | term     | thankYou                                                       |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1184 | tfa_1042 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1184 | tfa_1089 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1184 | tfa_1042 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1184 | tfa_1089 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1184 | tfa_1186 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1184 | tfa_1196 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1184 | tfa_1219 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1184 | tfa_1220 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1184 | tfa_1257 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1184 | tfa_1263 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1043 | tfa_1100 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1043 | tfa_1101 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1043 | tfa_1102 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1043 | tfa_1103 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1043 | tfa_1187 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1043 | tfa_1188 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1043 | tfa_1197 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1043 | tfa_1221 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1043 | tfa_1222 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1043 | tfa_1223 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1043 | tfa_1252 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1043 | tfa_1259 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1208 | tfa_1217 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1208 | tfa_1224 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1208 | tfa_1225 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1208 | tfa_1226 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1208 | tfa_1227 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1208 | tfa_1228 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1208 | tfa_1229 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1208 | tfa_1230 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1208 | tfa_1231 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1208 | tfa_1232 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1208 | tfa_1253 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1208 | tfa_1259 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1117 | tfa_1121 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1117 | tfa_1189 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1117 | tfa_1233 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1117 | tfa_1250 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1123 | tfa_1127 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1123 | tfa_1198 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1123 | tfa_1234 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1123 | tfa_1264 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1052 | tfa_1055 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1052 | tfa_1056 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1052 | tfa_1200 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1052 | tfa_1235 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1058 | tfa_1062 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1058 | tfa_1202 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1058 | tfa_1236 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1058 | tfa_1265 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1064 | tfa_1068 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1064 | tfa_1203 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1064 | tfa_1237 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1064 | tfa_1266 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1070 | tfa_1074 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1070 | tfa_1204 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1070 | tfa_1238 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1070 | tfa_1267 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1213 | tfa_1239 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1213 | tfa_1240 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1213 | tfa_1241 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1213 | tfa_1242 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1213 | tfa_1243 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1213 | tfa_1244 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1213 | tfa_1245 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1213 | tfa_1254 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1076 | tfa_1152 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1076 | tfa_1153 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1076 | tfa_1154 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1076 | tfa_1155 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1076 | tfa_1192 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1076 | tfa_1193 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1076 | tfa_1206 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1076 | tfa_1249 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1076 | tfa_1250 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1076 | tfa_1251 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1076 | tfa_1255 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1076 | tfa_1261 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1157 | tfa_1165 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1157 | tfa_1166 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1157 | tfa_1167 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1157 | tfa_1168 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1157 | tfa_1194 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1157 | tfa_1195 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1157 | tfa_1207 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1157 | tfa_1246 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1157 | tfa_1247 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1157 | tfa_1248 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1157 | tfa_1256 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
      | https://www.babson.edu/academics/graduate-school/mba/ | tfa_1157 | tfa_1262 | https://www.babson.edu/academics/graduate-school/mba/thank-you |
