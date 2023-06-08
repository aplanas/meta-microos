SUMMARY = "A case-insensitive ordered dictionary for Python"
DESCRIPTION = "Class `NocaseDict`_ is a case-insensitive ordered dictionary that preserves \
the original lexical case of its keys."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.4"

RPM_NAME = "python39-nocasedict-1.0.4-1.3.noarch.rpm"
RPM_HASH = "0eb51ed4587216d2b38ddb34330dd6fb43833fdcbb66a322b70393344e2047096cd264c283899137fa52c3a115918d7eac2344d356eb82c9e2ba5055159e3c61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(nocasedict) python39-nocasedict python3dist(nocasedict)"
RDEPENDS:${PN} += "python(abi) python39-six"

inherit rpm
