SUMMARY = "Binary files of m-tx"
DESCRIPTION = "Binary files of m-tx"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-m-tx-bin-2023.20230311.svn65877-89.1.aarch64.rpm"
RPM_HASH = "930c472ae3145e0d2a98c6d0f77ef064c6068d00a0f5903ff00a081e260ef2c048c869f532a7081f1e1ee6a2dc17711cac1802e5010df694c8dd9e6a7a3446f2"

RPROVIDES:${PN} += "texlive-m-tx-bin texlive-m-tx-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) texlive-m-tx"

inherit rpm
