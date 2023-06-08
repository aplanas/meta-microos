SUMMARY = "A case-insensitive list for Python"
DESCRIPTION = "Class `NocaseList`_ is a case-insensitive list that preserves the lexical case \
of its items."
LICENSE = "Apache-2.0"

PV = "1.0.6"

RPM_NAME = "python310-nocaselist-1.0.6-1.3.noarch.rpm"
RPM_HASH = "c893415cf9336a3117a0bac94e4744547c48862996d656aceb874d24fa182d4aa3d4de53a8c937d2d1ec8be3b180efeeacefc33aa37d32389c5f7c5ea25bf5e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nocaselist python3.10dist(nocaselist) python310-nocaselist python3dist(nocaselist)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
