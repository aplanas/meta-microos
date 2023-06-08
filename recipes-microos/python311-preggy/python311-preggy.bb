SUMMARY = "Assertion library for Python"
DESCRIPTION = "preggy is an assertion library for Python. (What were you ``expect()``ing?) \
Part of the pyVows test framework."
LICENSE = "MIT"

PV = "1.4.4"

RPM_NAME = "python311-preggy-1.4.4-2.12.noarch.rpm"
RPM_HASH = "06180c9ad9de255e4700b6895c314a6aad762b111fe9d2a89d421aaf2b759b51610b6dd828cfd4a36cbd5c75a51facc3185596a619f2cbc1b54fa206eef347eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(preggy) python311-preggy python3dist(preggy)"
RDEPENDS:${PN} += "python(abi) python311-Unidecode python311-six"

inherit rpm
