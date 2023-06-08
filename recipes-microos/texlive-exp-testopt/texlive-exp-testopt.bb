SUMMARY = "Expandable \\@testopt (and related) macros"
DESCRIPTION = "The package provides an expandable variant of the LaTeX kernel \
command \\@testopt, named \\@expandable@testopt, and a more \
general \\@expandable@ifopt, both intended for package writers. \
Also we have a variant of \\newcommand which uses these macros \
to check for optional arguments."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn15878"

RPM_NAME = "texlive-exp-testopt-2023.201.0.0.3svn15878-52.1.noarch.rpm"
RPM_HASH = "ca037176758810717eb8261a2df02630b47e13714316f8349b51387e6eec146acb063dfc8d4ada2d3b2af44a7e1a1c583bc77bf734814480dcee84b8066c110d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(exp-testopt.sty) texlive-exp-testopt"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
