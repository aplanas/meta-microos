SUMMARY = "Microsoft Azure Video Analyzer Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Video Analyzer Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b4"

RPM_NAME = "python311-azure-mgmt-videoanalyzer-1.0.0b4-1.5.noarch.rpm"
RPM_HASH = "a59f87250d6cd0e28e17b1e6497bedd89c0f6e5c8a7245635bb8ffd470af836ccd3779ff007e786f1b95cdb12417bd10eac52db498c8cb055e138b43731b35dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-videoanalyzer) python311-azure-mgmt-videoanalyzer python3dist(azure-mgmt-videoanalyzer)"
RDEPENDS:${PN} += "python(abi) python311-azure-common python311-azure-mgmt-core python311-azure-mgmt-nspkg python311-azure-nspkg python311-msrest"

inherit rpm
