SUMMARY = "Class for 'Logic and Philosophy of Science'"
DESCRIPTION = "The 'Logic and Philosophy of Science' journal is an online \
publication of the University of Trieste (Italy). The class \
builds on the standard article class to offer a format that \
LaTeX authors may use when submitting to the journal."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7svn21322"

RPM_NAME = "texlive-lps-2023.201.0.0.7svn21322-54.1.noarch.rpm"
RPM_HASH = "049e172ca8cb9aa5d68f95df79cee5ddc0244435d2ce05427a79e5ebc6cc03188e243165d93c58d219ac126f6a778297334e25277ee8ec5612e54115117c7f97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(lps.cls) \
texlive-lps"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(article.cls) \
tex(geometry.sty) \
tex(lastpage.sty) \
tex(mathptmx.sty) \
tex(titlesec.sty) \
tex(titletoc.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
