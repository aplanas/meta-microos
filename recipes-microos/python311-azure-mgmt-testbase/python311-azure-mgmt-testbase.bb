SUMMARY = "Microsoft Azure Testbase Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Testbase Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python311-azure-mgmt-testbase-1.0.0b2-1.3.noarch.rpm"
RPM_HASH = "1e579381f7c095916bf0f8ea0b2c6688b2751d88f19c23a3d3022bf29ab7013af479ab75e222bb035b144dfeedb2614f2595df9fdd7107eb9f910643628f1d5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-testbase) \
python311-azure-mgmt-testbase \
python3dist(azure-mgmt-testbase)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) \
python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
