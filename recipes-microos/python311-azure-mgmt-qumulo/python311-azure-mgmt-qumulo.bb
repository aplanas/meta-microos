SUMMARY = "Microsoft Azure Qumulo Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Qumulo Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python311-azure-mgmt-qumulo-1.0.0~b1-1.1.noarch.rpm"
RPM_HASH = "99a34c564270e3e213a2738d4e234ce0734566a152936d9e5c8499284d11f0a3380e901b27d66826ece27a7d69b9910fa9594a192e786d0bac1c73b79757a01e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-qumulo) python311-azure-mgmt-qumulo python3dist(azure-mgmt-qumulo)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) python(abi) python311-azure-common python311-azure-mgmt-core python311-azure-mgmt-nspkg python311-azure-nspkg python311-isodate"

inherit rpm
