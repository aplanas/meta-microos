SUMMARY = "The Python 'ana' module"
DESCRIPTION = "A Python module that provides an undocumented data layer for Python objects."
LICENSE = "BSD-2-Clause"

PV = "0.06"

RPM_NAME = "python310-ana-0.06-3.3.noarch.rpm"
RPM_HASH = "d5c295cc63429c0110f9192ca75e5ee2045a3eca4617d3d32349c91553c52430ea633ce66b9eb1106d6c53472829fa1adb7d90d3539cd507c23ff8581bfea800"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ana python3.10dist(ana) python310-ana python3dist(ana)"
RDEPENDS:${PN} += "python(abi) python310-future"

inherit rpm
