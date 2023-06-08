SUMMARY = "Convert 'Ghostscript fonts' to PK files"
DESCRIPTION = "Designed for use with xdvi and dvips this utility converts \
Adobe Type 1 fonts to PK bitmap format. It should not \
ordinarily be much used nowadays, since both its target \
applications are now capable of dealing with Type 1 fonts, \
direct."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.19.2svn52851"

RPM_NAME = "texlive-gsftopk-2023.201.1.19.2svn52851-53.1.noarch.rpm"
RPM_HASH = "956d769963c2d790f222df100f00a7cc69b9d078ebaf3dd2d30310c9b551e4369a6ce10a86cb5f9af352eba00515fce539cd647e1b3992d306429213d70b4ba9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gsftopk"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-gsftopk-bin texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
