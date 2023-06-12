SUMMARY = "Highlight code and demos with l3regex and lpeg"
DESCRIPTION = "This package uses the l3regex package from the LaTeX3 \
Programming Layer to parse and highlight source code and demos. \
It is more powerful than the listings package, and more easy to \
use than minted. But it is slower than both of them. Therefore \
in LuaTeX the package provides another way to highlight code: \
using LPeg (Parsing Expression Grammars for Lua). LPeg is much \
more powerful and faster than l3regex."
LICENSE = "LPPL-1.0"

PV = "2023.201.2023asvn65787"

RPM_NAME = "texlive-codehigh-2023.201.2023asvn65787-53.1.noarch.rpm"
RPM_HASH = "04ebb68764cc80eb3837b3a7d2647082e720a1b3577daf5b0382c4b6037b7cd3a50a1c30e6800256ba83503b05890f929c2b1ac934254439cc2e6cf96214e043"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(codehigh.sty) \
texlive-codehigh"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(catchfile.sty) \
tex(expl3.sty) \
tex(iftex.sty) \
tex(luatexbase.sty) \
tex(ninecolors.sty) \
tex(varwidth.sty) \
tex(xcolor.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
