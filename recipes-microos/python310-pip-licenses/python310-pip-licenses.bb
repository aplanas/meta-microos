SUMMARY = "Python packages license list"
DESCRIPTION = "Dump the software license list of Python packages installed with pip."
LICENSE = "MIT"

PV = "4.3.1"

RPM_NAME = "python310-pip-licenses-4.3.1-1.1.noarch.rpm"
RPM_HASH = "91aaa0ccf6eeaa89cd4bed9c923287097b18dbd8f58c66160a2ee79b3559a14e8d0fbf49eb3b35b2b7687aa6c835d1c3f1880b8bc0da138d0d71c34e44d362eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pip-licenses python3.10dist(pip-licenses) python310-pip-licenses python3dist(pip-licenses)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-PrettyTable python310-pip update-alternatives"

inherit rpm
