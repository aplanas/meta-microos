SUMMARY = "Allows selected environments to be included/excluded"
DESCRIPTION = "The package defines an environment that only typesets specified \
environments within its scope. So, for example, if you want \
nothing but the figure and table environments in your document, \
you can enclose the whole document with an xcomment environment \
that excludes everything but. This is a lot easier than \
excluding the chunks of text between the environments you want, \
or creating an entire document containing only those \
environments. The package was previously part of the seminar \
bundle for typesetting presentations."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn20031"

RPM_NAME = "texlive-xcomment-2023.201.1.3svn20031-52.1.noarch.rpm"
RPM_HASH = "4d141746c17f569048ba6f4cc955550089cd87df6c3f99e386bdf19fed12e9427c9a1acba4447d64de530f339142898ecd856c55e42d3f35562a1843cbbab50c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(xcomment.sty) tex(xcomment.tex) texlive-xcomment"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
