SUMMARY = "X11 keyboard UI presentation library"
DESCRIPTION = "libxkbui provides an interface to easily present XKB layouts as \
graphical widgets."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "libxkbui1-1.0.2-13.1.aarch64.rpm"
RPM_HASH = "8761822e609ac451dcb6c1bfe6830d8cd4464bdbdb7294cd7f8c76ce8877fbe0f45aaaf3488197af9cc02e35fe17f28de296a5e75659263e274ecb0c44e3e1a6"

RPROVIDES:${PN} += "libxkbui.so.1()(64bit) libxkbui1 libxkbui1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.35)(64bit) libxkbfile.so.1()(64bit)"

inherit rpm
