SUMMARY = "Development files for mate-screensaver"
DESCRIPTION = "mate-screensaver is a screen saver and locker that integrates with \
the MATE desktop. \
 \
This subpackage contains the pkgconfig file."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.26.2"

RPM_NAME = "mate-screensaver-devel-1.26.2-1.1.aarch64.rpm"
RPM_HASH = "66cfc1e3194b8c49b725009afb7238fe430795a615b71e6b3f1ffbee2f6eeac2e359c320e4102a2a78a0da792611137a38603a80b1381fd569f9d79636b33e3a"

RPROVIDES:${PN} += "mate-screensaver-devel mate-screensaver-devel(aarch-64) pkgconfig(mate-screensaver)"
RDEPENDS:${PN} += "/usr/bin/pkg-config mate-screensaver"

inherit rpm
