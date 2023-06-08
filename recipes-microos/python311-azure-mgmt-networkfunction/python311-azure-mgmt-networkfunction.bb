SUMMARY = "Microsoft Azure Networkfunction Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Networkfunction Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python311-azure-mgmt-networkfunction-1.0.0~b1-1.3.noarch.rpm"
RPM_HASH = "42cc4b7350c1460faf972fa878f9f55c8a0303008a3be0ce999a9cd8e5733867c76b35c4fcaf801a77f7ced224e0c29c758ac90250d9a82c5be1280f74920f33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-networkfunction) python311-azure-mgmt-networkfunction python3dist(azure-mgmt-networkfunction)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) python(abi) python311-azure-common python311-azure-mgmt-core python311-azure-mgmt-nspkg python311-azure-nspkg python311-msrest"

inherit rpm
