SUMMARY = "Microsoft Azure Event Grid Client Library"
DESCRIPTION = "This is the Microsoft Azure Event Grid Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.11.0"

RPM_NAME = "python311-azure-eventgrid-4.11.0-1.1.noarch.rpm"
RPM_HASH = "946e62634ce36e36909cb4c47cffd60cbf0f0d058abe4ee3bb9bf2ea2075f73348423e6d68546f05294950521e9dde355f5b985441fca02fefa911bd97127d0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-eventgrid) python311-azure-eventgrid python3dist(azure-eventgrid)"
RDEPENDS:${PN} += "python(abi) python311-azure-core python311-azure-nspkg python311-isodate"

inherit rpm
