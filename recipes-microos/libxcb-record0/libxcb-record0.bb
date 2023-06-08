SUMMARY = "X11 RECORD Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility. \
 \
The RECORD extension supports the recording and reporting of all core \
X protocol and arbitrary X extension protocol."
LICENSE = "MIT"

PV = "1.15"

RPM_NAME = "libxcb-record0-1.15-2.2.aarch64.rpm"
RPM_HASH = "265fb241f19e0ee65b2b9a979c489d0aff4b36d674282d5eeda6dd678c76dddede44ef4b561316352a04d1e9a5eb52a0ffd533aad4f50aaac649931499952043"

RPROVIDES:${PN} += "libxcb-record.so.0()(64bit) libxcb-record0 libxcb-record0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libxcb.so.1()(64bit)"

inherit rpm
