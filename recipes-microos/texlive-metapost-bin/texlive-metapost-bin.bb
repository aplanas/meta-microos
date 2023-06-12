SUMMARY = "Binary files of metapost"
DESCRIPTION = "Binary files of metapost"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-metapost-bin-2023.20230311.svn65877-91.1.aarch64.rpm"
RPM_HASH = "e3b3ddb4fac17846b4a3535e069038fd1130b254287820494dc64e5c32a9de8416470cf40c18a26d87821b568d5cef7c8e076b3d93ae5c9bd663c4970b3bb53f"

RPROVIDES:${PN} += "texlive-metapost-bin \
texlive-metapost-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libkpathsea.so.6()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmpfr.so.6()(64bit) \
libpixman-1.so.0()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libz.so.1()(64bit) \
texlive-metapost"

inherit rpm
