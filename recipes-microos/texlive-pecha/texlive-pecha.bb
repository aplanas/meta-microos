SUMMARY = "Print Tibetan text in the classic pecha layout style"
DESCRIPTION = "The pecha class provides an environment for writing Tibetan on \
LaTeX2e in the traditional Tibetan Pecha layout used for \
spiritual or philosophical texts, using the cTib4TeX package by \
Oliver Corff. It provides features like headers in different \
languages, page numbering in Tibetan and more."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.1svn15878"

RPM_NAME = "texlive-pecha-2023.201.0.0.1svn15878-51.1.noarch.rpm"
RPM_HASH = "f04a1aaf6cf82f88bd4b6f70322d7ccfef146b58e5ac4c0be6ec97dab29e67bce666e217d06c3390a4019776cc4889fe9906bb5f1a2e356aba1a967f5a8afa3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ctibmantra.sty) \
tex(pecha.cls) \
texlive-pecha"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(calc.sty) \
tex(ctib.sty) \
tex(relsize.sty) \
tex(rotating.sty) \
tex(times.sty) \
tex(twoopt.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
