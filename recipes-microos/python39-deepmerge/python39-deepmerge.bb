SUMMARY = "A toolset to deeply merge python dictionaries"
DESCRIPTION = "Python module to deeply merge python dictionaries."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "python39-deepmerge-0.1.0-1.12.noarch.rpm"
RPM_HASH = "bb851dfe10f1791ed810af1128d68a16671e1db382e57937ff3fd049cf2402929712bd42a4450baf99f85730ec93fc9b51bc6c1acc83058e24d0b8cf5e70d8fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(deepmerge) python39-deepmerge python3dist(deepmerge)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
