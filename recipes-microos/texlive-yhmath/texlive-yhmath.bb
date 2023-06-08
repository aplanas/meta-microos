SUMMARY = "Extended maths fonts for LaTeX"
DESCRIPTION = "The yhmath bundle contains fonts (in Metafont and type 1 \
format) and a LaTeX package for using them."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn54377"

RPM_NAME = "texlive-yhmath-2023.201.1.6svn54377-52.1.noarch.rpm"
RPM_HASH = "e1b03a8365e30e53e9fcbee379067618cb77130eeb8811ec1721ee084f224bcaa536beab8fb6fff66befaf858434e2eaa1f6461ec69fbc004b783e20c125b915"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(OMXyhex.fd) tex(yhcmex10.tfm) tex(yhcmex10.vf) tex(yhmath.map) tex(yhmath.sty) tex(yrcmex10.tfm) texlive-yhmath"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(amsmath.sty) tex(updmap.cfg) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin texlive-yhmath-fonts"

inherit rpm
