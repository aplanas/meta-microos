SUMMARY = "Microsoft Azure ResourceHealth Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure ResourceHealth Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b3"

RPM_NAME = "python311-azure-mgmt-resourcehealth-1.0.0b3-1.3.noarch.rpm"
RPM_HASH = "2861232c640e0e805f71f28b389c3b62ca0f18811981b18f52dbe23380543cf2a4f0a7174d59e9840a1c46e5df25112f256269d30c9a6635ef34d63703380253"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-resourcehealth) python311-azure-mgmt-resourcehealth python3dist(azure-mgmt-resourcehealth)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) python(abi) python311-azure-common python311-azure-mgmt-core python311-azure-mgmt-nspkg python311-azure-nspkg python311-msrest"

inherit rpm
