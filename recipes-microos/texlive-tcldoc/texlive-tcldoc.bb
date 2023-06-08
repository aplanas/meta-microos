SUMMARY = "Doc/docstrip for tcl"
DESCRIPTION = "The tclldoc package and class simplify the application of the \
doc/docstrip style of literate programming with Dr. John \
Ousterhout's Tool Command Language (Tcl, pronounced 'tickle', \
a.k.a. The Cool Language). The tclldoc package is a bit like \
the doc package is for LaTeX, whereas the tclldoc class more \
parallels the ltxdoc class."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.40svn22018"

RPM_NAME = "texlive-tcldoc-2023.201.2.40svn22018-54.1.noarch.rpm"
RPM_HASH = "db72831f9aca5c0903b8bbb9965990faf3338e6f0669e81a8461427e3b97d7312060ec9a1650b9593aed8fbbccd46a106ed85106090bc3b43cb643a413ec63ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tcldoc.cls) tex(tcldoc.sty) tex(tclldoc.cls) tex(tclldoc.sty) texlive-tcldoc"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(article.cls) tex(docidx2e.sty) tex(rtkinenc.sty) tex(xdoc2.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
