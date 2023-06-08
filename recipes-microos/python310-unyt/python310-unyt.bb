SUMMARY = "A package for handling numpy arrays with units"
DESCRIPTION = "A package for handling numpy arrays with units. \
 \
Often writing code that deals with data that has units can be confusing. A \
function might return an array but at least with plain NumPy arrays, there is no \
way to easily tell what the units of the data are without somehow knowing *a \
priori*."
LICENSE = "BSD-3-Clause"

PV = "2.9.4"

RPM_NAME = "python310-unyt-2.9.4-1.3.noarch.rpm"
RPM_HASH = "bea7dd679208f460282a59b800855ca1305e9038fb21bfd8288a5b3888ae4374e1ae38705ac7a853028aaab3c274bfc4a294d8b975e4f4d5f7eb8a5c09850649"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-unyt python3.10dist(unyt) python310-unyt python3dist(unyt)"
RDEPENDS:${PN} += "python(abi) python310-numpy python310-packaging python310-sympy"

inherit rpm
