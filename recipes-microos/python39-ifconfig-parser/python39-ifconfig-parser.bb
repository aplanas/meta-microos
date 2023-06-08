SUMMARY = "Python package for parsing raw output of ifconfig"
DESCRIPTION = "Python package for parsing raw output of ifconfig."
LICENSE = "MIT"

PV = "0.0.5"

RPM_NAME = "python39-ifconfig-parser-0.0.5-1.14.noarch.rpm"
RPM_HASH = "5612096eadd3cb5977e8858e1ff495143a268ce18bf04b59f4e9a064e573fcb7b2335bdf9be3304ac01ddc0dce87824a20a5dd78c210764bea607936635b7dfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ifconfig-parser) python39-ifconfig-parser python3dist(ifconfig-parser)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
