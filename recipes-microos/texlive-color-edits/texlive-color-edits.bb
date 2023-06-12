SUMMARY = "Colorful edits for multiple authors of a shared document"
DESCRIPTION = "This package provides a fairly light-weight solution for \
annotating LaTeX source code with color to show \
additions/changes, replacements, deletions, and comments. This \
is particularly useful when a document is being edited by \
multiple authors. Two package options allow the quick \
suppression of all colorful edits and comments, and showing \
text whose deletion was proposed."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn56707"

RPM_NAME = "texlive-color-edits-2023.201.1.1svn56707-53.1.noarch.rpm"
RPM_HASH = "958db6cb1c96ba7f64ca5ed4505f99bd0742b54fdd6d0291ccc6036a8fc018f7ea276011e46bf76a173457841eb3f682c81db7c5b93265df58f79dd9366af156"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(color-edits.sty) \
texlive-color-edits"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(color.sty) \
tex(ifthen.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
