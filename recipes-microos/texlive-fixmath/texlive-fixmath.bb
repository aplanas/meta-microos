SUMMARY = "Make maths comply with ISO 31-0:1992 to ISO 31-13:1992"
DESCRIPTION = "LaTeX's default style of typesetting mathematics does not \
comply with the International Standards ISO 31-0:1992 to ISO \
31-13:1992 which require that uppercase Greek letters always be \
typset upright, as opposed to italic (even though they usually \
represent variables) and allow for typsetting of variables in a \
boldface italic style (even though the required fonts are \
available). This package ensures that uppercase Greek be \
typeset in italic style, that upright $\\Delta$ and $\\Omega$ \
symbols are available through the commands \\upDelta and \
\\upOmega; and provides a new math alphabet \\mathbold for \
boldface italic letters, including Greek. This package used to \
be part of the was bundle, but has now become a package in its \
own right."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.9.1svn64648"

RPM_NAME = "texlive-fixmath-2023.201.0.0.9.1svn64648-52.1.noarch.rpm"
RPM_HASH = "bbd8d9ad74f1a33642dc5597e235ed78b0897b54f6811e2d2dfb7131573275f1c7d7157079fe0286d2f8e466845c3b8efa38548b21b33b450970d40786f80c48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(fixmath.sty) texlive-fixmath"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
