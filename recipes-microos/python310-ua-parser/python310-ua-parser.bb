SUMMARY = "Python Implementation of UA Parser"
DESCRIPTION = "A python implementation of the UA Parser (https://github.com/ua-parser, formerly \
https://github.com/tobie/ua-parser)"
LICENSE = "Apache-2.0"

PV = "0.16.1"

RPM_NAME = "python310-ua-parser-0.16.1-1.3.noarch.rpm"
RPM_HASH = "9eca071995b10d7fd41bc9904243907b2bf5d2118a4f7ff444b7dc2111d877c19e72f350e4faf8aa79d7d0096fda60c32a331196f7ce3959534885ca0a1370ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ua-parser \
python3.10dist(ua-parser) \
python310-ua-parser \
python3dist(ua-parser)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
