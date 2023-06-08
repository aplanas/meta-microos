SUMMARY = "Multiple use of the same footnote text"
DESCRIPTION = "Provides a \\DeclareFixedFootnote command to provide a single \
command for a frequently-used footnote. The package ensures \
that only one instance of the footnote text appears on each \
page (LaTeX needs to be run several times to achieve this)."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3asvn17131"

RPM_NAME = "texlive-fixfoot-2023.201.0.0.3asvn17131-52.1.noarch.rpm"
RPM_HASH = "e1473ae4cdf92f984a5afb2b10ce13372c23b481c40150d7bf93703283b523cb283a37325f3ad409dd0abc375f19d5914e208ff29bfa7d54aa5fb1ad93bbfd8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(fixfoot.sty) texlive-fixfoot"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
