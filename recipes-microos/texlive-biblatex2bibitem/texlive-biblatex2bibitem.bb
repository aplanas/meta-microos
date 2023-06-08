SUMMARY = "Convert BibLaTeX-generated bibliography to bibitems"
DESCRIPTION = "Some journals accept the reference list only as \\bibitems. If \
you use BibTeX, there is no problem: just paste the content of \
the .bbl file into your document. However, there was no \
out-of-the-box way to do the same for biblatex, and you had to \
struggle with searching appropriate .bst files, or formatting \
your reference list by hand, or something like that. Using the \
workaround provided by this package solves the problem."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2.2svn61648"

RPM_NAME = "texlive-biblatex2bibitem-2023.201.0.0.2.2svn61648-53.1.noarch.rpm"
RPM_HASH = "cf0d4cda3b95beee53f90ea8f86878271df0e78d47ce4aa2dfebb8d73ea6bf2a32a7a9efcf25356cd6c678664cb9478e9fb31b8137130fa6007501f43688c2da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(biblatex2bibitem.sty) texlive-biblatex2bibitem"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(biblatex.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
