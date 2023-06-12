SUMMARY = "Binary files of tie"
DESCRIPTION = "Binary files of tie"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-tie-bin-2023.20230311.svn65877-91.1.aarch64.rpm"
RPM_HASH = "b2580ff448f0838df8790c675bdc0f7e5655f7990b8bc4bde27e74578d029712993741c011954af13bb0307e9c38d555981ddc465ef9896c9b58eb8af6a25505"

RPROVIDES:${PN} += "texlive-tie-bin \
texlive-tie-bin(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libkpathsea.so.6()(64bit) \
texlive-tie"

inherit rpm
