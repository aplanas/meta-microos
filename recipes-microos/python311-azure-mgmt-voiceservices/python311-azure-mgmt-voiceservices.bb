SUMMARY = "Microsoft Azure Voiceservices Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Voiceservices Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python311-azure-mgmt-voiceservices-1.0.0~b1-1.2.noarch.rpm"
RPM_HASH = "482a9a8e2e5a5f188d5e4707e4e0e1c85949eee0d67893eb9f3d228ab0d7e31c391dc9042d8e991d73665e20ef16a2e95fe056b72e8f199844c2ef93d0f34b14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-voiceservices) python311-azure-mgmt-voiceservices python3dist(azure-mgmt-voiceservices)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) python(abi) python311-azure-common python311-azure-mgmt-core python311-azure-mgmt-nspkg python311-azure-nspkg python311-msrest"

inherit rpm
