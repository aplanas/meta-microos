SUMMARY = "Write graphviz (dot+neato) inline in LaTeX documents"
DESCRIPTION = "The package allows inline use of graphviz code, in a LaTeX \
document."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.94svn31517"

RPM_NAME = "texlive-graphviz-2023.201.0.0.94svn31517-53.1.noarch.rpm"
RPM_HASH = "74779b57c6024340038687ae16f1009c8532441e929a65d31e0d010062f64d97f4801c7bf320b430f851fe7ce94f3f70c9621cbc57bf908a184fc76ea392b0af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(graphviz.sty) texlive-graphviz"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(graphicx.sty) tex(psfrag.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
