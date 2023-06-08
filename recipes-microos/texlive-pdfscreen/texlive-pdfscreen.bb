SUMMARY = "Support screen-based document design"
DESCRIPTION = "An extension of the hyperref package to provide a screen-based \
document design. This package helps to generate pdf documents \
that are readable on screen and will fit the screen's aspect \
ratio. Also it can be used with various options to produce \
regular print versions of the same document without any extra \
effort."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn42428"

RPM_NAME = "texlive-pdfscreen-2023.201.1.5svn42428-51.1.noarch.rpm"
RPM_HASH = "61c4a6bdec87cc354e98aff232b5ea2f398bb7309e911fb55efc1ae3a1458e222ffe7c1c936d73122d4e0430845385caea47b354bb128098c708ff090e17cd17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pdfscreen.sty) texlive-pdfscreen"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(amsbsy.sty) tex(amssymb.sty) tex(calc.sty) tex(color.sty) tex(comment.sty) tex(fancybox.sty) tex(graphicx.sty) tex(hyperref.sty) tex(shortvrb.sty) tex(truncate.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
