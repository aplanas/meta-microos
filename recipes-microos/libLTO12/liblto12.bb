SUMMARY = "Link-time optimizer for LLVM"
DESCRIPTION = "This package contains the link-time optimizer for LLVM."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "12.0.1"

RPM_NAME = "libLTO12-12.0.1-11.1.aarch64.rpm"
RPM_HASH = "ce6a2674be5cb8ca862db3d922c04bc42b3185595ec32971559924987f85c1790de6fd626d794ed6d3f8a19702d2479c6d4ba4f9ff9edcc9774c70f37a76c903"

RPROVIDES:${PN} += "libLTO.so.12()(64bit) libLTO.so.12(LLVM_12)(64bit) libLTO12 libLTO12(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libLLVM.so.12()(64bit) libLLVM.so.12(LLVM_12)(64bit) libLLVM12 libc.so.6(GLIBC_2.32)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
