SUMMARY = "Binary files of vlna"
DESCRIPTION = "Binary files of vlna"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn62210"

RPM_NAME = "texlive-vlna-bin-2023.20230311.svn62210-89.1.aarch64.rpm"
RPM_HASH = "98830abb39b043fb9cf01bf58a61c1400b434ad550a2b4b5156cce30dc5342890c2deb009c68d3dd4b799257c92b33b3c82060828e9146d9d54428769c0e0e1d"

RPROVIDES:${PN} += "texlive-vlna-bin texlive-vlna-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) texlive-vlna"

inherit rpm
