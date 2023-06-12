SUMMARY = "LaTeX package for multiple-choice questions"
DESCRIPTION = "This package adjusts the choices of the multiple-choice \
question automatically. It has been wholly inspired by the work \
of Enrico Gregorio and improved by Vafa Khalighi and I've just \
packed and redistributed it under the name of the \
multiple-choice package."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn63722"

RPM_NAME = "texlive-multiple-choice-2023.201.0.0.2svn63722-54.1.noarch.rpm"
RPM_HASH = "da13168fb504af8d86c43fea3d2c39c0eee5d431d8d3b67a1ea30226d2a5f0b0937b7d81c3001537a9fde2661182b59704290f5c8eeda9c02d6d235d3158b36b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(multiple-choice.sty) \
texlive-multiple-choice"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(biditools.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
