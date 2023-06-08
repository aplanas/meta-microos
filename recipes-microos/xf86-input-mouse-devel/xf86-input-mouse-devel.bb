SUMMARY = "Development files for the Mouse input driver"
DESCRIPTION = "Development files for the Mouse input driver for the Xorg X server."
LICENSE = "MIT"

PV = "1.9.5"

RPM_NAME = "xf86-input-mouse-devel-1.9.5-1.1.aarch64.rpm"
RPM_HASH = "396eb3c068d5a8182604fbbb5c0fa4ea620b3ec0b554d0cbcee1a05c956cb09e23c0e207041e22f2f59300bc5a90cd1ade1bf4e18cfdcc2860a77e6ba90a0bfb"

RPROVIDES:${PN} += "pkgconfig(xorg-mouse) xf86-input-mouse-devel xf86-input-mouse-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config xf86-input-mouse"

inherit rpm
