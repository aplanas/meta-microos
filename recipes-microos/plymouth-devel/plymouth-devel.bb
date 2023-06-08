SUMMARY = "Libraries and headers for writing Plymouth splash plugins"
DESCRIPTION = "This package contains the libply and libplybootsplash libraries \
and headers needed to develop 3rd party splash plugins for Plymouth."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-devel-22.02.122+94.4bd41a3-4.1.aarch64.rpm"
RPM_HASH = "c69658dcea70040d698265b75979f5a295c57f0d6029e287055da3bda7033b2ccb468791f4351a309eaa4d6f8391aec9e0e3a602be1eb33b56cc9a7e9f82d354"

RPROVIDES:${PN} += "pkgconfig(ply-boot-client) pkgconfig(ply-splash-core) pkgconfig(ply-splash-graphics) plymouth-devel plymouth-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libply-boot-client5 libply-splash-core5 libply-splash-graphics5 libply5 pkgconfig pkgconfig(ply-splash-core) plymouth"

inherit rpm
