SUMMARY = "Development package for jack"
DESCRIPTION = "This package contains the files needed to compile programs that \
communicate with jack clients/servers."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.9.22"

RPM_NAME = "libjack-devel-1.9.22-2.1.aarch64.rpm"
RPM_HASH = "47114739f96904f4d114eb5ded63c1530760fecfbbc9439e612f3be3d2b021ba543794d9045a566a5004cfb0a7841b89e9a2fcea5011ba378680f78a31b89391"

RPROVIDES:${PN} += "jack-audio-connection-kit-devel jack-devel libjack-devel libjack-devel(aarch-64) libjack2-devel pkgconfig(jack)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libjack0 libjacknet0 libjackserver0 pkgconfig"

inherit rpm
