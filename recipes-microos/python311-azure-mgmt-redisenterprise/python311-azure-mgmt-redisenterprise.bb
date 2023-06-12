SUMMARY = "Microsoft Azure Redis Enterprise Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Redis Enterprise Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-azure-mgmt-redisenterprise-2.0.0-1.6.noarch.rpm"
RPM_HASH = "2116f9374baac4e1efe460f8a7f354908e118f10ac1d3275d56c934f50d27fd6844405645bb4fbcc271d6da66a5d1f9d49bfea7e5152c84a1937bed3a0353c0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-redisenterprise) \
python311-azure-mgmt-redisenterprise \
python3dist(azure-mgmt-redisenterprise)"
RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
