SUMMARY = "Visual regression testing library"
DESCRIPTION = "Python client library for visual regression testing with Percy."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python311-percy-2.0.2-1.13.noarch.rpm"
RPM_HASH = "f3856118c0af9bd7ae7f1cc96dc8d6b74037c459cd601ed5074aa40d03baa2643282823cd717702faa87699fb77295ddb2aa4a64179b59c66125397a19e36ab4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(percy) \
python311-percy \
python3dist(percy)"
RDEPENDS:${PN} += "python(abi) \
python311-requests"

inherit rpm
