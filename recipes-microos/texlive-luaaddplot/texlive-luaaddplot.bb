SUMMARY = "An extension to pgfplots' \\addplot macro"
DESCRIPTION = "This package is an extension to pgfplots. It extends the \
\\addplot macro by a facility which allows modification of data \
files while they are read. With luaaddplot it is no longer \
necessary to pre-process data files generated by measuring \
devices with external scripts. This package can be used with \
plain LuaTeX or LuaLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn62842"

RPM_NAME = "texlive-luaaddplot-2023.201.1.0svn62842-52.1.noarch.rpm"
RPM_HASH = "8c7a938dd412defbf13166bfdbb79b9235f0297f7ef105f786f0aaa3eda05877b9176df57116a54fa60997551e34fca55f151ca0b641dc2756e52460f3a9f45c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(luaaddplot.sty) \
tex(luaaddplot.tex) \
texlive-luaaddplot"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
