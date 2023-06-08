SUMMARY = "PoiretOne family of fonts with LaTeX support"
DESCRIPTION = "This package provides LaTeX, pdfLaTeX, XeLaTeX and LuaLaTeX \
support for the PoiretOne family of fonts, designed by Denis \
Masharov. PoiretOne is a decorative geometric grotesque with a \
hint of Art Deco and constructivism. There is currently just a \
regular weight and an artificially emboldened bold."
LICENSE = "OFL-1.1"

PV = "2023.201.svn64856"

RPM_NAME = "texlive-poiretone-2023.201.svn64856-52.1.noarch.rpm"
RPM_HASH = "ec01031122c5f528b2cc2e701cf526a114c12706a61ffdca3c166cdad2b4587869d79bc35119d774a4b52c850117ce69e8b4db84b8e7ec1b3e5a979b06d28aee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(LY1PoiretOne-LF.fd) tex(OT1PoiretOne-LF.fd) tex(PoiretOne-Bold-lf-ly1--base.tfm) tex(PoiretOne-Bold-lf-ly1.tfm) tex(PoiretOne-Bold-lf-ly1.vf) tex(PoiretOne-Bold-lf-ot1.tfm) tex(PoiretOne-Bold-lf-t1--base.tfm) tex(PoiretOne-Bold-lf-t1.tfm) tex(PoiretOne-Bold-lf-t1.vf) tex(PoiretOne-Bold-lf-ts1--base.tfm) tex(PoiretOne-Bold-lf-ts1.tfm) tex(PoiretOne-Bold-lf-ts1.vf) tex(PoiretOne-Regular-lf-ly1--base.tfm) tex(PoiretOne-Regular-lf-ly1.tfm) tex(PoiretOne-Regular-lf-ly1.vf) tex(PoiretOne-Regular-lf-ot1.tfm) tex(PoiretOne-Regular-lf-t1--base.tfm) tex(PoiretOne-Regular-lf-t1.tfm) tex(PoiretOne-Regular-lf-t1.vf) tex(PoiretOne-Regular-lf-ts1--base.tfm) tex(PoiretOne-Regular-lf-ts1.tfm) tex(PoiretOne-Regular-lf-ts1.vf) tex(PoiretOne.map) tex(PoiretOne.sty) tex(T1PoiretOne-LF.fd) tex(TS1PoiretOne-LF.fd) tex(prtn_2rdbwn.enc) tex(prtn_bjsotj.enc) tex(prtn_nt5tbh.enc) tex(prtn_opucty.enc) texlive-poiretone"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(fontaxes.sty) tex(fontenc.sty) tex(fontspec.sty) tex(ifluatex.sty) tex(ifxetex.sty) tex(mweights.sty) tex(textcomp.sty) tex(updmap.cfg) tex(xkeyval.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-poiretone-fonts texlive-scripts texlive-scripts-bin"

inherit rpm
