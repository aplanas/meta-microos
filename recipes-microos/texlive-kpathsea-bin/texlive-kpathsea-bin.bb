SUMMARY = "Binary files of kpathsea"
DESCRIPTION = "Binary files of kpathsea"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-kpathsea-bin-2023.20230311.svn65877-89.1.aarch64.rpm"
RPM_HASH = "ebf2f97482dd4256345139a1ec9d3475764822e61422550eb83886931049cce7b75df854506ea0673352ff92291a1d322f770bcbb8a277cc7d5fa5aebb72497e"

RPROVIDES:${PN} += "texlive-kpathsea-bin texlive-kpathsea-bin(aarch-64)"
RDEPENDS:${PN} += "/bin/sh group(mktex) ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libkpathsea.so.6()(64bit) permissions texlive-filesystem texlive-gsftopk-bin texlive-kpathsea texlive-scripts-bin user(mktex)"

inherit rpm
