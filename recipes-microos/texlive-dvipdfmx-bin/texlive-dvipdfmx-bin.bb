SUMMARY = "Binary files of dvipdfmx"
DESCRIPTION = "Binary files of dvipdfmx"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-dvipdfmx-bin-2023.20230311.svn65877-89.1.aarch64.rpm"
RPM_HASH = "123fb3d4144a4cf3dda12e24db41fed1e95ad124726eef3a25987b227f9966877089fe4d15561552f0248fd5c2a3814dc6e3b69ee592a02724fd90df54835be1"

RPROVIDES:${PN} += "texlive-dvipdfm-bin texlive-dvipdfmx-bin texlive-dvipdfmx-bin(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libkpathsea.so.6()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpaper.so.2()(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libz.so.1()(64bit) texlive-dvipdfmx texlive-scripts texlive-xetex-bin"

inherit rpm
