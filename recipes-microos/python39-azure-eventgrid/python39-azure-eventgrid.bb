SUMMARY = "Microsoft Azure Event Grid Client Library"
DESCRIPTION = "This is the Microsoft Azure Event Grid Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.11.0"

RPM_NAME = "python39-azure-eventgrid-4.11.0-1.1.noarch.rpm"
RPM_HASH = "92833995f4f38e20a0e8ab8922147db4ca00d72837fa8e2bd092aaa41dd6f4e8d44ee8d47fc05d3acbf69985ebfe019351941c8b00922092c78634925a2775e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-eventgrid) python39-azure-eventgrid python3dist(azure-eventgrid)"
RDEPENDS:${PN} += "python(abi) python39-azure-core python39-azure-nspkg python39-isodate"

inherit rpm
