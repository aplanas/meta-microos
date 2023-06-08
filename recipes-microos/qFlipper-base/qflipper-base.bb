SUMMARY = "Application for updating Flipper Zero firmware - udev rules"
DESCRIPTION = "Application for updating Flipper Zero firmware - udev rules"
LICENSE = "GPL-3.0-or-later"

PV = "1.2.2+git7.1672595968.84566a5"

RPM_NAME = "qFlipper-base-1.2.2+git7.1672595968.84566a5-1.3.noarch.rpm"
RPM_HASH = "5a3927f25e85dc94f872e4ce646ddb5b874c30064da5ed85dc91660933faf50ff1a561f72a8e8252265cf7acd22e7faee6e969b4a81b3d89a6983361f01a0b6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qFlipper-base"
RDEPENDS:${PN} += ""

inherit rpm
