SUMMARY = "LaTeX macros for Linguistics"
DESCRIPTION = "Numerous minor LaTeX enhancements for linguistics, including \
multiple accents on the same letter, interline glosses \
(word-by-word translations), Discourse Representation \
Structures, and example numbering."
LICENSE = "LPPL-1.0"

PV = "2023.204.2.8svn64241"

RPM_NAME = "texlive-covington-2023.204.2.8svn64241-54.1.noarch.rpm"
RPM_HASH = "db9bac2785018a1c64bd178f2735f57bfb0868e7989dd8d34130758d67360f18e551c39cdc8b73b2d14cc508ad2e0e172a3fcc4266bf37d19eefe2ad5bb08437"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(covington.sty) \
texlive-covington"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(iftex.sty) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
