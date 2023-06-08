SUMMARY = "Easily add boldface, italics and smallcaps"
DESCRIPTION = "This package allows the use of underscores and circumflexes to \
begin resp. end italic, bold or SMALLCAPS formatting, as an \
alternative to the standard LaTeX \\textit{...}, \\textbf{...} \
and/or \\textsc{...}. The meaning of underscore and circumflex \
in mathmode remain the same."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.4.0svn44543"

RPM_NAME = "texlive-easyformat-2023.201.1.4.0svn44543-53.1.noarch.rpm"
RPM_HASH = "dca3c7d066a5e02c07fd0b5d920f815af16f7a7dd97dcc72cb1fbd07579fdfe06442d4db69a1a2cf6a27e59b81bd0e801f427b1bcd64a4c9d4056d20b6229505"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(easyformat.sty) texlive-easyformat"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(expl3.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
