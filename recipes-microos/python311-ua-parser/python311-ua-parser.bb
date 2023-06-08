SUMMARY = "Python Implementation of UA Parser"
DESCRIPTION = "A python implementation of the UA Parser (https://github.com/ua-parser, formerly \
https://github.com/tobie/ua-parser)"
LICENSE = "Apache-2.0"

PV = "0.16.1"

RPM_NAME = "python311-ua-parser-0.16.1-1.3.noarch.rpm"
RPM_HASH = "62bc821a5eb6f3b5282490e961043594207217f120c221f220aac2a46b82f4a6e514f643bc27f50d3f6ff87ef0d0fc7637042fd34062d1551553b6bc1eb029cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ua-parser) python311-ua-parser python3dist(ua-parser)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
