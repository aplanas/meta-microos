SUMMARY = "Binary files of tex4ht"
DESCRIPTION = "Binary files of tex4ht"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn62210"

RPM_NAME = "texlive-tex4ht-bin-2023.20230311.svn62210-89.1.aarch64.rpm"
RPM_HASH = "f46395287b4819b26d6e6d2b770c30873e01e6a32d809c98314754db4ca12ae5b44fa5d9db939f089e5f1afad7826dbfe8a0bacefdf8020150abc64537177ef5"

RPROVIDES:${PN} += "texlive-tex4ht-bin texlive-tex4ht-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libkpathsea.so.6()(64bit) texlive-tex4ht"

inherit rpm
