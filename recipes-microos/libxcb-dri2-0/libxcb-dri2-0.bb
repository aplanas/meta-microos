SUMMARY = "X11 DRI2 Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility."
LICENSE = "MIT"

PV = "1.15"

RPM_NAME = "libxcb-dri2-0-1.15-2.2.aarch64.rpm"
RPM_HASH = "353acebf05d40ceecccc45ca457d7aab4c92c0308b2331d2e387fa4b64c7fdd00c5293e6a979d40d1a2e10cadb602b1e59acbfe81ab93a9f364f332923bf1a9c"

RPROVIDES:${PN} += "libxcb-dri2-0 libxcb-dri2-0(aarch-64) libxcb-dri2.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libxcb.so.1()(64bit)"

inherit rpm
