SUMMARY = "Control how text gets copied from a PDF file"
DESCRIPTION = "The repltext package exposes to LaTeX a relatively obscure PDF \
feature: replacement text. When replacement text is specified \
for a piece of text, it is the replacement text, not the \
typeset text that is copied and pasted."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn56433"

RPM_NAME = "texlive-repltext-2023.201.1.1svn56433-53.1.noarch.rpm"
RPM_HASH = "cec73f35dc1b38fde294bcd419a6e760f854d93704e66a3b11676a5954bd3772cc088e73ef0f75aed55985ce73e778f2f9a77c5f5d92359f9cbbefeb8c7bc75a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(repltext.sty) texlive-repltext"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(etoolbox.sty) tex(graphicx.sty) tex(hyperref.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
