SUMMARY = "Allow LuaTeX to load external Lua packages"
DESCRIPTION = "This package allows LuaTeX to load packages from the default \
package.path and package.cpath locations. This could be useful \
to load external Lua modules, including modules installed via \
LuaRocks. This package requires ifluatex."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn54779"

RPM_NAME = "texlive-luapackageloader-2023.201.0.0.2svn54779-52.1.noarch.rpm"
RPM_HASH = "78b1130863e1710b657185a8972b602599970c466f5515099b8fc13530f67b5d100f302b8205baf051462e172d6c90c8f2dfeb9b63c96d96ad8e6708a5c3d5b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(luapackageloader.sty) texlive-luapackageloader"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(ifluatex.sty) texlive texlive-filesystem texlive-iftex texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
