SUMMARY = "Parse HID report descriptors"
DESCRIPTION = "Typed pure Python library to parse HID report descriptors"
LICENSE = "MIT"

PV = "0.0.3"

RPM_NAME = "python310-hid-parser-0.0.3-1.3.noarch.rpm"
RPM_HASH = "d0e4252788fa328b5b01aab538661e7849bffab4ae1f83f9e58e5222bfdb9f089d8b0e8eab1e1e40e8b5c9f410ddcde38a224aa8e68f88324ca83131c2aa1ba0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hid-parser python3.10dist(hid-parser) python310-hid-parser python3dist(hid-parser)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
