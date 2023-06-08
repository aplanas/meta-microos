SUMMARY = "Binary files of bibtex8"
DESCRIPTION = "Binary files of bibtex8"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-bibtex8-bin-2023.20230311.svn65877-89.1.aarch64.rpm"
RPM_HASH = "cad395734998d181ed14d06154175ed2a9348eb1c1d1492728758b0e5402ff55254bf08460bd84a5f13219ffb9ee4509422da3127bc15932ce7110a1c6c20f3b"

RPROVIDES:${PN} += "texlive-bibtex8-bin texlive-bibtex8-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libkpathsea.so.6()(64bit) texlive-bibtex8"

inherit rpm
