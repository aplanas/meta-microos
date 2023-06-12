SUMMARY = "FFI library for closures as first-class C functions"
DESCRIPTION = "A library for building foreign function call interfaces in embedded \
interpreters. \
This library allows using closures (lambdas) as first-class C \
functions."
LICENSE = "GPL-2.0-or-later"

PV = "2.4"

RPM_NAME = "libtrampoline1-2.4-2.7.aarch64.rpm"
RPM_HASH = "e3870ff7514740662590cd320b64bff373fca27199473bacab8ad96dccdc208805177b80e4d38bf0b39a9d73e3466cd45338b31f10f1cf31d4d8df22a1049db0"

RPROVIDES:${PN} += "libtrampoline.so.1()(64bit) \
libtrampoline1 \
libtrampoline1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
