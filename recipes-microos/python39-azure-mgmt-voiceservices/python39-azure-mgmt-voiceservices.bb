SUMMARY = "Microsoft Azure Voiceservices Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Voiceservices Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python39-azure-mgmt-voiceservices-1.0.0~b1-1.2.noarch.rpm"
RPM_HASH = "0473be5ae6d0e250f4411c9a4e2b135ef16ebfbf8c0db0ffc495d5e56a92d794e12bcaa4df991e28b1b5f00e6525a4043b4e111431e71483ec7d5cec6d145bba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-voiceservices) python39-azure-mgmt-voiceservices python3dist(azure-mgmt-voiceservices)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-msrest"

inherit rpm
