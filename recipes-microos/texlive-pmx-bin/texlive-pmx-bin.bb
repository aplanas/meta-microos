SUMMARY = "Binary files of pmx"
DESCRIPTION = "Binary files of pmx"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-pmx-bin-2023.20230311.svn65877-89.1.aarch64.rpm"
RPM_HASH = "c06dd9755a5e0d71e140d011f4af31d09c825babfd158cf593ad2df691fb9d34f8194f08ae420d6fe6e4021f6496a82b109d1421fca8c4c5d0216860da591c40"

RPROVIDES:${PN} += "texlive-pmx-bin texlive-pmx-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) texlive-pmx"

inherit rpm
