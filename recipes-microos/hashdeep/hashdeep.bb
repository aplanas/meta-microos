SUMMARY = "Compute MD5, SHA-1, SHA-256, Tiger or Whirlpool message digests"
DESCRIPTION = "hashdeep is a program to compute, match, and audit hashsets. \
md5deep computes the MD5, SHA-1, SHA-256, Tiger, or Whirlpool message digest \
for any number of files while optionally recursively digging through the \
directory structure. md5deep can also match input files against lists of known \
hashes in a variety of formats."
LICENSE = "SUSE-Public-Domain & GPL-2.0-or-later"

PV = "4.4"

RPM_NAME = "hashdeep-4.4-5.9.aarch64.rpm"
RPM_HASH = "08eabb4babe0a17e5070137adbd55133e0753710fc9f0a88aab3e4a4dd68f73b921240047d5bd4c4033f048cc1926921bc30ed75e2105feae53bc1a7a9eae5b8"

RPROVIDES:${PN} += "hashdeep hashdeep(aarch-64) md5deep"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
