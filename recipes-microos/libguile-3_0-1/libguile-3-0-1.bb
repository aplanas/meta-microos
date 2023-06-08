SUMMARY = "GNU's Ubiquitous Intelligent Language for Extension"
DESCRIPTION = "This is Guile, a portable, embeddable Scheme implementation written in \
C. Guile provides a machine independent execution platform that can be \
linked in as a library when building extensible programs. This package \
contains the shared libraries."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.0.8"

RPM_NAME = "libguile-3_0-1-3.0.8-4.7.aarch64.rpm"
RPM_HASH = "42e1d73e285522159cc941d49795dba7ee8b892c4b833d47575d107b3288644ed1bca3f87248d89be62ce75b5e9db78e7ec9d784c9da1e292e3a31a1306ab0da"

RPROVIDES:${PN} += "libguile-3.0.so.1()(64bit) libguile-3.0.so.1(GUILE_2.0)(64bit) libguile-3_0-1 libguile-3_0-1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig glibc-locale guile-modules-3_0 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypt.so.1()(64bit) libcrypt.so.1(XCRYPT_2.0)(64bit) libffi.so.8()(64bit) libffi.so.8(LIBFFI_BASE_8.0)(64bit) libffi.so.8(LIBFFI_CLOSURE_8.0)(64bit) libffi.so.8(LIBFFI_COMPLEX_8.0)(64bit) libgc.so.1()(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libunistring.so.5()(64bit)"

inherit rpm
