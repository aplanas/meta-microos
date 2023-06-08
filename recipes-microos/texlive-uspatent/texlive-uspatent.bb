SUMMARY = "U.S. Patent Application Tools for LaTeX and LyX"
DESCRIPTION = "The package provides a class and other tools for developing a \
beautifully formatted, consistent U.S. Patent Application using \
LaTeX and/or LyX."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn27744"

RPM_NAME = "texlive-uspatent-2023.201.1.0svn27744-53.1.noarch.rpm"
RPM_HASH = "9136d5614605d6a9b37f3ca8f3a3e38c0c16be33165ba4e8f5976ac8607d350911c2e762b44ef20175a3cd0953cc4e2d5c7fc5ba23d273c3df562c2d25ae6324"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(uspatent.cls) texlive-uspatent"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(acronym.sty) tex(amsmath.sty) tex(babel.sty) tex(enumitem.sty) tex(fontenc.sty) tex(graphicx.sty) tex(lmodern.sty) tex(memhfixc.sty) tex(memoir.cls) tex(prettyref.sty) tex(tikz.sty) tex(xspace.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
