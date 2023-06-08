SUMMARY = "Transport classes and utilities shared among Python Elastic client libraries"
DESCRIPTION = "Transport classes and utilities shared among Python Elastic client libraries"
LICENSE = "Apache-2.0"

PV = "8.4.0"

RPM_NAME = "python310-elastic-transport-8.4.0-3.1.noarch.rpm"
RPM_HASH = "58bcf30a076f71f5b32c14dec5d67a427cb751e94666ed5324fb882fae188bcd176e3dcf20381351be36f75eb268fa732b4d4a96cec1a263a07b0f67968fa80d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-elastic-transport python3.10dist(elastic-transport) python310-elastic-transport python3dist(elastic-transport)"
RDEPENDS:${PN} += "(python310-urllib3 >= 1.26.2 with python310-urllib3 < 2) python(abi) python310-certifi"

inherit rpm
