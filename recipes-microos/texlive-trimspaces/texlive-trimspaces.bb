SUMMARY = "Trim spaces around an argument or within a macro"
DESCRIPTION = "A very short package that allows you to expandably remove \
spaces around a token list (commands are provided to remove \
spaces before, spaces after, or both); or to remove surrounding \
spaces within a macro definition, or to define space-stripped \
macros."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn15878"

RPM_NAME = "texlive-trimspaces-2023.201.1.1svn15878-52.1.noarch.rpm"
RPM_HASH = "97b714267af4288d5d28f7e8cb39732f979c399c18679e7a6003de3b8b2763fddef3464fb80c53c36b5dad38f53b20c763df8709b18bf1dfa3d2211a7a2ca42c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(trimspaces.sty) \
texlive-trimspaces"
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
