SUMMARY = "A utility for patching ELF binaries"
DESCRIPTION = "PatchELF is a simple utility for modifing existing ELF executables and \
libraries.  It can change the dynamic loader ('ELF interpreter') of \
executables and change the RPATH of executables and libraries."
LICENSE = "GPL-3.0-only"

PV = "0.17.2"

RPM_NAME = "patchelf-0.17.2-1.2.aarch64.rpm"
RPM_HASH = "cee8443c420f180e5a215f0317d0a3cdbf326d10c4aa5b6dc5dd40992fe97f8a6bdd160a5071182060dd74a221e50dc098d523b3fa6b15b109e084d287806076"

RPROVIDES:${PN} += "patchelf patchelf(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
