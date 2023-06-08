SUMMARY = "Development files for mate-screensaver"
DESCRIPTION = "mate-screensaver is a screen saver and locker that integrates with \
the MATE desktop. \
 \
This subpackage contains the pkgconfig file."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "mate-screensaver-devel-1.26.1-2.3.aarch64.rpm"
RPM_HASH = "ac5af66189ac0e2a3e7e21bf2ad3995ef8b60c21ae9c98d0c15b705c299a37899e13ec3a7e01163724bd6d8e7cc589e055a54fdc6f25c5143f3bb893ffa69e28"

RPROVIDES:${PN} += "mate-screensaver-devel mate-screensaver-devel(aarch-64) pkgconfig(mate-screensaver)"
RDEPENDS:${PN} += "/usr/bin/pkg-config mate-screensaver"

inherit rpm
