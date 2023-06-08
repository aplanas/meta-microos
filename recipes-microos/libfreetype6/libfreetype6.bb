SUMMARY = "A TrueType Font Library"
DESCRIPTION = "This library features TrueType fonts for open source projects. This \
version also contains an autohinter for producing improved output."
LICENSE = "FTL & GPL-2.0-only"

PV = "2.13.0"

RPM_NAME = "libfreetype6-2.13.0-3.1.aarch64.rpm"
RPM_HASH = "5d4d3c69684471f174363fbafa8ba96f8903d5fbd3b3677673a9959bbd0b4c74cad03482cb4c0c738395c3eb75a5eb402419ed711c78e59c83855ea38de98dc6"

RPROVIDES:${PN} += "freetype2 libfreetype.so.6()(64bit) libfreetype6 libfreetype6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbrotlidec.so.1()(64bit) libbz2.so.1()(64bit) libc.so.6(GLIBC_2.33)(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libz.so.1()(64bit)"

inherit rpm
