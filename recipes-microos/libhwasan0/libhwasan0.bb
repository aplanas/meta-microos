SUMMARY = "The GNU Compiler Hardware-assisted Address Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=hwaddress option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "13.0.1+git7231"

RPM_NAME = "libhwasan0-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "d8b601359a3dad8a0abc92638d3b2aa8f4aa3598f7b3101ca130795d7dc79912eaece08f99a90032c1f8a42ee3d35e43f100947d04c202d9712ba928ac45122a"

RPROVIDES:${PN} += "libhwasan.so.0()(64bit) libhwasan0 libhwasan0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libm.so.6()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit)"

inherit rpm
