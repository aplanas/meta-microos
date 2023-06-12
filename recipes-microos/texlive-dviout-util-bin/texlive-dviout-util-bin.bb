SUMMARY = "Binary files of dviout-util"
DESCRIPTION = "Binary files of dviout-util"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-dviout-util-bin-2023.20230311.svn65877-91.1.aarch64.rpm"
RPM_HASH = "5d98c1f1d1aa07a00e69339abfcc7c0caaf4c1e456ec0b99c80c8241c1365cc288018f58f1e66cc07cf19c664a4e5231227c075b43256345e0371e1d57d0312e"

RPROVIDES:${PN} += "texlive-dviout-util-bin texlive-dviout-util-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libptexenc.so.1()(64bit) texlive-dviout-util"

inherit rpm
