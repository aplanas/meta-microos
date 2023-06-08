SUMMARY = "Decoration of individual paragraphs"
DESCRIPTION = "Decorates individual paragraphs of a document, offering five \
pre-defined styles. The command offers an optional 'key-value' \
argument with the user may define parameters of the selected \
style. Predefined styles offer a spiral-notebook, a zebra-like, \
a dashed, a marked design, and an underlined style. Users may \
also define their own styles. Decorated paragraphs may not \
include displayed mathematics."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn58895"

RPM_NAME = "texlive-fancypar-2023.201.1.3svn58895-52.1.noarch.rpm"
RPM_HASH = "f517e7fc72d88149987ff013d50b6883f2bc2428d2fbcf265ebef998de212e5eb23eaa484c644a623f529876743c2e15d514efc561c49b4a222166341e7b8576"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(fancypar.sty) texlive-fancypar"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(tikz.sty) tex(xcolor.sty) tex(xkeyval.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
