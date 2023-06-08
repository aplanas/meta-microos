SUMMARY = "Getting image size from PNG/JPEG/JPEG2000/GIF files"
DESCRIPTION = "Pure Python library which parses image files' header and returns the image size. \
 \
Supported formats: \
 * PNG \
 * JPEG \
 * JPEG2000 \
 * GIF"
LICENSE = "MIT"

PV = "1.4.1"

RPM_NAME = "python311-imagesize-1.4.1-2.1.noarch.rpm"
RPM_HASH = "8115b5a1105afa53445185a71060319dfe2495448a20530ef26a9ffde416cec46dede1a8fb8c75a9f12f5bf42fc503a1fa873e56cd3eb28fb8811fd54b1a1774"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(imagesize) python311-imagesize python3dist(imagesize)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
