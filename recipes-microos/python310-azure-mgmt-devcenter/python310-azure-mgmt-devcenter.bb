SUMMARY = "Microsoft Azure Devcenter Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Devcenter Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0b4"

RPM_NAME = "python310-azure-mgmt-devcenter-1.0.0b4-1.3.noarch.rpm"
RPM_HASH = "358a014bba1370af1ab11c963d8ffe86c2eec675f7cbb810a0f4fc729f9f21776e938422f67e60c431727f9ff3b4400a0a741c3a783554cc2331a2a126790700"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-devcenter python3.10dist(azure-mgmt-devcenter) python310-azure-mgmt-devcenter python3dist(azure-mgmt-devcenter)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) python(abi) python310-azure-common python310-azure-mgmt-core python310-azure-mgmt-nspkg python310-azure-nspkg python310-msrest"

inherit rpm
