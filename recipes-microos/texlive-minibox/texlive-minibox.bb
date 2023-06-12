SUMMARY = "A simple type of box for LaTeX"
DESCRIPTION = "This small package provides a convenient input syntax for boxes \
that don't break their text over lines automatically, but do \
allow manual line breaks. The boxes shrink to the natural width \
of the longest line they contain."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2asvn30914"

RPM_NAME = "texlive-minibox-2023.201.0.0.2asvn30914-54.1.noarch.rpm"
RPM_HASH = "0479bc2ad3a1d9a11bfcd5e23f6a466805fa623bfc4274a623ea66dbf59c19b8cc6d16c192da538140aafd123c96dfb1716412b751c0ac25e7eb7b449cbf2601"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(minibox.sty) \
texlive-minibox"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(expl3.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
