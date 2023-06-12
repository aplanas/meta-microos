SUMMARY = "Python extension for the tempfile module"
DESCRIPTION = "A small Python extension for the tempfile module."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python311-volatile-2.1.0-1.11.noarch.rpm"
RPM_HASH = "094b0940a0b1116d6bb19e4ae5b6d3a6ceedd7d96b439cd47ee2d88b5bb496dbdc6b34c3654438cdb11f3737ece6464eaead592ac201ead2438f9cfc4d93cf7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(volatile) \
python311-volatile \
python3dist(volatile)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
