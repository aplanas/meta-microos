SUMMARY = "Binary files of mflua"
DESCRIPTION = "Binary files of mflua"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-mflua-bin-2023.20230311.svn65877-91.1.aarch64.rpm"
RPM_HASH = "0ce746a6127a7e31f94cb2ad2a06b8c53d3f30e7409e96fee5a80357e7bb058e5a44b110bc967bb60ed97498135a3f2e0217fd268fa735502ee521630af537fd"

RPROVIDES:${PN} += "texlive-mflua-bin texlive-mflua-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXt.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libkpathsea.so.6()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpotrace.so.0()(64bit) libtexlua53.so.5()(64bit) libtexluajit.so.2()(64bit) texlive-mflua"

inherit rpm
