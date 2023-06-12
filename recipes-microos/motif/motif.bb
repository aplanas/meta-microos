SUMMARY = "Motif Runtime Programs"
DESCRIPTION = "This package provides programs of the Motif runtime enviroment."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.8"

RPM_NAME = "motif-2.3.8-2.4.aarch64.rpm"
RPM_HASH = "dca7b79988b761401a5e4c077238049691dbfe9e66322ae873eb1d511f0cf9465bc594cf9b43f3c075b134f53a1da518aa59ee7987df8005108131eb4cf14b9a"

RPROVIDES:${PN} += "config(motif) \
motif \
motif(aarch-64) \
openmotif"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libXm.so.4()(64bit) \
libXt.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
