SUMMARY = "Microsoft Azure Voiceservices Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Voiceservices Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-mgmt-voiceservices-1.0.0-1.1.noarch.rpm"
RPM_HASH = "460e23baff0481b43719a006e9928d390f866d2c5c0f6300714b01a4e28abfdc8c86540a8f399abbe8e5bf819743ba0a272a394ce5a749e4da35992fcbd86445"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-voiceservices) \
python311-azure-mgmt-voiceservices \
python3dist(azure-mgmt-voiceservices)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) \
python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
