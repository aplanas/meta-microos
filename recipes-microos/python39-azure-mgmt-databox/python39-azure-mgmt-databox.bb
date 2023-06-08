SUMMARY = "Microsoft Azure DataBox Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure DataBox Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-databox-1.0.0.0-1.8.noarch.rpm"
RPM_HASH = "fc204d954543eac06c7329ec4859074317a295a25ee5857a0e10966db8f8e82f7e2d857c7216589bc2c0700c85578fe0524783458fd2c664cc2aeb7c845c4252"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-databox) python39-azure-mgmt-databox python3dist(azure-mgmt-databox)"
RDEPENDS:${PN} += "python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-msrest"

inherit rpm
