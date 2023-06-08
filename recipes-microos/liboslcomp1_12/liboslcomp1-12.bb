SUMMARY = "OpenShadingLanguage's compiler component library"
DESCRIPTION = "Open Shading Language (OSL) is a language for programmable shading \
in advanced renderers and other applications, ideal for describing \
materials, lights, displacement, and pattern generation."
LICENSE = "BSD-3-Clause"

PV = "1.12.10.0"

RPM_NAME = "liboslcomp1_12-1.12.10.0-1.2.aarch64.rpm"
RPM_HASH = "d12d282e1b5a647052ec92e1df8148b443c8646612e08777a034cd90e5c83e547efe8f7030b0d44345bc547d466ab4e088828b16893ce23276ecafabffa440fb"

RPROVIDES:${PN} += "liboslcomp.so.1.12()(64bit) liboslcomp1_12 liboslcomp1_12(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libLLVM.so.15()(64bit) libLLVM.so.15(LLVM_15)(64bit) libOpenImageIO_Util.so.2.4()(64bit) libc.so.6(GLIBC_2.32)(64bit) libclang-cpp.so.15()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_4.5.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
