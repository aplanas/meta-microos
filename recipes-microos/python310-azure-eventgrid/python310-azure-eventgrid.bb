SUMMARY = "Microsoft Azure Event Grid Client Library"
DESCRIPTION = "This is the Microsoft Azure Event Grid Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.10.0"

RPM_NAME = "python310-azure-eventgrid-4.10.0-1.1.noarch.rpm"
RPM_HASH = "579466759093f07bde780af6daccba3658d75320add55531962aab1da3113d828f0630145486c4e3ca896be4353086b0adc98da283386fc2a5958f475c150647"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-eventgrid python3.10dist(azure-eventgrid) python310-azure-eventgrid python3dist(azure-eventgrid)"
RDEPENDS:${PN} += "python(abi) python310-azure-core python310-azure-nspkg python310-isodate"

inherit rpm
