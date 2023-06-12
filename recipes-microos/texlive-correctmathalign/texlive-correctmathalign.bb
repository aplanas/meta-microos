SUMMARY = "Correct spacing of the alignment in expressions"
DESCRIPTION = "This package realigns the horizontal spacing of the alignments \
in some mathematical environments."
LICENSE = "BSD-3-Clause"

PV = "2023.204.1.1svn44131"

RPM_NAME = "texlive-correctmathalign-2023.204.1.1svn44131-54.1.noarch.rpm"
RPM_HASH = "644b92afa96abaca74fbb50d21c4f80a99832b34825d50124843489098325bb75442204b444848a6192203582821d2cfe5e4c92a5b957482d99ad105d75e7188"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(correctmathalign.sty) \
texlive-correctmathalign"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
