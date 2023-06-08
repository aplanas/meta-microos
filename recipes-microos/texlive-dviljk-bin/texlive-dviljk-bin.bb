SUMMARY = "Binary files of dviljk"
DESCRIPTION = "Binary files of dviljk"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-dviljk-bin-2023.20230311.svn65877-89.1.aarch64.rpm"
RPM_HASH = "c07179d41d52f445ddb751e709707214859b2eff45ee4398c97a07fbb203fe7577d34cd9f59b444aa88c719b75c731c840eb222d04bc289af3754e709a6292ab"

RPROVIDES:${PN} += "texlive-bin-dvilj texlive-dviljk-bin texlive-dviljk-bin(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libkpathsea.so.6()(64bit) texlive-dviljk"

inherit rpm
