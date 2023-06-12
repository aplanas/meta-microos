SUMMARY = "BibLaTeX style for Springer Lecture Notes in Computer Science"
DESCRIPTION = "This is a BibLaTeX style for Springer Lecture Notes in Computer \
Science (LNCS). It extends the standard BiBTeX model by an \
acronym entry."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.6svn65280"

RPM_NAME = "texlive-biblatex-lncs-2023.201.0.0.6svn65280-53.1.noarch.rpm"
RPM_HASH = "a9760d4ee57d2a82db4c1d68c2388ec2aa96ac3b024a8f5050ced2d57bca50b9ec979b51b1acf05b78881740713bed63b634e1fd3a859f3859950e2a1d6cb82c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(lncs.bbx) \
tex(lncs.cbx) \
texlive-biblatex-lncs"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(numeric.bbx) \
tex(numeric.cbx) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
