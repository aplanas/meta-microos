SUMMARY = "A simple literate programming tool based on clojure's pamphlet system"
DESCRIPTION = "The Clojure pamphlet system is a system based on the Clojure \
literate system. In the Clojure's pamphlet system you have your \
main LaTeX file, which can be compiled regularly. This file \
contains documentation and source code (just like in other \
forms of literate programming). These code snippets are wrapped \
in the chunk environment, hence they can be recognized by the \
tangler in order to extract them. Chunks can be included inside \
each other by the getchunk command (which will be typesetted \
acordingly). Finally, the LaTeX file will be run through the \
tangler to get the desired chunk of code."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.3svn60981"

RPM_NAME = "texlive-clojure-pamphlet-2023.201.1.3svn60981-53.1.noarch.rpm"
RPM_HASH = "b228fd7006bcf16a0a2adecae89b8b5a1ede12c0520d413385b248d55e9ce9fcea281fc0c6ee24d7880852aafe30a310d120c4f5c4d63e206f3c23fd48c198e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(clojure-pamphlet.sty) texlive-clojure-pamphlet"
RDEPENDS:${PN} += "/bin/sh /usr/bin/perl coreutils ed findutils grep perl(Getopt::Long) perl(Pod::Usage) perl(strict) perl(vars) perl(warnings) sed tex(hyperref.sty) tex(listings.sty) texlive texlive-clojure-pamphlet-bin texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
