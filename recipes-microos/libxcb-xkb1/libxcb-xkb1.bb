SUMMARY = "X11 Keyboard Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility. \
 \
Xkb extends the ability to control the keyboard \
over what is offered by the X Window System core protocol."
LICENSE = "MIT"

PV = "1.15"

RPM_NAME = "libxcb-xkb1-1.15-2.2.aarch64.rpm"
RPM_HASH = "1b846eb9639f758fc9847ab887371a74279de31b93a7627efd14f2c70eb9586888373c82ed3785264f0de51e115b46375a043815e58de49a24e5db99534d74bc"

RPROVIDES:${PN} += "libxcb-xkb.so.1()(64bit) \
libxcb-xkb1 \
libxcb-xkb1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libxcb.so.1()(64bit)"

inherit rpm
