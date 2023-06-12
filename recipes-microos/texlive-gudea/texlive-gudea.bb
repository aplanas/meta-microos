SUMMARY = "The Gudea font face with support for LaTeX and pdfLaTeX"
DESCRIPTION = "This package provides the Gudea family of fonts designed by \
Agustina Mingote, with support for LaTeX and pdfLaTeX."
LICENSE = "OFL-1.1"

PV = "2023.201.0.0.0.1svn57359"

RPM_NAME = "texlive-gudea-2023.201.0.0.0.1svn57359-53.1.noarch.rpm"
RPM_HASH = "48cd6f1c2d5087e9a695a1c1a42305625c16f0a46d17f597d7a5c5b21e9e1586a47702366a7bc8964d90a9d1e6a7108a4b4ac2ecb9de7b01b5b4df41f6dbcdef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(Gudea-Bold-tlf-ly1--base.tfm) \
tex(Gudea-Bold-tlf-ly1--lcdfj.tfm) \
tex(Gudea-Bold-tlf-ly1.tfm) \
tex(Gudea-Bold-tlf-ly1.vf) \
tex(Gudea-Bold-tlf-ot1--base.tfm) \
tex(Gudea-Bold-tlf-ot1--lcdfj.tfm) \
tex(Gudea-Bold-tlf-ot1.tfm) \
tex(Gudea-Bold-tlf-ot1.vf) \
tex(Gudea-Bold-tlf-t1--base.tfm) \
tex(Gudea-Bold-tlf-t1--lcdfj.tfm) \
tex(Gudea-Bold-tlf-t1.tfm) \
tex(Gudea-Bold-tlf-t1.vf) \
tex(Gudea-Bold-tlf-ts1--base.tfm) \
tex(Gudea-Bold-tlf-ts1.tfm) \
tex(Gudea-Bold-tlf-ts1.vf) \
tex(Gudea-Italic-tlf-ly1--base.tfm) \
tex(Gudea-Italic-tlf-ly1--lcdfj.tfm) \
tex(Gudea-Italic-tlf-ly1.tfm) \
tex(Gudea-Italic-tlf-ly1.vf) \
tex(Gudea-Italic-tlf-ot1--base.tfm) \
tex(Gudea-Italic-tlf-ot1--lcdfj.tfm) \
tex(Gudea-Italic-tlf-ot1.tfm) \
tex(Gudea-Italic-tlf-ot1.vf) \
tex(Gudea-Italic-tlf-t1--base.tfm) \
tex(Gudea-Italic-tlf-t1--lcdfj.tfm) \
tex(Gudea-Italic-tlf-t1.tfm) \
tex(Gudea-Italic-tlf-t1.vf) \
tex(Gudea-Italic-tlf-ts1--base.tfm) \
tex(Gudea-Italic-tlf-ts1.tfm) \
tex(Gudea-Italic-tlf-ts1.vf) \
tex(Gudea-tlf-ly1--base.tfm) \
tex(Gudea-tlf-ly1--lcdfj.tfm) \
tex(Gudea-tlf-ly1.tfm) \
tex(Gudea-tlf-ly1.vf) \
tex(Gudea-tlf-ot1--base.tfm) \
tex(Gudea-tlf-ot1--lcdfj.tfm) \
tex(Gudea-tlf-ot1.tfm) \
tex(Gudea-tlf-ot1.vf) \
tex(Gudea-tlf-t1--base.tfm) \
tex(Gudea-tlf-t1--lcdfj.tfm) \
tex(Gudea-tlf-t1.tfm) \
tex(Gudea-tlf-t1.vf) \
tex(Gudea-tlf-ts1--base.tfm) \
tex(Gudea-tlf-ts1.tfm) \
tex(Gudea-tlf-ts1.vf) \
tex(Gudea.map) \
tex(Gudea.sty) \
tex(LY1Gudea-TLF.fd) \
tex(OT1Gudea-TLF.fd) \
tex(T1Gudea-TLF.fd) \
tex(TS1Gudea-TLF.fd) \
tex(a_i65yxe.enc) \
tex(a_lksl5v.enc) \
tex(a_qnu4g5.enc) \
tex(a_ys4752.enc) \
texlive-gudea"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(fontaxes.sty) \
tex(fontenc.sty) \
tex(ifthen.sty) \
tex(mweights.sty) \
tex(textcomp.sty) \
tex(updmap.cfg) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-gudea-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
