SUMMARY = "Extremely configurable ellipses with formats for various style manuals"
DESCRIPTION = "The xellipsis package provides a system for configuring \
(almomst) every possible aspect of ellipses, including \
preceding and proceeding characters; the character itself; \
distances before and after each of these; and number of \
characters. It comes with both a compatibility option for \
standard LaTeX \\ldots as well as preset package options for the \
Chicago Manual of Style (Turabian); the Bluebook; and MLA \
guidelines."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn47546"

RPM_NAME = "texlive-xellipsis-2023.201.2.0svn47546-52.1.noarch.rpm"
RPM_HASH = "29c99298b05bc1ecb6c83ebde6b98c5af1e4c349a5ac276857490013c567ddc43d7486f5e2860f7bc41d9286e89941f861c50139cbbe683f723346bb7d4fbb5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(xellipsis.sty) texlive-xellipsis"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(xkeyval.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
