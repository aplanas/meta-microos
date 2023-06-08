SUMMARY = "Library for the Common ISDN Application Programming Interface"
DESCRIPTION = "libcapi handles requests from CAPI-driven applications such as fax \
systems via active and passive ISDN cards."
LICENSE = "LGPL-2.1-or-later"

PV = "3.27"

RPM_NAME = "libcapi20-3-3.27-2.8.aarch64.rpm"
RPM_HASH = "b2cc128f6b2c4a8ab1917f82014001ceb0f53b86e66bcccb63abce4990379d8ab872a6c9bbaf8de479299c7419fb15e1807a2ab58aa457c93af6919846215391"

RPROVIDES:${PN} += "capi4linux lib_capi_mod_fritzbox.so.2()(64bit) lib_capi_mod_rcapi.so.2()(64bit) lib_capi_mod_std.so.2()(64bit) libcapi20-3 libcapi20-3(aarch-64) libcapi20.so.3()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
