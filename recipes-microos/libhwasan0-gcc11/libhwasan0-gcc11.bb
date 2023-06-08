SUMMARY = "The GNU Compiler Hardware-assisted Address Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=hwaddress option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "11.3.1+git2076"

RPM_NAME = "libhwasan0-gcc11-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "5e7c5b1ff3d1c9ef5949ac2abc9a349bc497345e64b54605bae67d8d6aae2ef858ba531d1914721d256f9ff4711452196000e9a43414d3613c8fba0df6a87bd2"

RPROVIDES:${PN} += "libhwasan.so.0()(64bit) libhwasan0 libhwasan0-gcc11 libhwasan0-gcc11(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libm.so.6()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit)"

inherit rpm
