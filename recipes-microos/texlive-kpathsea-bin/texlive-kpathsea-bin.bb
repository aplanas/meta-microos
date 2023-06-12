SUMMARY = "Binary files of kpathsea"
DESCRIPTION = "Binary files of kpathsea"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-kpathsea-bin-2023.20230311.svn65877-91.1.aarch64.rpm"
RPM_HASH = "e128db8517010a5d6a55a620b39a79add5788eefcb216463b8fca78573831642587a3cb3fd1571ecb057177c28baf730bf4d95c3d456f23b51aa8affbc5d3145"

RPROVIDES:${PN} += "texlive-kpathsea-bin texlive-kpathsea-bin(aarch-64)"
RDEPENDS:${PN} += "/bin/sh group(mktex) ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libkpathsea.so.6()(64bit) permissions texlive-filesystem texlive-gsftopk-bin texlive-kpathsea texlive-scripts-bin user(mktex)"

inherit rpm
