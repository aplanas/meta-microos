SUMMARY = "Extending the LaTeX doc system"
DESCRIPTION = "Xdoc is a project to rewrite the implementation of the LaTeX \
doc package (in a broader sense) to make its features more \
general and flexible. For example, where doc only provides \
commands for documenting macros and environments, xdoc also \
provides commands for similarly documenting package options and \
switches. This is furthermore done in such a way that it is \
very easy to add more such commands for documenting things, \
such as e.g., templates (an important concept in the future \
LaTeX3) and program components for other languages (functions, \
classes, procedures, etc.). A side effect is that many minor \
bugs in doc are fixed. The design aims to take advantage of \
many still experimental features of future versions of LaTeX, \
but since these are neither reasonably stable nor widely \
available, the configuration interfaces and package author \
commands of xdoc are likely to change. To still provide a \
stable interface for other packages to build upon, the actual \
package names include a 'major version number' of sorts. The \
drop-in replacement package for standard doc is xdoc2; it \
requires nothing outside standard LaTeX2e. The \
docindex/docidx2e package changes the index and list of changes \
typesetting so that none of the formatting has to be controlled \
via the index style file. The docindex package provides control \
of formatting via templates (nice interface, but requires \
several experimental packages), whereas the docidx2e package \
has traditional raw macro interfaces and works with standard \
LaTeX2e."
LICENSE = "LPPL-1.0"

PV = "2023.201.prot2.5svn15878"

RPM_NAME = "texlive-xdoc-2023.201.prot2.5svn15878-52.1.noarch.rpm"
RPM_HASH = "510e1e06057b04ce8a02a48b5beddf341826732084416501c4c3ef911ab5e1671513638f2c2382f4e804376d7836c0a41a55246c80d76ceda85b0bc326da49a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(docidx2e.sty) tex(docindex.sty) tex(xdoc2.sty) texlive-xdoc"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(doc.sty) tex(multicol.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
