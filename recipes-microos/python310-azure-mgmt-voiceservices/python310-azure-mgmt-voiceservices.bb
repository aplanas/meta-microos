SUMMARY = "Microsoft Azure Voiceservices Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Voiceservices Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python310-azure-mgmt-voiceservices-1.0.0~b1-1.2.noarch.rpm"
RPM_HASH = "40f243466c8f77b06c862e455dcf35858d1d59cea89e91bef60737bec7d12e7ae647312be58692cc615bf5516466a8991632dd671af706c813a082c7a0cf8e7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-voiceservices python3.10dist(azure-mgmt-voiceservices) python310-azure-mgmt-voiceservices python3dist(azure-mgmt-voiceservices)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) python(abi) python310-azure-common python310-azure-mgmt-core python310-azure-mgmt-nspkg python310-azure-nspkg python310-msrest"

inherit rpm
