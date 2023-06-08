SUMMARY = "Microsoft Azure Azureadb2c Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Azureadb2c Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b1"

RPM_NAME = "python311-azure-mgmt-azureadb2c-1.0.0b1-1.11.noarch.rpm"
RPM_HASH = "328bb0e725fe5400b77338a0d54c56fa1757162ae9a15ec5cff3ede8d59b7889903457535ed5dd1e48176244b7c3e5b57bbb47ea4acd8cb38b7dae2c75e784d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-azureadb2c) python311-azure-mgmt-azureadb2c python3dist(azure-mgmt-azureadb2c)"
RDEPENDS:${PN} += "python(abi) python311-azure-common python311-azure-mgmt-core python311-azure-mgmt-nspkg python311-azure-nspkg python311-msrest"

inherit rpm
