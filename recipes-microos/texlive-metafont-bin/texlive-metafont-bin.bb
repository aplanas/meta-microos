SUMMARY = "Binary files of metafont"
DESCRIPTION = "Binary files of metafont"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-metafont-bin-2023.20230311.svn65877-89.1.aarch64.rpm"
RPM_HASH = "ca647369249c828856cbf8b578ed2d135a60a684d275d6673593d734906b805bc88e19786acdb8d730d21f47eb83d7eecee8fd517cb457908d99bbb1369e81cf"

RPROVIDES:${PN} += "texlive-metafont-bin texlive-metafont-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXt.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libkpathsea.so.6()(64bit) texlive-metafont"

inherit rpm
