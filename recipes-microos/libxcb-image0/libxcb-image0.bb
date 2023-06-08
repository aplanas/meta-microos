SUMMARY = "XCB utility module for XImage/XShmImage-like functions"
DESCRIPTION = "The XCB util modules provide a number of libraries which sit on top \
of libxcb, the core X protocol library, and some of the extension \
libraries. \
 \
Included in this package is: \
 \
- image: Port of Xlib's XImage and XShmImage functions."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "libxcb-image0-0.4.1-1.2.aarch64.rpm"
RPM_HASH = "78f5adaf49fc9af8a0ed237d92a5b7856a47120cb4dfe9e1022e3e5dd7b4b85319d6aa4867b69111ef94fab094b79314889ada99714e0b7f9087cfb9cd67d0e6"

RPROVIDES:${PN} += "libxcb-image.so.0()(64bit) libxcb-image0 libxcb-image0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libxcb-shm.so.0()(64bit) libxcb-util.so.1()(64bit) libxcb.so.1()(64bit)"

inherit rpm
