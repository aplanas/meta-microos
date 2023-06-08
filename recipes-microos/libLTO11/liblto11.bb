SUMMARY = "Link-time optimizer for LLVM"
DESCRIPTION = "This package contains the link-time optimizer for LLVM."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "11.0.1"

RPM_NAME = "libLTO11-11.0.1-12.1.aarch64.rpm"
RPM_HASH = "f12a127e7d81f6d89a187dfd680dd2f49c083dbe6838cb805b3b7bfd6a4a1fc411e45bd949921d86a9d4b668f267440794d317385c54c56768a56173c9d70e43"

RPROVIDES:${PN} += "libLTO.so.11()(64bit) libLTO.so.11(LLVM_11)(64bit) libLTO11 libLTO11(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libLLVM.so.11()(64bit) libLLVM.so.11(LLVM_11)(64bit) libLLVM11 libc.so.6(GLIBC_2.32)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
