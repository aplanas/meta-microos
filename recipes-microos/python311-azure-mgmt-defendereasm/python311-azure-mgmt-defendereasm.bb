SUMMARY = "Microsoft Azure Defendereasm Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Defendereasm Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python311-azure-mgmt-defendereasm-1.0.0~b1-1.2.noarch.rpm"
RPM_HASH = "e4b4cec2d5ba7db3fbc3d84987021ec7bf1617daca3b0dfe869a87b5d7e5ae348698912fafba766dedc42631038c4471e930aead8db5a23b9c21e5f2e488ed55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-defendereasm) \
python311-azure-mgmt-defendereasm \
python3dist(azure-mgmt-defendereasm)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) \
python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
