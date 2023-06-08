SUMMARY = "Microsoft Azure Guestconfig Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Guestconfig Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python311-azure-mgmt-guestconfig-1.0.0b2-1.3.noarch.rpm"
RPM_HASH = "5609e6287c847030327bb8afd5da3ff84a511f041fec59b193de4622f371fb8c4de8b4fe89c6484d590a51c47f448f3fee986a0175ce5559f5fabf75d68ab261"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-guestconfig) python311-azure-mgmt-guestconfig python3dist(azure-mgmt-guestconfig)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) python(abi) python311-azure-common python311-azure-mgmt-core python311-azure-mgmt-nspkg python311-azure-nspkg python311-msrest"

inherit rpm
