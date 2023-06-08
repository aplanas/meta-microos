SUMMARY = "Binary files of dtl"
DESCRIPTION = "Binary files of dtl"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-dtl-bin-2023.20230311.svn65877-89.1.aarch64.rpm"
RPM_HASH = "586191011fa5887f68545583cbe748785899a5293376cc02fc58d93deb5ba3345bec2d6ac582e684445845e3f37419a1feb1d4ef75c3780b340d6a7c38f790a4"

RPROVIDES:${PN} += "texlive-dtl-bin texlive-dtl-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libkpathsea.so.6()(64bit) texlive-dtl"

inherit rpm
