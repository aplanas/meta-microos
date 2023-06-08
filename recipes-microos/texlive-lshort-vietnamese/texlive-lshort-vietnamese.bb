SUMMARY = "Vietnamese version of the LaTeX introduction"
DESCRIPTION = "Vietnamese version of A Short Introduction to LaTeX2e."
LICENSE = "LPPL-1.0"

PV = "2023.201.4.00svn55643"

RPM_NAME = "texlive-lshort-vietnamese-2023.201.4.00svn55643-52.1.noarch.rpm"
RPM_HASH = "ff03b82c9225c1550cabb6b448cd69b1b2126937e77f7167dc5b81dd78d0c0c983c0e25c5785256bb0e0ec330101b121b11d12a1561e2a2219a76d62a871f791"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-vietnamese"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
