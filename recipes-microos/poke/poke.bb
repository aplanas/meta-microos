SUMMARY = "An interactive, extensible editor for binary data"
DESCRIPTION = "GNU poke is an interactive, extensible editor for binary data. Not limited to \
editing basic entities such as bits and bytes, it provides a full-fledged \
procedural, interactive programming language designed to describe data \
structures and to operate on them."
LICENSE = "GPL-3.0-or-later"

PV = "3.1"

RPM_NAME = "poke-3.1-1.1.aarch64.rpm"
RPM_HASH = "640777e6f69d3d15ad46a19ff67c8f5591ca947c1a9da102e5b7365d35b44d0888941a5b9cc78d59fcd07e19f2b24b0b16d5c86d04469b1adda087f25c0ca26d"

RPROVIDES:${PN} += "poke poke(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libpoke.so.0()(64bit) libreadline.so.8()(64bit) libtextstyle.so.0()(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit)"

inherit rpm
