SUMMARY = "Generate modular addition and multiplication tables"
DESCRIPTION = "This package is developed to generate modular addition and \
multiplication tables for positive integers. It provides an \
easy way to generate modular addition and modular \
multiplication tables for positive integers in LaTeX documents. \
The commands in the package have optional arguments for the \
formatting of tables. These commands can be used in an \
environment similar to a tabular or array environment. The \
commands can also be used with the booktabs package, which \
provides nice formatting of tables in LaTeX. It is written in \
Lua, and TeX file is to be compiled with LuaLaTeX engine."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn65485"

RPM_NAME = "texlive-luamodulartables-2023.201.1.0svn65485-52.1.noarch.rpm"
RPM_HASH = "e7c57b0e38ea2a5c4dbb2cf89f0750c402b26440da550e481891ab9af55b17a03a5c63da0b4d9916a40e0e20b6fe4d58812078efc1377a561d22e52db7162e1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(luamodulartables.sty) texlive-luamodulartables"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(luacode.sty) tex(xkeyval.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
