SUMMARY = "Macros related to 'Introdktion til LaTeX'"
DESCRIPTION = "The bundle contains various macros either used for creating the \
author's book 'Introduktion til LaTeX' (in Danish), or \
presented in the book as code tips. The bundle comprises: \
dlfltxbcodetips: various macros helpful in typesetting \
mathematics; dlfltxbmarkup: provides macros used throughout, \
for registering macro names, packages etc. in the text, in the \
margin and in the index, all by using categorised keys (note, a \
configuration file may be used; a sample is included in the \
distribution); dlfltxbtocconfig: macros for the two tables of \
contents that the book has; dlfltxbmisc: various macros for \
typesetting LaTeX arguments, and the macro used in the \
bibliography that can wrap a URL up into a BibTeX entry. \
Interested parties may review the book itself on the web at the \
author's institution (it is written in Danish)."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn17337"

RPM_NAME = "texlive-dlfltxb-2023.201.svn17337-52.1.noarch.rpm"
RPM_HASH = "279fb837ec07f3f03541342af00e2087928d0a3e955107fe3be314a8cb9c19cede8772d2f4c2957a5e7594f0a7c5682b2237abb5814ded431cf21c8fb292710c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(dlfltxbcodetips.sty) tex(dlfltxbmarkup.sty) tex(dlfltxbmarkupbookkeys.sty) tex(dlfltxbmisc.sty) tex(dlfltxbtocconfig.sty) texlive-dlfltxb"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(amsmath.sty) tex(amssymb.sty) tex(calc.sty) tex(chngpage.sty) tex(graphicx.sty) tex(keyval.sty) tex(ragged2e.sty) tex(url.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
