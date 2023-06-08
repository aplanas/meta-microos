SUMMARY = "Code coverage tool without special compilation options"
DESCRIPTION = "Kcov is a code coverage tester for compiled programs, Python scripts and shell \
scripts.  It allows collecting code coverage information from executables \
without special command-line arguments, and continuously produces output from \
long-running applications."
LICENSE = "GPL-2.0-only"

PV = "41"

RPM_NAME = "kcov-41-1.1.aarch64.rpm"
RPM_HASH = "55b6f07410cfcf87e47b8cd7aec07af5f8a15bc5bb0b8d8891a2aa859dcf1a8eff9a2c52881b2650038c948663aeaaf46ce8db7575a0fbe3ba557f8dca59c1f0"

RPROVIDES:${PN} += "kcov kcov(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcurl.so.4()(64bit) libdw.so.1()(64bit) libdw.so.1(ELFUTILS_0.122)(64bit) libdw.so.1(ELFUTILS_0.127)(64bit) libelf.so.1()(64bit) libelf.so.1(ELFUTILS_1.0)(64bit) libelf.so.1(ELFUTILS_1.5)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libz.so.1()(64bit)"

inherit rpm
