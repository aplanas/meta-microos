SUMMARY = "Typeset with a randomly variable monospace font"
DESCRIPTION = "The typewriter package uses the OpenType Computer Modern \
Unicode Typewriter font, together with a LuaTeX virtual font \
setup that introduces random variability in grey level and \
angle of each character. It was originally an answer to a \
question on stackexchange."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn46641"

RPM_NAME = "texlive-typewriter-2023.201.1.1svn46641-52.1.noarch.rpm"
RPM_HASH = "097e78b20872af9a2ccc3cec03c3b66dbc6fc56235a678968860f5fb5e62988f7562c93a93c2d2b751e0ee6c29eac0684887d8d48958a3ab742768013f5c3b85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(typewriter.sty) \
texlive-typewriter"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(luaotfload.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
