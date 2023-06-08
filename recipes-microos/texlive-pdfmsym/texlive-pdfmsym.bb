SUMMARY = "PDF Math Symbols -- various drawn mathematical symbols"
DESCRIPTION = "This package defines a handful of mathematical symbols many of \
which are implemented via PDF's builtin drawing utility. It is \
intended for use with pdfTeX and LuaTeX and is supported by \
XeTeX to a lesser extent. Among the symbols it defines are some \
variants of commonly used ones, as well as more obscure symbols \
which cannot be as easily found in other TeX or LaTeX packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.0svn65324"

RPM_NAME = "texlive-pdfmsym-2023.201.1.1.0svn65324-51.1.noarch.rpm"
RPM_HASH = "f5389e2acc50e1e63edd5169576752852981ddfc4f4d79a75e701af2d9a030ce5caa16a3dd04e3bc2f95aef2c190c6ee15c33b57c3747118d08722795a040d5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pdfmsym.tex) texlive-pdfmsym"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
