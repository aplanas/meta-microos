SUMMARY = "Small embeddable http server library"
DESCRIPTION = "Shared library for libmicrohttpd (Small embeddable http server library)."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.76"

RPM_NAME = "libmicrohttpd12-0.9.76-1.3.aarch64.rpm"
RPM_HASH = "824e23ef106178d6687a49be4b29bf9ed00e3f88739ccd345ff55cb2b7820fbdf5b471cdad828e3d5d8653ad1374d48e1dc43ae8eb8552aa7e715b18fdda6a5e"

RPROVIDES:${PN} += "libmicrohttpd.so.12()(64bit) libmicrohttpd12 libmicrohttpd12(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgnutls.so.30()(64bit) libgnutls.so.30(GNUTLS_3_4)(64bit) libgnutls.so.30(GNUTLS_3_6_3)(64bit)"

inherit rpm
