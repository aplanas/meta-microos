SUMMARY = "Translate input files on the fly"
DESCRIPTION = "The package preprocesses input files to a Lua(La)TeX run, on \
the fly. The user defines Lua regular expressions to search for \
patterns and modify input lines (or entire paragraphs) \
accordingly, before TeX reads the material. In this way, \
documents may be prepared in a non-TeX language (e.g., some \
lightweight markup language) and turned into 'proper' TeX for \
processing. The source of the documentation is typed in such a \
lightweight language and is thus easily readable in a text \
editor (the PDF file is also available, of course); the \
transformation to TeX syntax via Interpreter's functions is \
explained in the documentation itself. Interpreter is \
implemented using the author's gates (lua version), and works \
for plain TeX and LaTeX, but not ConTeXt."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn27232"

RPM_NAME = "texlive-interpreter-2023.201.1.2svn27232-52.1.noarch.rpm"
RPM_HASH = "a71bac88f26ca44c97cd63ab1e1bf2170107575f34571e53f2380ab4f43ce4d65993f6d589d58984597383632657d6931edde016adda5eabbfaf829a99fb35c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(interpreter.sty) tex(interpreter.tex) texlive-interpreter"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
