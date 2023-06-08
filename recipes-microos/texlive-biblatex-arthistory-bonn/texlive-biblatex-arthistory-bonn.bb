SUMMARY = "BibLaTeX citation style covers the citation and bibliography guidelines for art historians"
DESCRIPTION = "This citation style covers the citation and bibliography \
guidelines of the Kunsthistorisches Institut der Universitat \
Bonn for undergraduates. It introduces bibliography entry types \
for catalogs and features a tabular bibliography, among other \
things. Various options are available to change and adjust the \
outcome according to one's own preferences. The style is \
compatible with English and German."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn46637"

RPM_NAME = "texlive-biblatex-arthistory-bonn-2023.201.1.2svn46637-53.1.noarch.rpm"
RPM_HASH = "dac3ca93986fdf870e461e232efc56c9d90ff3723c3efbe3f185bffce5744a86ddf1b7fd3baff84b86316df895201ddfdd6ca43f38e74596d986193197d45a96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(arthistory-bonn-english.lbx) tex(arthistory-bonn-german.lbx) tex(arthistory-bonn.bbx) tex(arthistory-bonn.cbx) texlive-biblatex-arthistory-bonn"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(authoryear-ibid.cbx) tex(authoryear.bbx) tex(csquotes.sty) tex(xpatch.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
