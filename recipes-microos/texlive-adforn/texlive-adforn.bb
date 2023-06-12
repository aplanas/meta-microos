SUMMARY = "OrnementsADF font with TeX/LaTeX support"
DESCRIPTION = "The bundle provides the Ornements ADF font in PostScript type 1 \
format with TeX/LaTeX support files. The font is licensed under \
GPL v2 or later with font exception. (See NOTICE, COPYING, \
README.) The TeX/LaTeX support is licensed under LPPL. (See \
README, manifest.txt.)"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1bsvn54512"

RPM_NAME = "texlive-adforn-2023.201.1.1bsvn54512-54.1.noarch.rpm"
RPM_HASH = "d4a4ccb0780d2acb0e81e78a0d27ff76070d6c273a297aca28b8fb6aefbb223880f203fe4edc393f9bba96ffe1774e7b47f8db33355eeeeb21d62124e2b84a49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(OrnementsADF.enc) \
tex(OrnementsADF.map) \
tex(OrnementsADF.tfm) \
tex(adforn.sty) \
tex(uornementsadf.fd) \
texlive-adforn"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(pifont.sty) \
tex(updmap.cfg) \
texlive \
texlive-adforn-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
