SUMMARY = "Plain TeX formats and documents for upTeX"
DESCRIPTION = "The bundle contains plain TeX format files and documents for \
upTeX and and e-upTeX."
LICENSE = "BSD-3-Clause"

PV = "2023.201.svn65802"

RPM_NAME = "texlive-uptex-base-2023.201.svn65802-53.1.noarch.rpm"
RPM_HASH = "4aa3b7f370af9d64a7bc4491b5bf0f4522a2f5ac67b24714bc861cd6ad42a77df424cfb02a15d41ac006ecf15ce8c1bc2a75834bd87070d3375b419adb774e3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ukinsoku.tex) \
tex(uptex.tex) \
texlive-uptex-base"
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
