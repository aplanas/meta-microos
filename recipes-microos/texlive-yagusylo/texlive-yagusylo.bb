SUMMARY = "A symbol loader"
DESCRIPTION = "The name is by way of being an acronym for 'Yet Another Grand \
Unified Symbols Loader'... The package allows the user to \
access a symbol without loading the package that usually \
provides it; this has the advantage of avoiding the name \
clashes that so commonly trouble those who load \
symbol-packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn29803"

RPM_NAME = "texlive-yagusylo-2023.201.1.2svn29803-52.1.noarch.rpm"
RPM_HASH = "883838ca862e6758b29ff51bff41d539d42154c05ff20978848d4ad5dfdc66b41d63e4e4ff5c842d4034fc83f0509e2871d49362dd0c95e526ea2f247da5886e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(yagusylo.cfg) \
tex(yagusylo.sty) \
texlive-yagusylo"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(suffix.sty) \
tex(xargs.sty) \
tex(xcolor.sty) \
tex(xifthen.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
