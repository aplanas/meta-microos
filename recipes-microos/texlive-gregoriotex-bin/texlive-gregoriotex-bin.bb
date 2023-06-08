SUMMARY = "Binary files of gregoriotex"
DESCRIPTION = "Binary files of gregoriotex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-gregoriotex-bin-2023.20230311.svn65877-89.1.aarch64.rpm"
RPM_HASH = "2ebb88cb3beec9d946ebbc2ace67d4f3dc5d469ef36e4eb8a18be914f34defd78c1590f26503646c3c882a5fb153032deeb03d2d1a5671f344f698fa20af471c"

RPROVIDES:${PN} += "texlive-gregoriotex-bin texlive-gregoriotex-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libkpathsea.so.6()(64bit) texlive-gregoriotex"

inherit rpm
