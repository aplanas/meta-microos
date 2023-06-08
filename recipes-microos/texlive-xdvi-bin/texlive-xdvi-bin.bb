SUMMARY = "Binary files of xdvi"
DESCRIPTION = "Binary files of xdvi"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-xdvi-bin-2023.20230311.svn65877-89.1.aarch64.rpm"
RPM_HASH = "d08a61a1cccdc65528c43389e58f005af7c599fe47140b878ab22a4497cc2bd0805f12e8a6369254c51a4219e655f30928100f29c3b99894e7d45b4401e35d65"

RPROVIDES:${PN} += "texlive-xdvi-bin texlive-xdvi-bin(aarch-64)"
RDEPENDS:${PN} += "/bin/bash ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXaw3d.so.8()(64bit) libXi.so.6()(64bit) libXmu.so.6()(64bit) libXpm.so.4()(64bit) libXt.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libfreetype.so.6()(64bit) libkpathsea.so.6()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) texlive-xdvi"

inherit rpm
