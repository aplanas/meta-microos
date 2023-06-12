SUMMARY = "Binary files of hitex"
DESCRIPTION = "Binary files of hitex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-hitex-bin-2023.20230311.svn65877-91.1.aarch64.rpm"
RPM_HASH = "c567ed113bfed05c7e5a89a0212adc14c03a8919e9cbd7b1ae3306a2bd2d0864ec3a749e80b0a360fe6ab4b334daf287b2255a682d40b9ae8ebf3ad37c7c3822"

RPROVIDES:${PN} += "texlive-hitex-bin \
texlive-hitex-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libkpathsea.so.6()(64bit) \
libz.so.1()(64bit) \
texlive-hitex"

inherit rpm
