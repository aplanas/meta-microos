SUMMARY = "BibLaTeX styles for use in German humanities"
DESCRIPTION = "The package provides a collection of styles for BibLaTeX \
(version 3.5 is required, currently). It was designed for \
citations in German Humanities, especially film studies, and \
offers some features that are not provided by the standard \
BibLaTeX styles. The style is highly optimized for documents \
written in German, and the main documentation is only available \
in German."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.7svn45876"

RPM_NAME = "texlive-biblatex-fiwi-2023.201.1.7svn45876-53.1.noarch.rpm"
RPM_HASH = "b8273937add7a63e0694132479ab7cdb6fc9acdf67b41d864c950196aaf8d0add4e3642c163eda1e08b81560196e8fe6cb0ea0a8e74d985012c0d7124e090b09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(fiwi-yearbeginning.bbx) \
tex(fiwi.bbx) \
tex(fiwi.cbx) \
tex(fiwi2.bbx) \
tex(fiwi2.cbx) \
texlive-biblatex-fiwi"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ragged2e.sty) \
tex(standard.bbx) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
