SUMMARY = "Microsoft Azure Event Grid Client Library"
DESCRIPTION = "This is the Microsoft Azure Event Grid Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.10.0"

RPM_NAME = "python39-azure-eventgrid-4.10.0-1.1.noarch.rpm"
RPM_HASH = "b25b419cbb1442a8a0a9c13032a6a397011af4a27cd2eb50828826f6aab6ad71d1285bea90b9563a03b8fdee985c2b97570105b925bf1795d1fc0774b89845d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-eventgrid) python39-azure-eventgrid python3dist(azure-eventgrid)"
RDEPENDS:${PN} += "python(abi) python39-azure-core python39-azure-nspkg python39-isodate"

inherit rpm
