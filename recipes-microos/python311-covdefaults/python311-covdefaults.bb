SUMMARY = "Python coverage plugin to provide default settings"
DESCRIPTION = "Python coverage plugin to provide default settings."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python311-covdefaults-2.3.0-1.2.noarch.rpm"
RPM_HASH = "a5c21488735c74f14ce1e369a4aea3086944cf0d722df783627675474b8f33e25db9570a38e64d5f80e36f797d9c7c63aa405cc3b2e3b1366dfb62989c65426b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(covdefaults) python311-covdefaults python3dist(covdefaults)"
RDEPENDS:${PN} += "python(abi) python311-coverage"

inherit rpm
