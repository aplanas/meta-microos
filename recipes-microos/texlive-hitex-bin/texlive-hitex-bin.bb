SUMMARY = "Binary files of hitex"
DESCRIPTION = "Binary files of hitex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-hitex-bin-2023.20230311.svn65877-89.1.aarch64.rpm"
RPM_HASH = "db259d334d0a647b3b9f73d30f8383ee2f63b95ac437676415f5d0cc91f3c8be6da17e0c60c3ce2859c4e8ba99c956a596d0503f504543be3cf8dacc6be97990"

RPROVIDES:${PN} += "texlive-hitex-bin texlive-hitex-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libkpathsea.so.6()(64bit) libz.so.1()(64bit) texlive-hitex"

inherit rpm
