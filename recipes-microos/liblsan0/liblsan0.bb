SUMMARY = "The GNU Compiler Leak Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=leak option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "13.1.1+git7364"

RPM_NAME = "liblsan0-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "6ef31ec97a2e66e4e9f25161dea1c11a52b20c96ff1f52335fd85067e2fae1b5395189a6bf313db71ba164ecce9f82ab20268f7ca4e84398f9ae90c5a17c49e8"

RPROVIDES:${PN} += "liblsan.so.0()(64bit) liblsan0 liblsan0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libm.so.6()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit)"

inherit rpm
