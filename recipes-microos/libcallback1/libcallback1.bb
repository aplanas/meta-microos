SUMMARY = "FFI library for closures with variable arguments"
DESCRIPTION = "A library for building foreign function call interfaces in embedded \
interpreters. \
 \
This library allows for closures with variable arguments as \
first-class C functions (a reentrant combination of vacall and \
trampoline)."
LICENSE = "GPL-2.0-or-later"

PV = "2.4"

RPM_NAME = "libcallback1-2.4-2.7.aarch64.rpm"
RPM_HASH = "b1e0b442f7e135b1f186dcbd97fb44ba7b406fd88d8c6e26edcd8698ae2978c2c193fe8a5ace6033aea131eac130ea470d8adf485494d7920edd6e17519964c1"

RPROVIDES:${PN} += "libcallback.so.1()(64bit) \
libcallback1 \
libcallback1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
