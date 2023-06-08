SUMMARY = "Microsoft Azure Video Analyzer Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Video Analyzer Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b4"

RPM_NAME = "python310-azure-mgmt-videoanalyzer-1.0.0b4-1.5.noarch.rpm"
RPM_HASH = "420ba290c8ac7132c6b2470f9a9f9f8621eab4d8a51d5808d98b5a7b7f41cf201ef1e1b8e244d87a5aa422bd6d887e0ebefe2514d3ea4bdc5ca7165e9463cac6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-videoanalyzer python3.10dist(azure-mgmt-videoanalyzer) python310-azure-mgmt-videoanalyzer python3dist(azure-mgmt-videoanalyzer)"
RDEPENDS:${PN} += "python(abi) python310-azure-common python310-azure-mgmt-core python310-azure-mgmt-nspkg python310-azure-nspkg python310-msrest"

inherit rpm
