SUMMARY = "Correction of some limitation of the citepages=omit option of BibLaTeX styles"
DESCRIPTION = "This package deals with a limitation of the citepages=omit \
option of the verbose family of BibLaTeX citestyles. The option \
works when you \\cite[xx]{key}, but not when you \\cite[\\pno~xx, \
some text]{key}. The package corrects this problem."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0.0svn44653"

RPM_NAME = "texlive-biblatex-true-citepages-omit-2023.201.2.0.0svn44653-53.1.noarch.rpm"
RPM_HASH = "11fe3444565c620c3c0669dd2cb9f31813a406e24d367731b70d5555eda817b39b0cabac3574563c214b07661e1d137b910b6160271eb80e5f2c7d036a34070e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(biblatex-true-citepages-omit.sty) texlive-biblatex-true-citepages-omit"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(xstring.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
