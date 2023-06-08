SUMMARY = "Gillius fonts with LaTeX support"
DESCRIPTION = "This package provides LaTeX, pdfLaTeX, XeLaTeX and LuaLaTeX \
support for the Gillius and Gillius No. 2 families of sans \
serif fonts and condensed versions of them, designed by Hirwen \
Harendal. According to the designer, the fonts were inspired by \
Gill Sans."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn64865"

RPM_NAME = "texlive-gillius-2023.201.svn64865-52.1.noarch.rpm"
RPM_HASH = "e937f5be804b04ae629848945c169872fa05c607df0f8dc0ef529c34b7bc4952e66ec92943138f2d989cecd785cde6df3d0ff4d316393bb8bac05d0953267ab4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(GilliusADF-Bold-lf-ly1--base.tfm) tex(GilliusADF-Bold-lf-ly1--lcdfj.tfm) tex(GilliusADF-Bold-lf-ly1.tfm) tex(GilliusADF-Bold-lf-ly1.vf) tex(GilliusADF-Bold-lf-ot1--base.tfm) tex(GilliusADF-Bold-lf-ot1--lcdfj.tfm) tex(GilliusADF-Bold-lf-ot1.tfm) tex(GilliusADF-Bold-lf-ot1.vf) tex(GilliusADF-Bold-lf-t1--base.tfm) tex(GilliusADF-Bold-lf-t1--lcdfj.tfm) tex(GilliusADF-Bold-lf-t1.tfm) tex(GilliusADF-Bold-lf-t1.vf) tex(GilliusADF-Bold-lf-ts1--base.tfm) tex(GilliusADF-Bold-lf-ts1.tfm) tex(GilliusADF-Bold-lf-ts1.vf) tex(GilliusADF-BoldItalic-lf-ly1--base.tfm) tex(GilliusADF-BoldItalic-lf-ly1--lcdfj.tfm) tex(GilliusADF-BoldItalic-lf-ly1.tfm) tex(GilliusADF-BoldItalic-lf-ly1.vf) tex(GilliusADF-BoldItalic-lf-ot1--base.tfm) tex(GilliusADF-BoldItalic-lf-ot1--lcdfj.tfm) tex(GilliusADF-BoldItalic-lf-ot1.tfm) tex(GilliusADF-BoldItalic-lf-ot1.vf) tex(GilliusADF-BoldItalic-lf-t1--base.tfm) tex(GilliusADF-BoldItalic-lf-t1--lcdfj.tfm) tex(GilliusADF-BoldItalic-lf-t1.tfm) tex(GilliusADF-BoldItalic-lf-t1.vf) tex(GilliusADF-BoldItalic-lf-ts1--base.tfm) tex(GilliusADF-BoldItalic-lf-ts1.tfm) tex(GilliusADF-BoldItalic-lf-ts1.vf) tex(GilliusADF-Italic-lf-ly1--base.tfm) tex(GilliusADF-Italic-lf-ly1--lcdfj.tfm) tex(GilliusADF-Italic-lf-ly1.tfm) tex(GilliusADF-Italic-lf-ly1.vf) tex(GilliusADF-Italic-lf-ot1--base.tfm) tex(GilliusADF-Italic-lf-ot1--lcdfj.tfm) tex(GilliusADF-Italic-lf-ot1.tfm) tex(GilliusADF-Italic-lf-ot1.vf) tex(GilliusADF-Italic-lf-t1--base.tfm) tex(GilliusADF-Italic-lf-t1--lcdfj.tfm) tex(GilliusADF-Italic-lf-t1.tfm) tex(GilliusADF-Italic-lf-t1.vf) tex(GilliusADF-Italic-lf-ts1--base.tfm) tex(GilliusADF-Italic-lf-ts1.tfm) tex(GilliusADF-Italic-lf-ts1.vf) tex(GilliusADF-Regular-lf-ly1--base.tfm) tex(GilliusADF-Regular-lf-ly1--lcdfj.tfm) tex(GilliusADF-Regular-lf-ly1.tfm) tex(GilliusADF-Regular-lf-ly1.vf) tex(GilliusADF-Regular-lf-ot1--base.tfm) tex(GilliusADF-Regular-lf-ot1--lcdfj.tfm) tex(GilliusADF-Regular-lf-ot1.tfm) tex(GilliusADF-Regular-lf-ot1.vf) tex(GilliusADF-Regular-lf-t1--base.tfm) tex(GilliusADF-Regular-lf-t1--lcdfj.tfm) tex(GilliusADF-Regular-lf-t1.tfm) tex(GilliusADF-Regular-lf-t1.vf) tex(GilliusADF-Regular-lf-ts1--base.tfm) tex(GilliusADF-Regular-lf-ts1.tfm) tex(GilliusADF-Regular-lf-ts1.vf) tex(GilliusADFCond-Bold-lf-ly1--base.tfm) tex(GilliusADFCond-Bold-lf-ly1--lcdfj.tfm) tex(GilliusADFCond-Bold-lf-ly1.tfm) tex(GilliusADFCond-Bold-lf-ly1.vf) tex(GilliusADFCond-Bold-lf-ot1--base.tfm) tex(GilliusADFCond-Bold-lf-ot1--lcdfj.tfm) tex(GilliusADFCond-Bold-lf-ot1.tfm) tex(GilliusADFCond-Bold-lf-ot1.vf) tex(GilliusADFCond-Bold-lf-t1--base.tfm) tex(GilliusADFCond-Bold-lf-t1--lcdfj.tfm) tex(GilliusADFCond-Bold-lf-t1.tfm) tex(GilliusADFCond-Bold-lf-t1.vf) tex(GilliusADFCond-Bold-lf-ts1--base.tfm) tex(GilliusADFCond-Bold-lf-ts1.tfm) tex(GilliusADFCond-Bold-lf-ts1.vf) tex(GilliusADFCond-BoldItalic-lf-ly1--base.tfm) tex(GilliusADFCond-BoldItalic-lf-ly1--lcdfj.tfm) tex(GilliusADFCond-BoldItalic-lf-ly1.tfm) tex(GilliusADFCond-BoldItalic-lf-ly1.vf) tex(GilliusADFCond-BoldItalic-lf-ot1--base.tfm) tex(GilliusADFCond-BoldItalic-lf-ot1--lcdfj.tfm) tex(GilliusADFCond-BoldItalic-lf-ot1.tfm) tex(GilliusADFCond-BoldItalic-lf-ot1.vf) tex(GilliusADFCond-BoldItalic-lf-t1--base.tfm) tex(GilliusADFCond-BoldItalic-lf-t1--lcdfj.tfm) tex(GilliusADFCond-BoldItalic-lf-t1.tfm) tex(GilliusADFCond-BoldItalic-lf-t1.vf) tex(GilliusADFCond-BoldItalic-lf-ts1--base.tfm) tex(GilliusADFCond-BoldItalic-lf-ts1.tfm) tex(GilliusADFCond-BoldItalic-lf-ts1.vf) tex(GilliusADFCond-Italic-lf-ly1--base.tfm) tex(GilliusADFCond-Italic-lf-ly1--lcdfj.tfm) tex(GilliusADFCond-Italic-lf-ly1.tfm) tex(GilliusADFCond-Italic-lf-ly1.vf) tex(GilliusADFCond-Italic-lf-ot1--base.tfm) tex(GilliusADFCond-Italic-lf-ot1--lcdfj.tfm) tex(GilliusADFCond-Italic-lf-ot1.tfm) tex(GilliusADFCond-Italic-lf-ot1.vf) tex(GilliusADFCond-Italic-lf-t1--base.tfm) tex(GilliusADFCond-Italic-lf-t1--lcdfj.tfm) tex(GilliusADFCond-Italic-lf-t1.tfm) tex(GilliusADFCond-Italic-lf-t1.vf) tex(GilliusADFCond-Italic-lf-ts1--base.tfm) tex(GilliusADFCond-Italic-lf-ts1.tfm) tex(GilliusADFCond-Italic-lf-ts1.vf) tex(GilliusADFCond-Regular-lf-ly1--base.tfm) tex(GilliusADFCond-Regular-lf-ly1--lcdfj.tfm) tex(GilliusADFCond-Regular-lf-ly1.tfm) tex(GilliusADFCond-Regular-lf-ly1.vf) tex(GilliusADFCond-Regular-lf-ot1--base.tfm) tex(GilliusADFCond-Regular-lf-ot1--lcdfj.tfm) tex(GilliusADFCond-Regular-lf-ot1.tfm) tex(GilliusADFCond-Regular-lf-ot1.vf) tex(GilliusADFCond-Regular-lf-t1--base.tfm) tex(GilliusADFCond-Regular-lf-t1--lcdfj.tfm) tex(GilliusADFCond-Regular-lf-t1.tfm) tex(GilliusADFCond-Regular-lf-t1.vf) tex(GilliusADFCond-Regular-lf-ts1--base.tfm) tex(GilliusADFCond-Regular-lf-ts1.tfm) tex(GilliusADFCond-Regular-lf-ts1.vf) tex(GilliusADFNo2-Bold-lf-ly1--base.tfm) tex(GilliusADFNo2-Bold-lf-ly1--lcdfj.tfm) tex(GilliusADFNo2-Bold-lf-ly1.tfm) tex(GilliusADFNo2-Bold-lf-ly1.vf) tex(GilliusADFNo2-Bold-lf-ot1--base.tfm) tex(GilliusADFNo2-Bold-lf-ot1--lcdfj.tfm) tex(GilliusADFNo2-Bold-lf-ot1.tfm) tex(GilliusADFNo2-Bold-lf-ot1.vf) tex(GilliusADFNo2-Bold-lf-t1--base.tfm) tex(GilliusADFNo2-Bold-lf-t1--lcdfj.tfm) tex(GilliusADFNo2-Bold-lf-t1.tfm) tex(GilliusADFNo2-Bold-lf-t1.vf) tex(GilliusADFNo2-Bold-lf-ts1--base.tfm) tex(GilliusADFNo2-Bold-lf-ts1.tfm) tex(GilliusADFNo2-Bold-lf-ts1.vf) tex(GilliusADFNo2-BoldItalic-lf-ly1--base.tfm) tex(GilliusADFNo2-BoldItalic-lf-ly1--lcdfj.tfm) tex(GilliusADFNo2-BoldItalic-lf-ly1.tfm) tex(GilliusADFNo2-BoldItalic-lf-ly1.vf) tex(GilliusADFNo2-BoldItalic-lf-ot1--base.tfm) tex(GilliusADFNo2-BoldItalic-lf-ot1--lcdfj.tfm) tex(GilliusADFNo2-BoldItalic-lf-ot1.tfm) tex(GilliusADFNo2-BoldItalic-lf-ot1.vf) tex(GilliusADFNo2-BoldItalic-lf-t1--base.tfm) tex(GilliusADFNo2-BoldItalic-lf-t1--lcdfj.tfm) tex(GilliusADFNo2-BoldItalic-lf-t1.tfm) tex(GilliusADFNo2-BoldItalic-lf-t1.vf) tex(GilliusADFNo2-BoldItalic-lf-ts1--base.tfm) tex(GilliusADFNo2-BoldItalic-lf-ts1.tfm) tex(GilliusADFNo2-BoldItalic-lf-ts1.vf) tex(GilliusADFNo2-Italic-lf-ly1--base.tfm) tex(GilliusADFNo2-Italic-lf-ly1--lcdfj.tfm) tex(GilliusADFNo2-Italic-lf-ly1.tfm) tex(GilliusADFNo2-Italic-lf-ly1.vf) tex(GilliusADFNo2-Italic-lf-ot1--base.tfm) tex(GilliusADFNo2-Italic-lf-ot1--lcdfj.tfm) tex(GilliusADFNo2-Italic-lf-ot1.tfm) tex(GilliusADFNo2-Italic-lf-ot1.vf) tex(GilliusADFNo2-Italic-lf-t1--base.tfm) tex(GilliusADFNo2-Italic-lf-t1--lcdfj.tfm) tex(GilliusADFNo2-Italic-lf-t1.tfm) tex(GilliusADFNo2-Italic-lf-t1.vf) tex(GilliusADFNo2-Italic-lf-ts1--base.tfm) tex(GilliusADFNo2-Italic-lf-ts1.tfm) tex(GilliusADFNo2-Italic-lf-ts1.vf) tex(GilliusADFNo2-Regular-lf-ly1--base.tfm) tex(GilliusADFNo2-Regular-lf-ly1--lcdfj.tfm) tex(GilliusADFNo2-Regular-lf-ly1.tfm) tex(GilliusADFNo2-Regular-lf-ly1.vf) tex(GilliusADFNo2-Regular-lf-ot1--base.tfm) tex(GilliusADFNo2-Regular-lf-ot1--lcdfj.tfm) tex(GilliusADFNo2-Regular-lf-ot1.tfm) tex(GilliusADFNo2-Regular-lf-ot1.vf) tex(GilliusADFNo2-Regular-lf-t1--base.tfm) tex(GilliusADFNo2-Regular-lf-t1--lcdfj.tfm) tex(GilliusADFNo2-Regular-lf-t1.tfm) tex(GilliusADFNo2-Regular-lf-t1.vf) tex(GilliusADFNo2-Regular-lf-ts1--base.tfm) tex(GilliusADFNo2-Regular-lf-ts1.tfm) tex(GilliusADFNo2-Regular-lf-ts1.vf) tex(GilliusADFNo2Cond-Bold-lf-ly1--base.tfm) tex(GilliusADFNo2Cond-Bold-lf-ly1--lcdfj.tfm) tex(GilliusADFNo2Cond-Bold-lf-ly1.tfm) tex(GilliusADFNo2Cond-Bold-lf-ly1.vf) tex(GilliusADFNo2Cond-Bold-lf-ot1--base.tfm) tex(GilliusADFNo2Cond-Bold-lf-ot1--lcdfj.tfm) tex(GilliusADFNo2Cond-Bold-lf-ot1.tfm) tex(GilliusADFNo2Cond-Bold-lf-ot1.vf) tex(GilliusADFNo2Cond-Bold-lf-t1--base.tfm) tex(GilliusADFNo2Cond-Bold-lf-t1--lcdfj.tfm) tex(GilliusADFNo2Cond-Bold-lf-t1.tfm) tex(GilliusADFNo2Cond-Bold-lf-t1.vf) tex(GilliusADFNo2Cond-Bold-lf-ts1--base.tfm) tex(GilliusADFNo2Cond-Bold-lf-ts1.tfm) tex(GilliusADFNo2Cond-Bold-lf-ts1.vf) tex(GilliusADFNo2Cond-BoldItalic-lf-ly1--base.tfm) tex(GilliusADFNo2Cond-BoldItalic-lf-ly1--lcdfj.tfm) tex(GilliusADFNo2Cond-BoldItalic-lf-ly1.tfm) tex(GilliusADFNo2Cond-BoldItalic-lf-ly1.vf) tex(GilliusADFNo2Cond-BoldItalic-lf-ot1--base.tfm) tex(GilliusADFNo2Cond-BoldItalic-lf-ot1--lcdfj.tfm) tex(GilliusADFNo2Cond-BoldItalic-lf-ot1.tfm) tex(GilliusADFNo2Cond-BoldItalic-lf-ot1.vf) tex(GilliusADFNo2Cond-BoldItalic-lf-t1--base.tfm) tex(GilliusADFNo2Cond-BoldItalic-lf-t1--lcdfj.tfm) tex(GilliusADFNo2Cond-BoldItalic-lf-t1.tfm) tex(GilliusADFNo2Cond-BoldItalic-lf-t1.vf) tex(GilliusADFNo2Cond-BoldItalic-lf-ts1--base.tfm) tex(GilliusADFNo2Cond-BoldItalic-lf-ts1.tfm) tex(GilliusADFNo2Cond-BoldItalic-lf-ts1.vf) tex(GilliusADFNo2Cond-Italic-lf-ly1--base.tfm) tex(GilliusADFNo2Cond-Italic-lf-ly1--lcdfj.tfm) tex(GilliusADFNo2Cond-Italic-lf-ly1.tfm) tex(GilliusADFNo2Cond-Italic-lf-ly1.vf) tex(GilliusADFNo2Cond-Italic-lf-ot1--base.tfm) tex(GilliusADFNo2Cond-Italic-lf-ot1--lcdfj.tfm) tex(GilliusADFNo2Cond-Italic-lf-ot1.tfm) tex(GilliusADFNo2Cond-Italic-lf-ot1.vf) tex(GilliusADFNo2Cond-Italic-lf-t1--base.tfm) tex(GilliusADFNo2Cond-Italic-lf-t1--lcdfj.tfm) tex(GilliusADFNo2Cond-Italic-lf-t1.tfm) tex(GilliusADFNo2Cond-Italic-lf-t1.vf) tex(GilliusADFNo2Cond-Italic-lf-ts1--base.tfm) tex(GilliusADFNo2Cond-Italic-lf-ts1.tfm) tex(GilliusADFNo2Cond-Italic-lf-ts1.vf) tex(GilliusADFNo2Cond-Regular-lf-ly1--base.tfm) tex(GilliusADFNo2Cond-Regular-lf-ly1--lcdfj.tfm) tex(GilliusADFNo2Cond-Regular-lf-ly1.tfm) tex(GilliusADFNo2Cond-Regular-lf-ly1.vf) tex(GilliusADFNo2Cond-Regular-lf-ot1--base.tfm) tex(GilliusADFNo2Cond-Regular-lf-ot1--lcdfj.tfm) tex(GilliusADFNo2Cond-Regular-lf-ot1.tfm) tex(GilliusADFNo2Cond-Regular-lf-ot1.vf) tex(GilliusADFNo2Cond-Regular-lf-t1--base.tfm) tex(GilliusADFNo2Cond-Regular-lf-t1--lcdfj.tfm) tex(GilliusADFNo2Cond-Regular-lf-t1.tfm) tex(GilliusADFNo2Cond-Regular-lf-t1.vf) tex(GilliusADFNo2Cond-Regular-lf-ts1--base.tfm) tex(GilliusADFNo2Cond-Regular-lf-ts1.tfm) tex(GilliusADFNo2Cond-Regular-lf-ts1.vf) tex(LY1GilliusADF-LF.fd) tex(LY1GilliusADFCond-LF.fd) tex(LY1GilliusADFNoTwo-LF.fd) tex(LY1GilliusADFNoTwoCond-LF.fd) tex(OT1GilliusADF-LF.fd) tex(OT1GilliusADFCond-LF.fd) tex(OT1GilliusADFNoTwo-LF.fd) tex(OT1GilliusADFNoTwoCond-LF.fd) tex(T1GilliusADF-LF.fd) tex(T1GilliusADFCond-LF.fd) tex(T1GilliusADFNoTwo-LF.fd) tex(T1GilliusADFNoTwoCond-LF.fd) tex(TS1GilliusADF-LF.fd) tex(TS1GilliusADFCond-LF.fd) tex(TS1GilliusADFNoTwo-LF.fd) tex(TS1GilliusADFNoTwoCond-LF.fd) tex(gillius.map) tex(gillius.sty) tex(gillius2.sty) tex(gls_4bsedw.enc) tex(gls_a6mi7n.enc) tex(gls_az7pev.enc) tex(gls_bg5e7z.enc) tex(gls_efuo7w.enc) tex(gls_lf6eoq.enc) tex(gls_pqq4vh.enc) tex(gls_shb4ap.enc) texlive-gillius"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(fontaxes.sty) tex(fontenc.sty) tex(fontspec.sty) tex(ifluatex.sty) tex(ifxetex.sty) tex(textcomp.sty) tex(updmap.cfg) tex(xkeyval.sty) texlive texlive-filesystem texlive-gillius-fonts texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
