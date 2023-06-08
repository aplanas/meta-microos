SUMMARY = "Full featured consistent hashing python library compatible with ketama"
DESCRIPTION = "Full featured consistent hashing python library compatible with ketama."
LICENSE = "BSD-3-Clause"

PV = "2.3"

RPM_NAME = "python310-uhashring-2.3-1.1.noarch.rpm"
RPM_HASH = "68659cefb30651fb7218133afb1c05a6dc11e666f6eda96f6da34bf6f34f4e362651abc202776d81484fc63087f46f9b481c2a7e324857e7799c3774ef6ef8c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-uhashring python3.10dist(uhashring) python310-uhashring python3dist(uhashring)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
