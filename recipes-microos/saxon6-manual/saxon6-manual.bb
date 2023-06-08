SUMMARY = "Manual for saxon6"
DESCRIPTION = "Manual for saxon6."
LICENSE = "MPL-1.0"

PV = "6.5.5"

RPM_NAME = "saxon6-manual-6.5.5-16.6.noarch.rpm"
RPM_HASH = "207130c7bbf57965726f8200e871377e3b7b5a9c0c927a025add5b2b631cf1b465a67b96dab9b9c5606b5e3b74b8b20b8a5751487e5c947bea7580de6c74e2b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "saxon6-manual"
RDEPENDS:${PN} += ""

inherit rpm
