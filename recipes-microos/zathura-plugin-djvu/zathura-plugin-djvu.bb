SUMMARY = "DjVu support for zathura using the djvulibre library"
DESCRIPTION = "The zathura-djvu plugin adds DjVu support to zathura by using the djvulibre library."
LICENSE = "Zlib"

PV = "0.2.9"

RPM_NAME = "zathura-plugin-djvu-0.2.9-1.16.aarch64.rpm"
RPM_HASH = "40249fcea5bb52dcf8262621b6dd8f9a2f05bf75200449d8021eb9ebef070329127ae8fbd51b035165259c6d2173f84b01385a702c8264a4c1904b260ce16558"

RPROVIDES:${PN} += "libdjvu.so()(64bit) \
metainfo() \
metainfo(org.pwmt.zathura-djvu.metainfo.xml) \
zathura-djvu-plugin \
zathura-plugin-djvu \
zathura-plugin-djvu(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcairo.so.2()(64bit) \
libdjvulibre.so.21()(64bit) \
libgirara-gtk3.so.3()(64bit) \
libglib-2.0.so.0()(64bit) \
zathura"

inherit rpm
