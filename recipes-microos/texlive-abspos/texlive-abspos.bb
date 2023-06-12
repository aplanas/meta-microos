SUMMARY = "Absolute placement with coffins"
DESCRIPTION = "This package lets you place contents at an absolute position, \
anchored at some specified part of the contents, similar to how \
TikZ nodes work, though without using the two-pass strategy of \
TikZ. It also avoids messing with the order of beamer overlays, \
which is what happens when one uses the textpos package with \
the overlay option. The solution used is quite straightforward, \
combining coffins (using l3coffins) with the placement \
mechanisms of atbegshi."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn64465"

RPM_NAME = "texlive-abspos-2023.201.0.0.1svn64465-54.1.noarch.rpm"
RPM_HASH = "98dbe7daa9073ccf2f55eedec5aab2ef7248122d4c437d340c412ddfea258418e48c6fe62cf1fbc1b8875da76ad1a4af598ec2a243b718b5ded27a6c7a69678e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(abspos.sty) \
texlive-abspos"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(atbegshi.sty) \
tex(expl3.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
