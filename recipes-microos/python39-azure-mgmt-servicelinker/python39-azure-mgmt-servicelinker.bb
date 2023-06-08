SUMMARY = "Microsoft Azure Servicelinker Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Servicelinker Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.2.0~b1"

RPM_NAME = "python39-azure-mgmt-servicelinker-1.2.0~b1-1.3.noarch.rpm"
RPM_HASH = "487f75a9eedb12d83cba24b26d7f19b7378083a9a5812b26a519ef7fc511e41c9cd12ce261e885d37040beffdb1adc81ab869b369389528f6fc0d727573b3ae6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-servicelinker) python39-azure-mgmt-servicelinker python3dist(azure-mgmt-servicelinker)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-msrest"

inherit rpm
