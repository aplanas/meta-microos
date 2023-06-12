SUMMARY = "Typeset a curriculum vitae"
DESCRIPTION = "Currvita is a package rather than a class (like most other \
curriculum vitae offerings). The author considers that a \
curriculum vitae can quite reasonably form part of another \
document (such as a letter, or a dissertation)."
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.svn15878"

RPM_NAME = "texlive-currvita-2023.204.svn15878-54.1.noarch.rpm"
RPM_HASH = "6e94c6690dbe7b98795967b21026fc94b8e2f1d99971253014bcee9bd9a87fc28b4e6cd16d282fbdb2d927ffe290b1569bb0097a3f96bdb033c0217d6a557843"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(currvita.sty) \
texlive-currvita"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifthen.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
