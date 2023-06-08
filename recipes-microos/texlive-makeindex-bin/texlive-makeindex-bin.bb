SUMMARY = "Binary files of makeindex"
DESCRIPTION = "Binary files of makeindex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-makeindex-bin-2023.20230311.svn65877-89.1.aarch64.rpm"
RPM_HASH = "793df6d2786c141a744f59b85b49b5c1e47764ce1a60b25a92bed16a29aa57ed3d48b525dc24a7dd0196d35309193fe4a7f008f64d7d0e2370ff2be6974e9758"

RPROVIDES:${PN} += "texlive-makeindex-bin texlive-makeindex-bin(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libkpathsea.so.6()(64bit) texlive-makeindex"

inherit rpm
