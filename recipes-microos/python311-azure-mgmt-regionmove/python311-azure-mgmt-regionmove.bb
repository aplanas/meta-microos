SUMMARY = "Microsoft Azure MyService Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b1"

RPM_NAME = "python311-azure-mgmt-regionmove-1.0.0b1-2.11.noarch.rpm"
RPM_HASH = "65eb2564eecec39790e9d400270d17320799cddde20c6d44546223ca97ce9366f117bfdb1969775fde0daaf8d325fc0ad8ff4eaeac8ab32168e909f09b8f5f80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-regionmove) \
python311-azure-mgmt-regionmove \
python3dist(azure-mgmt-regionmove)"
RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest \
python311-msrestazure"

inherit rpm
