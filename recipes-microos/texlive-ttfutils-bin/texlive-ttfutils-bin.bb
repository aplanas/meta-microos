SUMMARY = "Binary files of ttfutils"
DESCRIPTION = "Binary files of ttfutils"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-ttfutils-bin-2023.20230311.svn65877-89.1.aarch64.rpm"
RPM_HASH = "6648583e408b8a38af74768903533aa6d95b11f96fa68017efcdadff2ac564c75bea7839817e6c5f3489b09ebc5abd4f91a4ab5bcd64d65d33ac0cd79d00a287"

RPROVIDES:${PN} += "texlive-ttfutils-bin texlive-ttfutils-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libfreetype.so.6()(64bit) libkpathsea.so.6()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) texlive-ttfutils"

inherit rpm
