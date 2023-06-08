SUMMARY = "A Greek font, from one such by Baskerville"
DESCRIPTION = "The font is a digital implementation of Baskerville's classic \
Greek font, provided by the Greek Font Society. The font covers \
Greek only, and LaTeX support provides for the use of LGR \
encoding."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn19440"

RPM_NAME = "texlive-gfsbaskerville-2023.201.1.0svn19440-52.1.noarch.rpm"
RPM_HASH = "5198a7c25310e65faae38a18d3519416debc5c5aa0d35fe82843bdeb211696785a57bec7d495b3f4b3f0c556e34e9a436a7c77131136762441a442048c8c1b0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(gfsbaskerville.map) tex(gfsbaskerville.sty) tex(ggfsbaskervillerg6a.tfm) tex(ggfsbaskervillerg6a.vf) tex(ggfsbaskervillerg6r.tfm) tex(gpgfsbaskerville.enc) tex(lgrgfsbaskerville.fd) texlive-gfsbaskerville"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(updmap.cfg) texlive texlive-filesystem texlive-gfsbaskerville-fonts texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
