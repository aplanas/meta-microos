SUMMARY = "A Library for Manipulating ID3v1 and ID3v2 tags"
DESCRIPTION = "This package provides a software library for manipulating ID3v1 and \
ID3v2 tags. It provides a convenient interface for software developers \
to include standards-compliant ID3v1/2 tagging capabilities in their \
applications. Features include identification of valid tags, automatic \
size conversions, synchronization and resynchronization of tag frames, \
seamless tag compression and decompression, and optional padding \
facilities."
LICENSE = "LGPL-2.1-or-later"

PV = "3.8.3"

RPM_NAME = "libid3-3_8-3-3.8.3-268.9.aarch64.rpm"
RPM_HASH = "d83bf79079a6bcf14c1b68aa36169feb02bcf50efa869429165656f71ed98ca3cf9ea1b57123708cc76b7988bba2b4a361e8c7c47bcc96da2866c116bbc7efb1"

RPROVIDES:${PN} += "id3lib \
libid3-3.8.so.3()(64bit) \
libid3-3_8-3 \
libid3-3_8-3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libz.so.1()(64bit)"

inherit rpm
