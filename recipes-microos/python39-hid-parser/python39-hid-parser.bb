SUMMARY = "Parse HID report descriptors"
DESCRIPTION = "Typed pure Python library to parse HID report descriptors"
LICENSE = "MIT"

PV = "0.0.3"

RPM_NAME = "python39-hid-parser-0.0.3-1.3.noarch.rpm"
RPM_HASH = "d28552a67882f1c7479da0d3aedbeb8ad193f75ab67a034e16d9f90760fee56a3a77f1b876ee466e1a8cabdc8683380f874911c086995a156ca9a9ea68804858"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(hid-parser) python39-hid-parser python3dist(hid-parser)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
