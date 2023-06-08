SUMMARY = "Microsoft Azure Education Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Education Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0~b2"

RPM_NAME = "python310-azure-mgmt-education-1.0.0~b2-1.3.noarch.rpm"
RPM_HASH = "eb027ef8fdb973d665c7b55873095e46dc1f69b9dddff517de19fe627aba7915d8b0607c79327ef910830541fd77a7e36b7cfcee9822bebe97200299fa3898e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-education python3.10dist(azure-mgmt-education) python310-azure-mgmt-education python3dist(azure-mgmt-education)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) python(abi) python310-azure-common python310-azure-mgmt-core python310-azure-mgmt-nspkg python310-azure-nspkg python310-msrest"

inherit rpm
