SUMMARY = "Colorization of help messages in Click"
DESCRIPTION = "Colorization of help messages in Click"
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "python39-click-help-colors-0.9.1-1.8.noarch.rpm"
RPM_HASH = "3fdd734b04fb35a0d1ef9ae12ca493100e998de7c9edd0daae334838b570238f092860a294ec46f16e38bae243fe8a2e322dfe933f5634aa1eefdcebd1e8abd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(click-help-colors) python39-click-help-colors python3dist(click-help-colors)"
RDEPENDS:${PN} += "python(abi) python39-click"

inherit rpm
