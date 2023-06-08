SUMMARY = "Binary files of texware"
DESCRIPTION = "Binary files of texware"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-texware-bin-2023.20230311.svn65877-89.1.aarch64.rpm"
RPM_HASH = "5389f0c3fc3fde83b73e9ca2e638863affa994616bb738e35c96e0f8f917b6afc831b4907d39699471e2d13fb51f5eb8e91467244e2da6757f2ac85dd8cf65d7"

RPROVIDES:${PN} += "texlive-texware-bin texlive-texware-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libkpathsea.so.6()(64bit) texlive-texware"

inherit rpm
