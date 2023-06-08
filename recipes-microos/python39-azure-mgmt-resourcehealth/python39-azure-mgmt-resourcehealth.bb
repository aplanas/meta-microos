SUMMARY = "Microsoft Azure ResourceHealth Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure ResourceHealth Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b3"

RPM_NAME = "python39-azure-mgmt-resourcehealth-1.0.0b3-1.3.noarch.rpm"
RPM_HASH = "86253533416315d88a9065ce1751d99103e40257c134487b3c8aba427ea8ccfa9cbaf05c8a8e4dac00e9176390125ec66d4a39d0e6c61cb947fdfbc19d5f70af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-resourcehealth) python39-azure-mgmt-resourcehealth python3dist(azure-mgmt-resourcehealth)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-msrest"

inherit rpm
