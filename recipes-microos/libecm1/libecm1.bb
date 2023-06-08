SUMMARY = "Library for Elliptic Curve Integer Factorization"
DESCRIPTION = "Library for ecm. To use the library, you need to install ecm-devel, include \
'ecm.h' in your source file and link with -lecm."
LICENSE = "GPL-3.0-only"

PV = "7.0.5"

RPM_NAME = "libecm1-7.0.5-1.3.aarch64.rpm"
RPM_HASH = "934e94cc1abc0d9e383990ca5bfa4d06b6ded7655591c0bf33f0bf2359e0f43ec36e5ba9bc7e38977c38285a6b875fb403785ca23eee5ec507339c84fe139582"

RPROVIDES:${PN} += "libecm.so.1()(64bit) libecm1 libecm1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
