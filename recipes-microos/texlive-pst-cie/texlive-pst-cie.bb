SUMMARY = "CIE color space"
DESCRIPTION = "pst-cie is a PSTricks related package to show the different CIE \
color spaces: Adobe, CIE, ColorMatch, NTSC, Pal-Secam, \
ProPhoto, SMPTE, and sRGB."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.06bsvn60959"

RPM_NAME = "texlive-pst-cie-2023.201.1.06bsvn60959-52.1.noarch.rpm"
RPM_HASH = "f3a9f1d32d2d7b84c01a35e834b1c18f1230c107180c430002fd612074a8c6a480e3c0540da72b673cc4ca8668fa7845c455c06f4b8f8460d31fa40ac91a247e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-cie.sty) tex(pst-cie.tex) texlive-pst-cie"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(pstricks.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
