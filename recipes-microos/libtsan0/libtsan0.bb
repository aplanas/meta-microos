SUMMARY = "The GNU Compiler Thread Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=thread option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "11.3.1+git2076"

RPM_NAME = "libtsan0-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "33039608133a74ae479b56e972312bcc9e930439a66c77b507269cb983349ce541c5525efd97eed5cbfe8e52a220e186d3907c97d54e06d74387cb87d2ec08f2"

RPROVIDES:${PN} += "libtsan.so.0()(64bit) libtsan0 libtsan0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.23)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit)"

inherit rpm
