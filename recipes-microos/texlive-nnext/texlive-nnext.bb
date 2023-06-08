SUMMARY = "Extension for the gb4e package"
DESCRIPTION = "This is an add-on for the gb4e package used in linguistics. It \
implements the \\Next, \\NNext, \\Last, and \\LLast commands from \
the linguex package or the \\nextx, \\anextx, \\lastx, \\blastx, \
and \\bblastx commands from the expex package."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.0svn56575"

RPM_NAME = "texlive-nnext-2023.201.0.0.0svn56575-54.1.noarch.rpm"
RPM_HASH = "0f0aae46079d023a8f714f168cbfb9ec8bdd0c5922c98fa726cdc350e5140f50211c7fbe984faad5b05326860925415c7b4a39f34e72e7bf7ea07ce401c224ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(nnext.sty) texlive-nnext"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(ifthen.sty) tex(xspace.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
