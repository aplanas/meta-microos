SUMMARY = "Shorter (and longer) underlines and underbars"
DESCRIPTION = "Some engineers need underlined or twice underlined variables \
for which the usual \\underline is too long. This package \
provides a generic command for creating underlines of various \
sizes and types."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2svn32261"

RPM_NAME = "texlive-ushort-2023.201.2.2svn32261-53.1.noarch.rpm"
RPM_HASH = "f4358040c4f20d01e3af17181172b868476590c16a618c802f36f6abe0c1150a725f0d1177d20a8e67132431e98c207e29a8b46ffbe2d17daa6e430128825a91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ushort.sty) \
texlive-ushort"
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
