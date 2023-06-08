SUMMARY = "XCB utility module for client- and WM-side ICCCM helpers"
DESCRIPTION = "The XCB util modules provide a number of libraries which sit on top \
of libxcb, the core X protocol library, and some of the extension \
libraries. \
 \
Included in this package is: \
 \
- icccm: Both client and window-manager helpers for ICCCM."
LICENSE = "MIT"

PV = "0.4.2"

RPM_NAME = "libxcb-ewmh2-0.4.2-1.2.aarch64.rpm"
RPM_HASH = "65f358d04107a93ad9a0f525c393aa4a3c851c4cf5f8c8cceb738ca7cf907acea809a3f657e2091e94688874bbc9d4f44f8cd69ba678f98280bf02b567ac7206"

RPROVIDES:${PN} += "libxcb-ewmh.so.2()(64bit) libxcb-ewmh2 libxcb-ewmh2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libxcb.so.1()(64bit)"

inherit rpm
