SUMMARY = "Mathematics in Greek texts"
DESCRIPTION = "This package has been designed to facilitate the use of Greek \
letters in mathematical mode. The package allows one to \
directly type in Greek letters (in ISO 8859-7 encoding) in math \
mode."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn15878"

RPM_NAME = "texlive-elmath-2023.201.1.2svn15878-53.1.noarch.rpm"
RPM_HASH = "c03142174804fc09ad9c88b218a260713781dc1b7f66443ba4c512a97f02c11bcdcfa26e9a2fa987191a9e32c271d9f8da6f0da5c4d857437fef7aeb5b02ad56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(elmath.sty) texlive-elmath"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
