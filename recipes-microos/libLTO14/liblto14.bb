SUMMARY = "Link-time optimizer for LLVM"
DESCRIPTION = "This package contains the link-time optimizer for LLVM."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "libLTO14-14.0.6-8.1.aarch64.rpm"
RPM_HASH = "d17c0169bbb708fe4ae22b873c99906fd624b4b026745799b54dffacd163a5d27df9279e4435f03cf1205418554517f36398d703daf9bbe8fa8c615675de8180"

RPROVIDES:${PN} += "libLTO.so.14()(64bit) libLTO.so.14(LLVM_14)(64bit) libLTO14 libLTO14(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libLLVM.so.14()(64bit) libLLVM.so.14(LLVM_14)(64bit) libc.so.6(GLIBC_2.32)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
