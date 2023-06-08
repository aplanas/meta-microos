SUMMARY = "Python interface for AWS"
DESCRIPTION = "A low-level interface to a growing number of Amazon Web Services."
LICENSE = "Apache-2.0"

PV = "1.29.115"

RPM_NAME = "python311-botocore-1.29.115-1.1.noarch.rpm"
RPM_HASH = "cf521b46aef033b683699c7ab284813366f75fcf18421043ce3cc494b9d629966287c4791f282e89e8704866011f807a448b17dcd5058cf4e5e16c810d4e35aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(botocore) python311-botocore python3dist(botocore)"
RDEPENDS:${PN} += "(python311-jmespath >= 0.7.1 with python311-jmespath < 2.0.0) (python311-python-dateutil >= 2.1 with python311-python-dateutil < 3.0.0) (python311-urllib3 >= 1.25.4 with python311-urllib3 < 1.27) python(abi) python311-requests"

inherit rpm
