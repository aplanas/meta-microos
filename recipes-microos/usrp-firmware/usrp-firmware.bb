SUMMARY = "Firmware files for the URSP1 SDR"
DESCRIPTION = "Firmware files for the USRP1 SDR."
LICENSE = "GPL-3.0-or-later"

PV = "3.4.7"

RPM_NAME = "usrp-firmware-3.4.7-1.4.noarch.rpm"
RPM_HASH = "cf3a49d43a370b1dae5d0e8a3d20a16c9d0ee8ec441ef7015e4021abfb0acacb80c4c3de58e574c8c4ad9c3ddec2009485da10d0442066000ecd8d00d57e17a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "usrp-firmware"
RDEPENDS:${PN} += "usrp-tools"

inherit rpm
