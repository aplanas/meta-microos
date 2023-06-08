SUMMARY = "The GNU Compiler Thread Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=thread option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "7.5.0+r278197"

RPM_NAME = "libtsan0-gcc7-7.5.0+r278197-12.5.aarch64.rpm"
RPM_HASH = "55734c3e791803b7db41de6802c41b0889420e5b3d1dfb504b6a1675161ac50672d71a530fffa4ba040d9e3a54049590b55e40f996bb52d1c80b33eb35cc2271"

RPROVIDES:${PN} += "libtsan.so.0()(64bit) libtsan0 libtsan0-gcc7 libtsan0-gcc7(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.23)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit)"

inherit rpm
