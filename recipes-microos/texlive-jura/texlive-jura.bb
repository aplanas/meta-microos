SUMMARY = "A document class for German legal texts"
DESCRIPTION = "Implements the standard layout for German term papers in law \
(one-and-half linespacing, 7 cm margins, etc.). Includes \
alphanum that permits alphanumeric section numbering (e.g., A. \
Introduction; III. International Law)."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.4.3svn15878"

RPM_NAME = "texlive-jura-2023.201.4.3svn15878-55.1.noarch.rpm"
RPM_HASH = "603b20a14d997ccd90afc786c5032b81bc83d5bc5c7084dbaf09148879e64087e27a526b0e848494279b2502c54e76456b3ad6e08df88e2c25bd60bb88adaa6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(alphanum.sty) \
tex(jura.cls) \
texlive-jura"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(report.cls) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
