SUMMARY = "An interactive, extensible editor for binary data"
DESCRIPTION = "GNU poke is an interactive, extensible editor for binary data. Not limited to \
editing basic entities such as bits and bytes, it provides a full-fledged \
procedural, interactive programming language designed to describe data \
structures and to operate on them."
LICENSE = "GPL-3.0-or-later"

PV = "3.2"

RPM_NAME = "poke-3.2-1.1.aarch64.rpm"
RPM_HASH = "07ee92ad7de063ccb900c9ba51d4f32666240558e042b48ff332fdf8a89188d3d9a0bd7261bdf96dd281e74a737c7b56b90fee589e14d9b9413c5123c6a8d66a"

RPROVIDES:${PN} += "poke poke(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libpoke.so.0()(64bit) libreadline.so.8()(64bit) libtextstyle.so.0()(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit)"

inherit rpm
