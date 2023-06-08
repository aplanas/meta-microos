SUMMARY = "Binary files of mflua"
DESCRIPTION = "Binary files of mflua"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-mflua-bin-2023.20230311.svn65877-89.1.aarch64.rpm"
RPM_HASH = "1fd0b859f548c51c7475f465f81eef901c35b895f241a193a6c84ddf24c18df26dcbf3f1c4fabb2e48b1475018f75282193239920cbf2f1322914b9d10c55af8"

RPROVIDES:${PN} += "texlive-mflua-bin texlive-mflua-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXt.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libkpathsea.so.6()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpotrace.so.0()(64bit) libtexlua53.so.5()(64bit) libtexluajit.so.2()(64bit) texlive-mflua"

inherit rpm
