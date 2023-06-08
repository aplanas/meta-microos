SUMMARY = "Binary files of dvipng"
DESCRIPTION = "Binary files of dvipng"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-dvipng-bin-2023.20230311.svn65877-89.1.aarch64.rpm"
RPM_HASH = "89e360445cf1cfeae31370a539d543ca20b60dbdb76e48d4e3fa286bce1e139185f62dbc360ad74238443807b79f3e3a9999306390830aca80ff969446fff8ed"

RPROVIDES:${PN} += "texlive-dvipng-bin texlive-dvipng-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libfreetype.so.6()(64bit) libgd.so.3()(64bit) libkpathsea.so.6()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) texlive-dvipng"

inherit rpm
