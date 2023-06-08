SUMMARY = "Module to compile Python 3.6+ code to Python 2.7+"
DESCRIPTION = "A module to compile Python 3.6+ code to Python 2.7+."
LICENSE = "MIT"

PV = "202107.1047"

RPM_NAME = "python310-lib3to6-202107.1047-2.4.noarch.rpm"
RPM_HASH = "863350277f3a51c214cd8becfdc358841e9a11b23fc95eaacd0ad3c6bafb2a063320a158fef4f7ffb95f1bf99d0cf7a2e74a69f1beb53cbf27645963aa2dcf7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-lib3to6 python3.10dist(lib3to6) python310-lib3to6 python3dist(lib3to6)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-astor python310-click python310-typing python310-wheel update-alternatives"

inherit rpm
