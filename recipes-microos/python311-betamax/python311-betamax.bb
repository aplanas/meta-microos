SUMMARY = "A VCR imitation for python-requests"
DESCRIPTION = "Betamax is a VCR_ imitation for requests. This will make mocking out requests \
much easier."
LICENSE = "Apache-2.0"

PV = "0.8.1"

RPM_NAME = "python311-betamax-0.8.1-2.1.noarch.rpm"
RPM_HASH = "8753de3ffbc27101c9cf6f1390268edace25fbffa5766f56b7f9c705d44da66fb9428e76401693c7cdd2a542ae087bb056de84355a3911df160f4150566e104d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(betamax) python311-betamax python3dist(betamax)"
RDEPENDS:${PN} += "python(abi) python311-requests"

inherit rpm
