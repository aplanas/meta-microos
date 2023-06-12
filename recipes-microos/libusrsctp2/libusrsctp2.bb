SUMMARY = "Usrsctp Library"
DESCRIPTION = "The libraries for usersctp."
LICENSE = "BSD-3-Clause"

PV = "0.9.5.0"

RPM_NAME = "libusrsctp2-0.9.5.0-1.9.aarch64.rpm"
RPM_HASH = "36a7ae0daf8f3347f460d28f3aec66359619f61a3b0b6d67bc62948baea1949a52c4b4c6a5569579d3fdf9102cef854821254749f755cdc69018d887032425f0"

RPROVIDES:${PN} += "libusrsctp.so.2()(64bit) \
libusrsctp2 \
libusrsctp2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
