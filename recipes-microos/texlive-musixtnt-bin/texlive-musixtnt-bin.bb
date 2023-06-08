SUMMARY = "Binary files of musixtnt"
DESCRIPTION = "Binary files of musixtnt"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn62210"

RPM_NAME = "texlive-musixtnt-bin-2023.20230311.svn62210-89.1.aarch64.rpm"
RPM_HASH = "5db1ba1e0eba33a5ca4e656f7c4dfbb28c7018bec603a5b081d99afe15b0a1847c26446645afcbc66184eb981fa2d35807efe1099edbc029e0979d690e437efb"

RPROVIDES:${PN} += "texlive-musixtnt-bin texlive-musixtnt-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) texlive-musixtnt"

inherit rpm
