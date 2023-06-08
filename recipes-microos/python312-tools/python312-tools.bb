SUMMARY = "Python Utility and Demonstration Scripts"
DESCRIPTION = "A number of scripts that are useful for building, testing or extending Python, \
and a set of demonstration programs."
LICENSE = "Python-2.0"

PV = "3.12.0a7"

RPM_NAME = "python312-tools-3.12.0a7-1.2.aarch64.rpm"
RPM_HASH = "5ea4661661650cc7e7398c74e4e701d5e0784f905189b6305f5379b58aea9294ece16800ef131eb8d07ad82d2e5b9fcf446a3102df97277ccfab476d5e996773"

RPROVIDES:${PN} += "python312-2to3 python312-demo python312-tools python312-tools(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3.12 python(abi) python312-base"

inherit rpm
