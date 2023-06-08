SUMMARY = "XCB utility module for the X Resource Manager"
DESCRIPTION = "The XCB util modules provides a number of libraries which sit on top \
of libxcb, the core X protocol library, and some of the extension \
libraries. \
 \
Included in this package is: \
 \
- xrm: utility functions for the X resource manager"
LICENSE = "MIT"

PV = "1.3"

RPM_NAME = "libxcb-xrm0-1.3-1.10.aarch64.rpm"
RPM_HASH = "ed1ad242f044e323883625d87e06a4d10e4374c613250652e3eb613970376d77489c983cb661592dba442258507dc669bed75d80e0c856b504bf61c8b2f78026"

RPROVIDES:${PN} += "libxcb-xrm.so.0()(64bit) libxcb-xrm0 libxcb-xrm0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libxcb-util.so.1()(64bit) libxcb.so.1()(64bit)"

inherit rpm
