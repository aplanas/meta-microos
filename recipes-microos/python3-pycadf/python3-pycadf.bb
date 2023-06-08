SUMMARY = "DMTF Cloud Audit (CADF) data model"
DESCRIPTION = "DMTF Cloud Audit (CADF) data model \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "3.1.1"

RPM_NAME = "python3-pycadf-3.1.1-2.5.noarch.rpm"
RPM_HASH = "f6a54dac0fdc1e6044a1090cc83e58e271b08ce11a5d47d055d30e915b54f802d7c0fd8a83e7483dceaaf658962d92cac2a9a312bd498192b7523e715d2fb105"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pycadf python3.10dist(pycadf) python3dist(pycadf)"
RDEPENDS:${PN} += "python(abi) python-pycadf-common python3-debtcollector python3-oslo.config python3-oslo.serialization python3-pytz python3-six"

inherit rpm
