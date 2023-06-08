SUMMARY = "Python Promises"
DESCRIPTION = "Promises implementation for python."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "python310-vine-5.0.0-2.3.noarch.rpm"
RPM_HASH = "1e72ac51b0f222a32d3f93fe55323720e93a915ad8a4ab2af3cd6708f3437f4cfae7f961d0fa6113d9723a9a6de6bff90a73f53f636b22c19961bdcd4edacba9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-vine python3.10dist(vine) python310-vine python3dist(vine)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
