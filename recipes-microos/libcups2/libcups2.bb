SUMMARY = "HTTP/IPP communication and printer queue and job library"
DESCRIPTION = "The CUPS library contains all of the core HTTP and IPP communications \
code as well as convenience functions for queuing print jobs, getting \
printer information, accessing resources via HTTP and IPP, and \
manipulating PPD files. The scheduler and all commands, filters, and \
backends use this library."
LICENSE = "Apache-2.0"

PV = "2.4.2"

RPM_NAME = "libcups2-2.4.2-4.3.aarch64.rpm"
RPM_HASH = "c38ff4e06436156bedecf1c3b3689bced291eb29d136cb714c044e430dc258f02c3eade904463df6ec4857d06883ba15188ab89686fce70de08526e53f79797b"

RPROVIDES:${PN} += "cups-libs libcups.so.2()(64bit) libcups2 libcups2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig cups-config ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libavahi-client.so.3()(64bit) libavahi-common.so.3()(64bit) libc.so.6(GLIBC_2.36)(64bit) libgnutls.so.30()(64bit) libgnutls.so.30(GNUTLS_3_4)(64bit) libgssapi_krb5.so.2()(64bit) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit)"

inherit rpm
