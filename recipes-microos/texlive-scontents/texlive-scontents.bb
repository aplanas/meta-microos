SUMMARY = "Stores LaTeX contents in memory or files"
DESCRIPTION = "This package stores valid LaTeX code in memory (sequences) \
using the l3seq module of expl3. The stored content (including \
verbatim) can be used as many times as desired in the document, \
additionally can be written to external files if desired."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn62902"

RPM_NAME = "texlive-scontents-2023.201.2.0svn62902-53.1.noarch.rpm"
RPM_HASH = "0ae311ecffa18c58ff73316f879fa6e9e5b40bccead6a2d3699e6b038fedc7d1f2b5fae259c3a21f5b2bb1f538565f5e7a71399a3508a0811b36e800c069bf1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(scontents-code.tex) \
tex(scontents.sty) \
tex(scontents.tex) \
texlive-scontents"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(l3keys2e.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
