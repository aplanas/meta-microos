SUMMARY = "A package for handling numpy arrays with units"
DESCRIPTION = "A package for handling numpy arrays with units. \
 \
Often writing code that deals with data that has units can be confusing. A \
function might return an array but at least with plain NumPy arrays, there is no \
way to easily tell what the units of the data are without somehow knowing *a \
priori*."
LICENSE = "BSD-3-Clause"

PV = "2.9.4"

RPM_NAME = "python311-unyt-2.9.4-1.3.noarch.rpm"
RPM_HASH = "d8b2960d9fb0d3b415bede0c026c89378aa22b37f9b1e48a87e1b1f2f21e4e440533d6467d310d4e9654a029c66621b40bb7f6745ba95e01d3db3e7d5798685b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(unyt) python311-unyt python3dist(unyt)"
RDEPENDS:${PN} += "python(abi) python311-numpy python311-packaging python311-sympy"

inherit rpm
