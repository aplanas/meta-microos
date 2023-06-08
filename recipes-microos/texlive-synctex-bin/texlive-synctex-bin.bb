SUMMARY = "Binary files of synctex"
DESCRIPTION = "Binary files of synctex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66084"

RPM_NAME = "texlive-synctex-bin-2023.20230311.svn66084-89.1.aarch64.rpm"
RPM_HASH = "0f9591e0fea3ca41493fc897f40cc5ff28ef91c1e4c5032d2a4d55ff34164ab3c6bd6d52a2962d31bf1daed6992b7fe25a44524d86b8d86e34cbc963b530ebf5"

RPROVIDES:${PN} += "texlive-synctex-bin texlive-synctex-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libsynctex.so.2()(64bit) texlive-synctex"

inherit rpm
