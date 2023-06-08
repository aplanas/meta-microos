SUMMARY = "Template Text Parser"
DESCRIPTION = "TTP is a Python library for semi-structured text parsing using templates."
LICENSE = "MIT"

PV = "0.9.4"

RPM_NAME = "python311-ttp-0.9.4-1.1.noarch.rpm"
RPM_HASH = "d5768228bb47f4afea338c9d33b8ce2607ddb785379c0c26e04b4ff9191feb5dbb8daea68f84c3cb7b4115f72762e95e37eb54d28226eb47084e438c54f52a6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ttp) python311-ttp python3dist(ttp)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) update-alternatives"

inherit rpm
