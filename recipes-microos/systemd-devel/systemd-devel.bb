SUMMARY = "Development files for libsystemd and libudev"
DESCRIPTION = "Development headers and files for libsystemd and libudev libraries for \
developing and building applications linking to these libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "253.4"

RPM_NAME = "systemd-devel-253.4-1.2.aarch64.rpm"
RPM_HASH = "6512dfe203427a844086f87d46777e670b6fb953f33dd6ada5275b968bf0c9d06c18bd5071ced0a2615e220d5e47ee512b977217ccdc6a340f0e775a30a980e8"

RPROVIDES:${PN} += "libudev-devel pkgconfig(libsystemd) pkgconfig(libudev) systemd-devel systemd-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libsystemd0 libudev1 systemd-rpm-macros"

inherit rpm
