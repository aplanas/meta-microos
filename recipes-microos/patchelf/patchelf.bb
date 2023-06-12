SUMMARY = "A utility for patching ELF binaries"
DESCRIPTION = "PatchELF is a simple utility for modifing existing ELF executables and \
libraries.  It can change the dynamic loader ('ELF interpreter') of \
executables and change the RPATH of executables and libraries."
LICENSE = "GPL-3.0-only"

PV = "0.18.0"

RPM_NAME = "patchelf-0.18.0-1.1.aarch64.rpm"
RPM_HASH = "7c15b4395db6440f62efe0dc42aaecad5769f77d192bae92d28d94ab185bb36f2749ef6b3bb3cfed075d411cf1431f701b53eecc95ff8f96cd4e0edfc5a7ed2f"

RPROVIDES:${PN} += "patchelf patchelf(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
