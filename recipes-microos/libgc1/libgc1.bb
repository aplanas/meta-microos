SUMMARY = "A garbage collector for C and C++"
DESCRIPTION = "The Boehm-Demers-Weiser conservative garbage collector can be used as a \
garbage collecting replacement for C malloc or C++ new. It allows you \
to allocate memory basically as you normally would, without explicitly \
deallocating memory that is no longer useful. The collector \
automatically recycles memory when it determines that it can no longer \
be otherwise accessed."
LICENSE = "BSD-3-Clause"

PV = "8.2.2"

RPM_NAME = "libgc1-8.2.2-1.3.aarch64.rpm"
RPM_HASH = "08414c3bc8f6ac92d972656a6e61b242212d8c4766c4d53db5db0e2a3c115e5f576f4ccfd568b187019379c94ec32ff4fc92b5b3d36f8cfb5ed261734d97b62a"

RPROVIDES:${PN} += "libcord.so.1()(64bit) libgc.so.1()(64bit) libgc1 libgc1(aarch-64) libgccpp.so.1()(64bit) libgctba.so.1()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
