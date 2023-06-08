SUMMARY = "Link-time optimizer for LLVM"
DESCRIPTION = "This package contains the link-time optimizer for LLVM."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "libLTO13-13.0.1-8.1.aarch64.rpm"
RPM_HASH = "081168a11910e26c023adeee34d18cda4f0a1ba6501c3121b25d90affbf9a7f983b36040448104cd75353fd2fd38df3cad49655ea671f65c544c33c8d643a47a"

RPROVIDES:${PN} += "libLTO.so.13()(64bit) libLTO.so.13(LLVM_13)(64bit) libLTO13 libLTO13(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libLLVM.so.13()(64bit) libLLVM.so.13(LLVM_13)(64bit) libc.so.6(GLIBC_2.32)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
