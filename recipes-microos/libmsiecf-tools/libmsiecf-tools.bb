SUMMARY = "Utilities to inspect MS Internet Explorer Cache Files"
DESCRIPTION = "Several tools for reading MS Internet Explorer Cache files."
LICENSE = "LGPL-3.0-or-later"

PV = "20221024"

RPM_NAME = "libmsiecf-tools-20221024-3.5.aarch64.rpm"
RPM_HASH = "ac6f477fcf8b0698b3411fe254e76dafe5c22cb07576530eef9a22927245a5041a86bcd6e661b5d64eae1183e6ba78982e78020d9a5988eef0b13e2fa893854c"

RPROVIDES:${PN} += "libmsiecf-tools libmsiecf-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libclocale.so.1()(64bit) libclocale.so.1(V_20221218)(64bit) libcnotify.so.1()(64bit) libcnotify.so.1(V_20220108)(64bit) libfdatetime.so.1()(64bit) libfdatetime.so.1(V_20220112)(64bit) libmsiecf.so.1()(64bit) libmsiecf.so.1(V_20221024)(64bit)"

inherit rpm
