SUMMARY = "Binary files of xpdfopen"
DESCRIPTION = "Binary files of xpdfopen"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn62210"

RPM_NAME = "texlive-xpdfopen-bin-2023.20230311.svn62210-89.1.aarch64.rpm"
RPM_HASH = "154ef5f2a762d8c419ebf72e67866f802dd0122f1a07428ae52c1c0e21f9ae5bd3ca86a0b2206c610f470fe97a3509ce03527a8bf0e5a49918e5ad6352fdfb43"

RPROVIDES:${PN} += "texlive-xpdfopen-bin texlive-xpdfopen-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) texlive-xpdfopen"

inherit rpm
