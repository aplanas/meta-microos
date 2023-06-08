SUMMARY = "Python tools to interact with SAP HANA utilities"
DESCRIPTION = "API to expose SAP HANA functionalities"
LICENSE = "Apache-2.0"

PV = "0.3.13+git.1673855974.f208fad"

RPM_NAME = "python311-shaptools-0.3.13+git.1673855974.f208fad-1.4.noarch.rpm"
RPM_HASH = "a3869f30b623eee4bb80844957f186dbbc48d18a3dcc7ba56420fdaceaf6c765bfa4ad9fc17cdffd96f4055328e878eef2f61b312e6716ea7ef859715b86db5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(shaptools) python311-shaptools python3dist(shaptools)"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/python3.11 python(abi) update-alternatives"

inherit rpm
