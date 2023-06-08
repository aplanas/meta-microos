SUMMARY = "Development package for jack"
DESCRIPTION = "This package contains the files needed to compile programs that \
communicate with jack clients/servers."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.9.22"

RPM_NAME = "libjack-devel-1.9.22-1.1.aarch64.rpm"
RPM_HASH = "bb22c07a3b23f0fdd5145c5c9565032386a14a7c58eef2c34a7aa8b045f51302300cecf1b1643a597466f5578864f115f53bc3504c6480ce142f71ae7d373184"

RPROVIDES:${PN} += "jack-audio-connection-kit-devel jack-devel libjack-devel libjack-devel(aarch-64) libjack2-devel pkgconfig(jack)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libjack0 libjacknet0 libjackserver0 pkgconfig"

inherit rpm
