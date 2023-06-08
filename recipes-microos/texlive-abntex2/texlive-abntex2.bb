SUMMARY = "Typeset technical and scientific Brazilian documents based on ABNT rules"
DESCRIPTION = "The bundle provides support for typesetting technical and \
scientific Brazilian documents (like academic thesis, articles, \
reports, research project and others) based on the ABNT rules \
(Associacao Brasileira de Normas Tecnicas). It replaces the old \
abntex."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.9.7svn49248"

RPM_NAME = "texlive-abntex2-2023.201.1.9.7svn49248-54.1.noarch.rpm"
RPM_HASH = "3c26f864979a33129ccc9dcbc58d0aef11a6820bfa2ae5e5d44d66464fa6748decfd29cfa87855ff0fca4f8bb7fcd65dbdff47f416007fb06acd18bfb9444fec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(abntex2.cls) tex(abntex2abrev.sty) tex(abntex2cite.sty) texlive-abntex2"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(babel.sty) tex(bookmark.sty) tex(breakurl.sty) tex(calc.sty) tex(enumitem.sty) tex(hyperref.sty) tex(ifpdf.sty) tex(ifthen.sty) tex(ifxetex.sty) tex(memoir.cls) tex(relsize.sty) tex(setspace.sty) tex(textcase.sty) tex(url.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
