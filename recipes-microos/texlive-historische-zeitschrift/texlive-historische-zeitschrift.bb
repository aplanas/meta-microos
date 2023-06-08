SUMMARY = "BibLaTeX style for the journal 'Historische Zeitschrift'"
DESCRIPTION = "The package provides citations according with the house style \
of the 'Historische Zeitschrift', a German historical journal. \
The scheme is a fullcite for the first citation and 'Author, \
Shorttitle (as note N, P)' for later citations (P being the \
page number). For further details, see the description of the \
house style at the journal's site. The package depends on \
BibLaTeX (version 3.3 or higher) as well as etoolbox (version \
1.5 or higher)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn42635"

RPM_NAME = "texlive-historische-zeitschrift-2023.201.1.2svn42635-53.1.noarch.rpm"
RPM_HASH = "aa8a35a37baca8b4b2f8eb742841a9411e9626a023e3c0476ac826ba59f27ca880cc3afa90c9c865f1656d4c8cc5feebe96f53053ce167d910ebc1a57f3d540f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(historische-zeitschrift.bbx) tex(historische-zeitschrift.cbx) tex(historische-zeitschrift.lbx) texlive-historische-zeitschrift"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
