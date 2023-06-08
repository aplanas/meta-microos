SUMMARY = "Python sunset and sunrise time calculation"
DESCRIPTION = "Python sunset and sunrise time calculation library."
LICENSE = "LGPL-3.0-only"

PV = "1.2.5"

RPM_NAME = "python39-suntime-1.2.5-1.14.noarch.rpm"
RPM_HASH = "31a2d1ef945692800ac54f8a9195796d7fa92fd9a5f0f7409f28c76668b092820a987e359e1fe6442f179b8bb7a8c98f9444832d42c2350c88c8b33b244af584"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(suntime) python39-suntime python3dist(suntime)"
RDEPENDS:${PN} += "python(abi) python39-python-dateutil"

inherit rpm
