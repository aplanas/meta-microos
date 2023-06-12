SUMMARY = "Binary files of ttfutils"
DESCRIPTION = "Binary files of ttfutils"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-ttfutils-bin-2023.20230311.svn65877-91.1.aarch64.rpm"
RPM_HASH = "251934125bb01f9414371ec57f59bc8fbb1f8070688a856e182ea9d4fcd0a735ae7b683859cffbc049217d8f3d8b950d368b87ca7d112785627acfabc124cf58"

RPROVIDES:${PN} += "texlive-ttfutils-bin texlive-ttfutils-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libfreetype.so.6()(64bit) libkpathsea.so.6()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) texlive-ttfutils"

inherit rpm
