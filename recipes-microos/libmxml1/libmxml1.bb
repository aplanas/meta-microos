SUMMARY = "Shared library for mxml"
DESCRIPTION = "Mini-XML is a small XML parsing library that you can use to read XML \
and XML-like data files in your application without requiring large \
nonstandard libraries. \
 \
This package holds the shared library for mxml."
LICENSE = "Apache-2.0"

PV = "3.3.1"

RPM_NAME = "libmxml1-3.3.1-1.3.aarch64.rpm"
RPM_HASH = "5eefbc396481e5588224db753676c0af44fdd53f3fab183c03c1502de087640b06dc66bee2f2baf046b173d530c9db2b7945c3a3bf8b7b45e670cc1749f2c419"

RPROVIDES:${PN} += "libmxml.so.1()(64bit) libmxml1 libmxml1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
