SUMMARY = "Colorization of help messages in Click"
DESCRIPTION = "Colorization of help messages in Click"
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "python311-click-help-colors-0.9.1-1.8.noarch.rpm"
RPM_HASH = "9d6cc09ad54c58f6b8e46a1cac0040be244074b9d601b94428e602b50497e4d44cf136e477a2da026c1e87e5fa42a4690dd59ceaaa1ed95df0dfff8839de54a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(click-help-colors) python311-click-help-colors python3dist(click-help-colors)"
RDEPENDS:${PN} += "python(abi) python311-click"

inherit rpm
