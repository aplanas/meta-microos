SUMMARY = "A package for handling numpy arrays with units"
DESCRIPTION = "A package for handling numpy arrays with units. \
 \
Often writing code that deals with data that has units can be confusing. A \
function might return an array but at least with plain NumPy arrays, there is no \
way to easily tell what the units of the data are without somehow knowing *a \
priori*."
LICENSE = "BSD-3-Clause"

PV = "2.9.4"

RPM_NAME = "python39-unyt-2.9.4-1.3.noarch.rpm"
RPM_HASH = "8ec0ef1cfd34e43a12452786e72cba17f9e66df8b31d09d552616f84bf71d744b7cba22020e6fd2d3abe90d8e82e7c968716f64eb1bb2521c11e38c4f6babe7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(unyt) python39-unyt python3dist(unyt)"
RDEPENDS:${PN} += "python(abi) python39-numpy python39-packaging python39-sympy"

inherit rpm
