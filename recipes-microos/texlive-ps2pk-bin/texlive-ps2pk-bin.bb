SUMMARY = "Binary files of ps2pk"
DESCRIPTION = "Binary files of ps2pk"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-ps2pk-bin-2023.20230311.svn65877-89.1.aarch64.rpm"
RPM_HASH = "ed416481024c851eb0fd2c6dee39a560b3b44e6530dc6c8ab44e1764bad3ab0655574e991a54be79883e94ccfd8d587508761b7cc54ee17838722b09db1b4e38"

RPROVIDES:${PN} += "texlive-ps2pk-bin texlive-ps2pk-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libkpathsea.so.6()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) texlive-ps2pk"

inherit rpm
