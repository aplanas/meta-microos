SUMMARY = "Happy is a parser generator for Haskell"
DESCRIPTION = "Happy is a parser generator for Haskell. Given a grammar specification in BNF, \
Happy generates Haskell code to parse the grammar. Happy works in a similar way \
to the 'yacc' tool for C."
LICENSE = "BSD-2-Clause"

PV = "1.20.1.1"

RPM_NAME = "happy-1.20.1.1-1.2.aarch64.rpm"
RPM_HASH = "3ff6e0f47392da18ada0ec82b7e6ef72c0d523b59bb3d86bbe52dfd9329c975c3ee8a0defec804d01335598612fae959fb021360797a2336037deaca891f7b3c"

RPROVIDES:${PN} += "happy \
happy(aarch-64)"
RDEPENDS:${PN} += "libatomic.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libffi.so.8()(64bit) \
libffi.so.8(LIBFFI_BASE_8.0)(64bit) \
libffi.so.8(LIBFFI_CLOSURE_8.0)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libnuma.so.1()(64bit) \
libnuma.so.1(libnuma_1.1)(64bit) \
libnuma.so.1(libnuma_1.2)(64bit)"

inherit rpm
