SUMMARY = "Tools for converting WordPerfect Graphics files"
DESCRIPTION = "Tools to work with graphics in WPG (WordPerfect Graphics) format."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.3.4"

RPM_NAME = "libwpg-tools-0.3.4-2.1.aarch64.rpm"
RPM_HASH = "3de6469472e83b00454c97417efd17b99ef74b63f1a35f03157e669b9a46eccca7b74f4bdb9273b4a895ac997bb2dee6ee04d50209849b74e4968edd95da8d6b"

RPROVIDES:${PN} += "libwpg-tools \
libwpg-tools(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
librevenge-0.0.so.0()(64bit) \
librevenge-generators-0.0.so.0()(64bit) \
librevenge-stream-0.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libwpg-0.3.so.3()(64bit)"

inherit rpm
