SUMMARY = "Headers for compiling games using GameMode"
DESCRIPTION = "GameMode is a daemon/lib combo for Linux that allows games to request \
a set of optimisations be temporarily applied to the host OS. \
 \
This package contains the headers required to compile games with \
built-in GameMode support."
LICENSE = "BSD-3-Clause"

PV = "1.7"

RPM_NAME = "libgamemode-devel-1.7-2.2.aarch64.rpm"
RPM_HASH = "50e90756ecd3213758b58b89ac04f5f818ba55f69974cc151de23be8cae4f848ec09b24e51d1d02e37d9cde8ed30cfe088e65b19aac7584db1f0650c96e58e8a"

RPROVIDES:${PN} += "libgamemode-devel libgamemode-devel(aarch-64) pkgconfig(gamemode) pkgconfig(libgamemodeauto)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libgamemode0 libgamemodeauto0"

inherit rpm
