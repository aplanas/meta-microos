SUMMARY = "Link-time optimizer for LLVM"
DESCRIPTION = "This package contains the link-time optimizer for LLVM."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "16.0.2"

RPM_NAME = "libLTO16-16.0.2-1.1.aarch64.rpm"
RPM_HASH = "b4c9c8c8fb8d442ff57dbae4246cb1e8fd2e18c823e4b8982d2c3dcc771abad1c901678acffde76c8df12d2b17f692558875f5828b892c1a1cd76be19663170b"

RPROVIDES:${PN} += "libLTO.so.16()(64bit) libLTO.so.16(LLVM_16)(64bit) libLTO16 libLTO16(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libLLVM.so.16()(64bit) libLLVM.so.16(LLVM_16)(64bit) libc.so.6(GLIBC_2.32)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
