SUMMARY = "Binary files of dviout-util"
DESCRIPTION = "Binary files of dviout-util"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-dviout-util-bin-2023.20230311.svn65877-89.1.aarch64.rpm"
RPM_HASH = "c2963ac887b64f98274c61876677435bfdf95857142311fd3f6c5a18ed9b7954530d0a58478f72a3464d60460f702d0f9dc023f4c6cdf5d5313e4734e655853a"

RPROVIDES:${PN} += "texlive-dviout-util-bin texlive-dviout-util-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libptexenc.so.1()(64bit) texlive-dviout-util"

inherit rpm
