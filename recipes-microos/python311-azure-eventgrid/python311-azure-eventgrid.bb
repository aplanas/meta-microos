SUMMARY = "Microsoft Azure Event Grid Client Library"
DESCRIPTION = "This is the Microsoft Azure Event Grid Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.10.0"

RPM_NAME = "python311-azure-eventgrid-4.10.0-1.1.noarch.rpm"
RPM_HASH = "b41dcf97802364ed2cf626304adb7d689bfad46e554224e8d35964897e7298e11f477542079e8c29ab2d62fe7a05214193bde9e84e4960a8626a8663efc9bcec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-eventgrid) python311-azure-eventgrid python3dist(azure-eventgrid)"
RDEPENDS:${PN} += "python(abi) python311-azure-core python311-azure-nspkg python311-isodate"

inherit rpm
