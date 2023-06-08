SUMMARY = "Microsoft Azure Service Fabric Client Library"
DESCRIPTION = "This is the Microsoft Azure Service Fabric Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "8.2.0.0"

RPM_NAME = "python310-azure-servicefabric-8.2.0.0-1.8.noarch.rpm"
RPM_HASH = "c212fb27b5a632e53112c13a596edc17f0ff2776a7797749a1d8475050fb249219b2e666f7234e4d887d6fa98286961a39b6ea141f022f5b5a8405b3102a3ebf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-servicefabric python3.10dist(azure-servicefabric) python310-azure-servicefabric python3dist(azure-servicefabric)"
RDEPENDS:${PN} += "python(abi) python310-azure-common python310-azure-nspkg python310-msrest"

inherit rpm
