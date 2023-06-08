SUMMARY = "Microsoft Azure Service Fabric Client Library"
DESCRIPTION = "This is the Microsoft Azure Service Fabric Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "8.2.0.0"

RPM_NAME = "python311-azure-servicefabric-8.2.0.0-1.8.noarch.rpm"
RPM_HASH = "a9bd1d11fb75d72e9eaed5a4cbde5285db3d872a1556c30524b3eba176fb2e868284116b73e4750e10c11789cd23206010cdf57ec5f49c71bfb30bac8a8927da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-servicefabric) python311-azure-servicefabric python3dist(azure-servicefabric)"
RDEPENDS:${PN} += "python(abi) python311-azure-common python311-azure-nspkg python311-msrest"

inherit rpm
