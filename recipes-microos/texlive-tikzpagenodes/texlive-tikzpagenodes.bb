SUMMARY = "A single TikZ node for the whole page"
DESCRIPTION = "The package provides special PGF/TikZ nodes for the text, \
marginpar, footer and header area of the current page. They are \
inspired by the 'current page' node defined by PGF/TikZ itself."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn64967"

RPM_NAME = "texlive-tikzpagenodes-2023.201.1.1svn64967-52.1.noarch.rpm"
RPM_HASH = "00bf424e6939bf6ad6d6f77275ea621fd99c584441ed50026e5b868a469cdacdb143367b9381d6b6e41f0663a9e235b7fb034e1ba9fc97a2bba9764498b3e074"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tikzpagenodes.sty) \
texlive-tikzpagenodes"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifoddpage.sty) \
tex(tikz.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
