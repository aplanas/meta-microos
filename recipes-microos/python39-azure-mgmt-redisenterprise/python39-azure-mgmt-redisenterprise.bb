SUMMARY = "Microsoft Azure Redis Enterprise Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Redis Enterprise Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-azure-mgmt-redisenterprise-2.0.0-1.6.noarch.rpm"
RPM_HASH = "814cf058e1620b9f80a6cf29e3f7720f5d85c0a686897e3e1810eea9fa60bee98b92dd47f7553f1b38b46050267d8ea57238305b5f8cfb2b75aa60f487d40763"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-redisenterprise) python39-azure-mgmt-redisenterprise python3dist(azure-mgmt-redisenterprise)"
RDEPENDS:${PN} += "python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-msrest"

inherit rpm
