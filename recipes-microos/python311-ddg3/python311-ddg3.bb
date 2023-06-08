SUMMARY = "Library for querying the Duck Duck Go API"
DESCRIPTION = "A Python3 library for querying the Duck Duck Go API."
LICENSE = "BSD-3-Clause"

PV = "0.6.6git~20170824T092521~0ef6b2f"

RPM_NAME = "python311-ddg3-0.6.6git~20170824T092521~0ef6b2f-2.13.noarch.rpm"
RPM_HASH = "27258dc647c2f7c1bd19e33ccc8418a35f2d43c402216b42948536b81bc22057912f1c37f77ef5fbe91e2d1a0883229a478741172eae8474ac3bd93fb93bfffa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ddg3) python311-ddg3 python3dist(ddg3)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-requests update-alternatives"

inherit rpm
