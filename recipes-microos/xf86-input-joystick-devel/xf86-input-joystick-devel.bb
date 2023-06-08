SUMMARY = "Joystick input driver for the Xorg X server -- Development Files"
DESCRIPTION = "joystick is an Xorg input driver for Joysticks. The driver reports \
cursor movement as well as raw axis values through valuators."
LICENSE = "MIT"

PV = "1.6.4"

RPM_NAME = "xf86-input-joystick-devel-1.6.4-1.2.aarch64.rpm"
RPM_HASH = "50d2ee3f5c8d63a8d2592f9098e4f0a959ae0328f7bb2644c4478621e77a7679fd581d622509f6110fa439cc54e12f2c061f8489b15678abacaeb14179ea649b"

RPROVIDES:${PN} += "pkgconfig(xorg-joystick) xf86-input-joystick-devel xf86-input-joystick-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config xf86-input-joystick"

inherit rpm
