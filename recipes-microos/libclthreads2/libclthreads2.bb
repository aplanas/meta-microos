SUMMARY = "C++ wrapper library around the POSIX threads API"
DESCRIPTION = "C++ wrapper library around the POSIX threads API."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.2"

RPM_NAME = "libclthreads2-2.4.2-2.11.aarch64.rpm"
RPM_HASH = "718040a574fe93b1fba9ae21b186b396993be125bae97e464e304624a1f61d33a421e80f4912decd4755c9ad2addeb37ac8375197bd35ba603c6c38e28c46653"

RPROVIDES:${PN} += "libclthreads.so.2()(64bit) \
libclthreads2 \
libclthreads2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
