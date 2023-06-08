SUMMARY = "Microsoft Azure Resource Mover Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Resource Mover Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.1.0b3"

RPM_NAME = "python39-azure-mgmt-resourcemover-1.1.0b3-1.3.noarch.rpm"
RPM_HASH = "6a442e24ed41af44cd821c3a73dad2d448c8ca5c4117ca1a6a0373697827aa599eb8a239090bf68008165f92f09c1d9cdfd0c7e8de4c579967c2030eadb0fbdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-resourcemover) python39-azure-mgmt-resourcemover python3dist(azure-mgmt-resourcemover)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-msrest"

inherit rpm
