SUMMARY = "GameMode client library"
DESCRIPTION = "GameMode is a daemon/lib combo for Linux that allows games to request \
a set of optimisations be temporarily applied to the host OS. \
 \
Libgamemode is the client library used by games or libgamemodeauto to \
talk to the GameMode daemon."
LICENSE = "BSD-3-Clause"

PV = "1.7"

RPM_NAME = "libgamemode0-1.7-2.2.aarch64.rpm"
RPM_HASH = "120085a325396762ed198944f7ede9abd8ff5aed16fe81ce063034db47f431e197431cf2653de785d56b70270de60e2e7379519548d556d59d927aa300db3f68"

RPROVIDES:${PN} += "libgamemode.so.0()(64bit) libgamemode0 libgamemode0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig gamemoded ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libdbus-1.so.3()(64bit) libdbus-1.so.3(LIBDBUS_1_3)(64bit) systemd"

inherit rpm
