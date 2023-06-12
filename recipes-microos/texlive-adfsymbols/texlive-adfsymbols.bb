SUMMARY = "SymbolsADF with TeX/LaTeX support"
DESCRIPTION = "The package provides Arkandis foundry's ArrowsADF and \
BulletsADF fonts in Adobe Type 1 format, together with \
TeX/LaTeX support files."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2bsvn54512"

RPM_NAME = "texlive-adfsymbols-2023.201.1.2bsvn54512-54.1.noarch.rpm"
RPM_HASH = "c4a6ca403fab73510778b8e7b2f970aaf4a2918a6ba328b50df0f181513498e7d2d37018e5b30011240d954e47a82275b60ffa4b7db3bb8549a9188ed874807b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ArrowsADF.map) \
tex(ArrowsADF.tfm) \
tex(BulletsADF.map) \
tex(BulletsADF.tfm) \
tex(SymbolsADF.enc) \
tex(adfarrows.sty) \
tex(adfbullets.sty) \
tex(uarrowsadf.fd) \
tex(ubulletsadf.fd) \
texlive-adfsymbols"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(fp.sty) \
tex(pifont.sty) \
tex(updmap.cfg) \
texlive \
texlive-adfsymbols-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
