SUMMARY = "A YAML parser and tool for easy LaTeX definition creation"
DESCRIPTION = "This LuaLaTeX package provides a YAML parser and some functions \
to declare and define LaTeX definitions using YAML files."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn64949"

RPM_NAME = "texlive-yamlvars-2023.201.svn64949-52.1.noarch.rpm"
RPM_HASH = "38f4a9d3fe169504171a1aeacf4c49f241fba16bd0928bdcc8603f72a9fc74544b358bd93c25162bdc1922b0f9e4ece27de2234345331b8098b1eb6988770d06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(yamlvars.sty) \
texlive-yamlvars"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(etoolbox.sty) \
tex(luacode.sty) \
tex(penlight.sty) \
tex(xspace.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
