SUMMARY = "Character Tables and Tokenizer for Mathics and the Wolfram Language"
DESCRIPTION = "Character Tables and Tokenizer for Mathics and the Wolfram Language."
LICENSE = "GPL-3.0-only"

PV = "1.3.0"

RPM_NAME = "python39-Mathics-Scanner-1.3.0-1.1.noarch.rpm"
RPM_HASH = "67d2c119b8db4a6dd2be38835b76c62b6e41a87ad865f735916fdaf15bd8f90a4b183183f2d5e5b6818e1ad625304b39e7b0792d549d07bb4862402eb84f7e03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(mathics-scanner) python39-Mathics-Scanner python3dist(mathics-scanner)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3 /usr/bin/python3.9 python(abi) python39-PyYAML python39-chardet python39-click update-alternatives"

inherit rpm
