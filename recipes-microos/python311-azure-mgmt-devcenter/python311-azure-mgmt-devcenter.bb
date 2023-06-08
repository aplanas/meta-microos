SUMMARY = "Microsoft Azure Devcenter Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Devcenter Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0b4"

RPM_NAME = "python311-azure-mgmt-devcenter-1.0.0b4-1.3.noarch.rpm"
RPM_HASH = "66d83e8dc33bab235bf43f5b8df02a460752715ff502d032a390869387d1828802453538f4a4a75cefa3b676e90b29760a520a1a9b2636de060a8d3a12680c27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-devcenter) python311-azure-mgmt-devcenter python3dist(azure-mgmt-devcenter)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) python(abi) python311-azure-common python311-azure-mgmt-core python311-azure-mgmt-nspkg python311-azure-nspkg python311-msrest"

inherit rpm
