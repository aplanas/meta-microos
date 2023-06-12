SUMMARY = "Binary files of bibtexu"
DESCRIPTION = "Binary files of bibtexu"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-bibtexu-bin-2023.20230311.svn65877-91.1.aarch64.rpm"
RPM_HASH = "3e41d31bd7e91681379b0c8f2dda9f583ba8af35ca83e3935985814f2e5de7e079a042722f7006760a5ff4b749437ab95ddc66227f1837f17a794b579c9050e8"

RPROVIDES:${PN} += "texlive-bibtexu-bin \
texlive-bibtexu-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libicui18n.so.73()(64bit) \
libicuuc.so.73()(64bit) \
libkpathsea.so.6()(64bit) \
texlive-bibtexu"

inherit rpm
