SUMMARY = "Tool to control an usb-sd-mux from the command line"
DESCRIPTION = "Tool to control USB-SD-mux hardware from linux-automation.com \
 \
Full manual is available at https://www.linux-automation.com/usbsdmux-M01/"
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.1"

RPM_NAME = "python310-usbsdmux-0.2.1-1.7.aarch64.rpm"
RPM_HASH = "ad0d503cb913c9f990129a79cbd18a7a50daa1a3fdaaa8ec2fa7c65d40a3398a289c053f189270a6431987dc7f008d282d4b7cf7e3d2035e409de23d4b8f6111"

RPROVIDES:${PN} += "python3-usbsdmux python3.10dist(usbsdmux) python310-usbsdmux python310-usbsdmux(aarch-64) python3dist(usbsdmux)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3 /usr/bin/python3.10 python(abi) update-alternatives usbsdmux-udev"

inherit rpm
