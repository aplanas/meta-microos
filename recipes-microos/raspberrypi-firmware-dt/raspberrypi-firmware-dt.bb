SUMMARY = "Device trees for the Raspberry Pi firmware loader"
DESCRIPTION = "This package provides additional device tree base files as well as overlays \
for the Raspberry Pi boot process."
LICENSE = "GPL-2.0-only"

PV = "2023.05.02"

RPM_NAME = "raspberrypi-firmware-dt-2023.05.02-1.1.noarch.rpm"
RPM_HASH = "b5041e1392df949373b0237e71aaff5a5e7878fc2aa8de85d00ab1a9cfc5d61d17099d21d027990202958fdf324812b8e30720999397de879c063482ab787cda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "raspberrypi-firmware-dt"
RDEPENDS:${PN} += "/bin/sh raspberrypi-firmware"

inherit rpm
