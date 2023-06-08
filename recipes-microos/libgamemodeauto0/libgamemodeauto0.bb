SUMMARY = "Helper library allowing to equip any game with GameMode support"
DESCRIPTION = "GameMode is a daemon/lib combo for Linux that allows games to request \
a set of optimisations be temporarily applied to the host OS. \
 \
Libgamemodeauto allows you to use GameMode with any Game by \
preloading it into the game. \
 \
    LD_PRELOAD=/usr/lib64/libgamemodeauto.so.0 ./game \
 \
For Steam games this can be done by editing the launch options: \
 \
    LD_PRELOAD=$LD_PRELOAD:/usr/lib64/libgamemodeauto.so.0 %command%"
LICENSE = "BSD-3-Clause"

PV = "1.7"

RPM_NAME = "libgamemodeauto0-1.7-2.2.aarch64.rpm"
RPM_HASH = "7954867632b0e911633dcf0109a24ae9b01ab35d44db00e7f4f01d4783a6d4ade447a48f7fde2328acac7116fe65dc1384d712be220019024450d50ac6cfcadf"

RPROVIDES:${PN} += "libgamemodeauto.so.0()(64bit) libgamemodeauto0 libgamemodeauto0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgamemode0"

inherit rpm
