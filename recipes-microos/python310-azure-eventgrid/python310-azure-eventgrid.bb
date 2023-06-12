SUMMARY = "Microsoft Azure Event Grid Client Library"
DESCRIPTION = "This is the Microsoft Azure Event Grid Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.11.0"

RPM_NAME = "python310-azure-eventgrid-4.11.0-1.1.noarch.rpm"
RPM_HASH = "515e57b9583946e241eb604f9eaa5888e13883f320050720428a8a3b153ccc5ff509c7325187dc512206306984a3ed771e9fc012984181e9acc9f8c2ac1e97cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-eventgrid python3.10dist(azure-eventgrid) python310-azure-eventgrid python3dist(azure-eventgrid)"
RDEPENDS:${PN} += "python(abi) python310-azure-core python310-azure-nspkg python310-isodate"

inherit rpm
