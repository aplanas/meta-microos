SUMMARY = "X11 Render Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility."
LICENSE = "MIT"

PV = "1.15"

RPM_NAME = "libxcb-render0-1.15-2.2.aarch64.rpm"
RPM_HASH = "b6f8a3a0e304c1c90003530769d11a5ec2de71bc885b2edc1e19f1ba357309f8629ada324b1c22fb7aed1ff7ff04c72f0b0bcc1b84e23634dd3b4ae9f67c9558"

RPROVIDES:${PN} += "libxcb-render.so.0()(64bit) libxcb-render0 libxcb-render0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libxcb.so.1()(64bit)"

inherit rpm
