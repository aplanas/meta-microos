SUMMARY = "Text and character manipulation in PSTricks"
DESCRIPTION = "Pst-text is a PSTricks based package for plotting text along a \
different path and manipulating characters. It includes the \
functionality of the old package pst-char."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.02svn49542"

RPM_NAME = "texlive-pst-text-2023.201.1.02svn49542-53.1.noarch.rpm"
RPM_HASH = "8e70507429bd721d5cb3eaa67c843c0dc382565c9d3da20e57942a34f52fd4ec9f273785594ea1b6cc782a41d292ac3299f08d1be126aa19d00b9302a5fa7f37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-char.sty) tex(pst-text.sty) tex(pst-text.tex) texlive-pst-text"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(pstricks.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
