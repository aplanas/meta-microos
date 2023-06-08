SUMMARY = "Binary files of tex"
DESCRIPTION = "Binary files of tex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-tex-bin-2023.20230311.svn65877-89.1.aarch64.rpm"
RPM_HASH = "398ffc6c66154222063027ae65b45da0435e9e442b66adf08fd7a189717709bac3d4a79fa9ab9ca8b904e3c497c0aafd35786dd88f790f1242f842a9ea2e131c"

RPROVIDES:${PN} += "texlive-tex-bin texlive-tex-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libkpathsea.so.6()(64bit) texlive-tex"

inherit rpm
