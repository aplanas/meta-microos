SUMMARY = "Search in pdf files for strings matching a regular expression"
DESCRIPTION = "Pdfgrep is a tool to search text in PDF files. It works similar to `grep'. \
 \
Features: \
- search for regular expressions. \
- support for some important grep options, including: \
+ filename output. \
+ page number output. \
+ optional case insensitivity. \
+ count occurrences."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.2"

RPM_NAME = "pdfgrep-2.1.2-2.9.aarch64.rpm"
RPM_HASH = "4563495410bed75a51350a3431c00480a13549985d96e80bd8908f4bdf646ae7974b102978d7eef4470650b2258325dd0632cc3589016d7ad4c571317c924950"

RPROVIDES:${PN} += "pdfgrep \
pdfgrep(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgcrypt.so.20()(64bit) \
libgcrypt.so.20(GCRYPT_1.6)(64bit) \
libpcre.so.1()(64bit) \
libpoppler-cpp.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.1)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
