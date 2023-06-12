SUMMARY = "Python module to download and save files using python-requests"
DESCRIPTION = "This module downloads files using requests and saves them to a target path."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python311-requests-download-0.1.2-2.14.noarch.rpm"
RPM_HASH = "23f2eb54d9161cf2628923eeb365a8efc6ac1eaef3a380ccb3a7ab83327708d726bdef149a6edc13343ddc3097166d5019b3292ba4a7bc5cd712d29a66cdb56b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(requests-download) \
python311-requests-download \
python3dist(requests-download)"
RDEPENDS:${PN} += "python(abi) \
python311-progressbar \
python311-requests"

inherit rpm
