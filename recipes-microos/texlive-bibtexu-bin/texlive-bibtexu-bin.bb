SUMMARY = "Binary files of bibtexu"
DESCRIPTION = "Binary files of bibtexu"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-bibtexu-bin-2023.20230311.svn65877-89.1.aarch64.rpm"
RPM_HASH = "7bb906941bb9f2251c1d7ea9856835e914d6d4add21d794a3c3824b7064d8c06c3c5d13ab4308dc6ea6c187ce6842213939f79aa2e58fed39c629116ac641c9a"

RPROVIDES:${PN} += "texlive-bibtexu-bin texlive-bibtexu-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libicui18n.so.72()(64bit) libicuuc.so.72()(64bit) libkpathsea.so.6()(64bit) texlive-bibtexu"

inherit rpm
