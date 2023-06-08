SUMMARY = "Microsoft Azure DataBox Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure DataBox Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-databox-1.0.0.0-1.8.noarch.rpm"
RPM_HASH = "ea617ddbae24523fc2b59972e5a99df1d5e3a94db57c8b12f2f4c28bb0a2b6beb3b920eb6a772fa75c3996d52b32c8bee6923d64eebd4cd674c9ce069ecbe2da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-databox) python311-azure-mgmt-databox python3dist(azure-mgmt-databox)"
RDEPENDS:${PN} += "python(abi) python311-azure-common python311-azure-mgmt-core python311-azure-mgmt-nspkg python311-azure-nspkg python311-msrest"

inherit rpm
