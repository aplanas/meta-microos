SUMMARY = "Produce a table of contents for each chapter, part or section"
DESCRIPTION = "The minitoc package allows you to add mini-tables-of-contents \
(minitocs) at the beginning of every chapter, part or section. \
There is also provision for mini-lists of figures and of \
tables. At the part level, they are parttocs, partlofs and \
partlots. If the type of document does not use chapters, the \
basic provision is section level secttocs, sectlofs and \
sectlots. The package has provision for language-specific \
configuration of its own 'fixed names', using .mld files \
(analagous to babel .ldf files that do that job for LaTeX's own \
fixed names)."
LICENSE = "LPPL-1.0"

PV = "2023.201.62svn61719"

RPM_NAME = "texlive-minitoc-2023.201.62svn61719-54.1.noarch.rpm"
RPM_HASH = "e9c0f735f3c20a4fb88c969dda51985f131b5425b36650873d3dce38da143c5d131ff41f3de5490d9fedf8f79d4eb130e246eea7ae0efb5060f22c11b649c6d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(minitoc.sty) \
tex(mtcmess.sty) \
tex(mtcoff.sty) \
tex(mtcpatchmem.sty) \
texlive-minitoc"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(flafter.sty) \
tex(notoccite.sty) \
tex(placeins.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
