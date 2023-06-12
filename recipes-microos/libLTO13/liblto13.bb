SUMMARY = "Link-time optimizer for LLVM"
DESCRIPTION = "This package contains the link-time optimizer for LLVM."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "libLTO13-13.0.1-9.1.aarch64.rpm"
RPM_HASH = "cf4bdfbb75f849b4f41adc1dfbc97dadc62de930b13545cc5a5c109a9d1ba11fc74c2a5f6339234cd45db2436d1ba545b3f887273b29555d25b301403ddc404e"

RPROVIDES:${PN} += "libLTO.so.13()(64bit) libLTO.so.13(LLVM_13)(64bit) libLTO13 libLTO13(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libLLVM.so.13()(64bit) libLLVM.so.13(LLVM_13)(64bit) libc.so.6(GLIBC_2.32)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
