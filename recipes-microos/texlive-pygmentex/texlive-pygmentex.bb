SUMMARY = "Use Pygments to format code listings in documents"
DESCRIPTION = "PygmenTeX is a Python-based LaTeX package that can be used for \
typesetting code listings in a LaTeX document using Pygments. \
Pygments is a generic syntax highlighter for general use in all \
kinds of software such as forum systems, wikis or other \
applications that need to prettify source code."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.11svn64131"

RPM_NAME = "texlive-pygmentex-2023.201.0.0.11svn64131-53.1.noarch.rpm"
RPM_HASH = "d93858b616d8befe11e135ce2f34b25741e683cc917c71380cc8a03f25c518f5e8c624dbc5de3503441b588d56a94a201491b90a169d39217248ac0ed67b8843"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pygmentex.sty) texlive-pygmentex"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3 coreutils ed findutils grep sed tex(caption.sty) tex(color.sty) tex(efbox.sty) tex(fancyvrb.sty) tex(ifthen.sty) tex(mdframed.sty) tex(pgfkeys.sty) tex(shellesc.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-pygmentex-bin texlive-scripts texlive-scripts-bin"

inherit rpm
