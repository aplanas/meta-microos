SUMMARY = "Microsoft Azure MyService Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-baremetalinfrastructure-1.0.0.0-1.8.noarch.rpm"
RPM_HASH = "34b0627253262e105533ed36d5c870a98e86f605ab9771bd5b3c5b6f9c8eae385caa2d25a2e0c241d4f8c8ed2453ba03ce1ba9f033557850b6e59bdee9ec8a5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-baremetalinfrastructure) python311-azure-mgmt-baremetalinfrastructure python3dist(azure-mgmt-baremetalinfrastructure)"
RDEPENDS:${PN} += "python(abi) python311-azure-common python311-azure-mgmt-core python311-azure-mgmt-nspkg python311-azure-nspkg python311-msrest"

inherit rpm
