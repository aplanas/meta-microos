SUMMARY = "The GNU Compiler Address Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=address option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "7.5.0+r278197"

RPM_NAME = "libasan4-7.5.0+r278197-12.5.aarch64.rpm"
RPM_HASH = "365dc27618b4a9c42abaf57ed16a54030a826e715761577e9bed9d8795e5a65b2542672c0f67a051db5bbbd9d83cc00a9022e4643ef48b79c2be25652bf55279"

RPROVIDES:${PN} += "libasan.so.4()(64bit) libasan4 libasan4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.23)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit)"

inherit rpm
