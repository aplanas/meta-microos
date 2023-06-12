SUMMARY = "LaTeX-based interactive PDF on the Web"
DESCRIPTION = "The package interactiveworkbook gives the user the ability to \
write LaTeX documents which, ultimately, create interactive \
question-and-answer Portable Document Format (PDF) tutorials \
meant to be used by Internet students and that, in particular, \
freely use mathematical notation."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-interactiveworkbook-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "bd1f5762a03167c57b800da5cdb6e4cd9c666d15e1d7abb85a22178a1ff56d9846acca506be46cabcaacd007936aa93f2190f602dbee48b1824121a069f5b561"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(interactiveworkbook-web.sty) \
tex(interactiveworkbook.sty) \
texlive-interactiveworkbook"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(color.sty) \
tex(epsfig.sty) \
tex(ifthen.sty) \
tex(xspace.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
