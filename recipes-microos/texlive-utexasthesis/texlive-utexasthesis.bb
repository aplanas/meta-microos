SUMMARY = "University of Texas at Austin graduate thesis style"
DESCRIPTION = "This class file complies with the Digital Submission \
Requirement for Masters and Ph.D. thesis submissions of the \
University of Texas at Austin."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn48648"

RPM_NAME = "texlive-utexasthesis-2023.201.1.0svn48648-53.1.noarch.rpm"
RPM_HASH = "57579c799a078e8fdec3dc2142dee4868cc130aff62f65010900dc89e20c413b5fb2b2743d5f1a872e7a722899f59f471b58bc4bbf6f77384106d12757d2a969"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(utexasthesis.cls) \
texlive-utexasthesis"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(doi.sty) \
tex(fontenc.sty) \
tex(geometry.sty) \
tex(hyperref.sty) \
tex(indentfirst.sty) \
tex(natbib.sty) \
tex(report.cls) \
tex(setspace.sty) \
tex(tocbibind.sty) \
tex(tocloft.sty) \
tex(url.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
