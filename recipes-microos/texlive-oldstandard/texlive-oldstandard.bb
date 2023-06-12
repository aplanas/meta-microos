SUMMARY = "OldStandard fonts with LaTeX support"
DESCRIPTION = "Old Standard is designed to reproduce the actual printing style \
of the early 20th century, reviving a specific type of Modern \
(classicist) style of serif typefaces, very commonly used in \
various editions of the late 19th and early 20th century, but \
almost completely abandoned later. The font supports \
typesetting of Old and Middle English, Old Icelandic, Cyrillic \
(with historical characters, extensions for Old Slavonic and \
localised forms), Gothic transliterations, critical editions of \
Classical Greek and Latin, and many more. This package works \
with TeX engines that directly support OpenType features, such \
as XeTeX and LuaTeX, as well as traditional engines such as TeX \
and pdfTeX."
LICENSE = "OFL-1.1"

PV = "2023.201.2.6svn64464"

RPM_NAME = "texlive-oldstandard-2023.201.2.6svn64464-54.1.noarch.rpm"
RPM_HASH = "f41801164c1b239b9a7ed26d730a7544e7baabf7dd2f71aba2d91b46a510cd4019840545b337abdde55889cd00e54895044987f15ea7d8870231958f79fd8a35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(LGROldStandard-Sup.fd) \
tex(LGROldStandard-TLF.fd) \
tex(LY1OldStandard-Sup.fd) \
tex(LY1OldStandard-TLF.fd) \
tex(OT1OldStandard-Sup.fd) \
tex(OT1OldStandard-TLF.fd) \
tex(OldStandard-Bold-sup-lgr.tfm) \
tex(OldStandard-Bold-sup-ly1.tfm) \
tex(OldStandard-Bold-sup-ot1.tfm) \
tex(OldStandard-Bold-sup-t1--base.tfm) \
tex(OldStandard-Bold-sup-t1.tfm) \
tex(OldStandard-Bold-sup-t1.vf) \
tex(OldStandard-Bold-sup-t2a.tfm) \
tex(OldStandard-Bold-sup-t2b.tfm) \
tex(OldStandard-Bold-sup-t2c.tfm) \
tex(OldStandard-Bold-tlf-lgr.tfm) \
tex(OldStandard-Bold-tlf-ly1.tfm) \
tex(OldStandard-Bold-tlf-ot1.tfm) \
tex(OldStandard-Bold-tlf-sc-lgr.tfm) \
tex(OldStandard-Bold-tlf-sc-ly1--base.tfm) \
tex(OldStandard-Bold-tlf-sc-ly1.tfm) \
tex(OldStandard-Bold-tlf-sc-ly1.vf) \
tex(OldStandard-Bold-tlf-sc-ot1--base.tfm) \
tex(OldStandard-Bold-tlf-sc-ot1.tfm) \
tex(OldStandard-Bold-tlf-sc-ot1.vf) \
tex(OldStandard-Bold-tlf-sc-t1--base.tfm) \
tex(OldStandard-Bold-tlf-sc-t1.tfm) \
tex(OldStandard-Bold-tlf-sc-t1.vf) \
tex(OldStandard-Bold-tlf-sc-t2a--base.tfm) \
tex(OldStandard-Bold-tlf-sc-t2a.tfm) \
tex(OldStandard-Bold-tlf-sc-t2a.vf) \
tex(OldStandard-Bold-tlf-sc-t2b--base.tfm) \
tex(OldStandard-Bold-tlf-sc-t2b.tfm) \
tex(OldStandard-Bold-tlf-sc-t2b.vf) \
tex(OldStandard-Bold-tlf-sc-t2c--base.tfm) \
tex(OldStandard-Bold-tlf-sc-t2c.tfm) \
tex(OldStandard-Bold-tlf-sc-t2c.vf) \
tex(OldStandard-Bold-tlf-t1--base.tfm) \
tex(OldStandard-Bold-tlf-t1.tfm) \
tex(OldStandard-Bold-tlf-t1.vf) \
tex(OldStandard-Bold-tlf-t2a.tfm) \
tex(OldStandard-Bold-tlf-t2b.tfm) \
tex(OldStandard-Bold-tlf-t2c.tfm) \
tex(OldStandard-Bold-tlf-ts1--base.tfm) \
tex(OldStandard-Bold-tlf-ts1.tfm) \
tex(OldStandard-Bold-tlf-ts1.vf) \
tex(OldStandard-BoldItalic-sup-lgr.tfm) \
tex(OldStandard-BoldItalic-sup-ly1.tfm) \
tex(OldStandard-BoldItalic-sup-ot1.tfm) \
tex(OldStandard-BoldItalic-sup-t1--base.tfm) \
tex(OldStandard-BoldItalic-sup-t1.tfm) \
tex(OldStandard-BoldItalic-sup-t1.vf) \
tex(OldStandard-BoldItalic-sup-t2a.tfm) \
tex(OldStandard-BoldItalic-sup-t2b.tfm) \
tex(OldStandard-BoldItalic-sup-t2c.tfm) \
tex(OldStandard-BoldItalic-tlf-lgr.tfm) \
tex(OldStandard-BoldItalic-tlf-ly1.tfm) \
tex(OldStandard-BoldItalic-tlf-ot1.tfm) \
tex(OldStandard-BoldItalic-tlf-sc-lgr.tfm) \
tex(OldStandard-BoldItalic-tlf-sc-ly1--base.tfm) \
tex(OldStandard-BoldItalic-tlf-sc-ly1.tfm) \
tex(OldStandard-BoldItalic-tlf-sc-ly1.vf) \
tex(OldStandard-BoldItalic-tlf-sc-ot1--base.tfm) \
tex(OldStandard-BoldItalic-tlf-sc-ot1.tfm) \
tex(OldStandard-BoldItalic-tlf-sc-ot1.vf) \
tex(OldStandard-BoldItalic-tlf-sc-t1--base.tfm) \
tex(OldStandard-BoldItalic-tlf-sc-t1.tfm) \
tex(OldStandard-BoldItalic-tlf-sc-t1.vf) \
tex(OldStandard-BoldItalic-tlf-sc-t2a--base.tfm) \
tex(OldStandard-BoldItalic-tlf-sc-t2a.tfm) \
tex(OldStandard-BoldItalic-tlf-sc-t2a.vf) \
tex(OldStandard-BoldItalic-tlf-sc-t2b--base.tfm) \
tex(OldStandard-BoldItalic-tlf-sc-t2b.tfm) \
tex(OldStandard-BoldItalic-tlf-sc-t2b.vf) \
tex(OldStandard-BoldItalic-tlf-sc-t2c--base.tfm) \
tex(OldStandard-BoldItalic-tlf-sc-t2c.tfm) \
tex(OldStandard-BoldItalic-tlf-sc-t2c.vf) \
tex(OldStandard-BoldItalic-tlf-t1--base.tfm) \
tex(OldStandard-BoldItalic-tlf-t1.tfm) \
tex(OldStandard-BoldItalic-tlf-t1.vf) \
tex(OldStandard-BoldItalic-tlf-t2a.tfm) \
tex(OldStandard-BoldItalic-tlf-t2b.tfm) \
tex(OldStandard-BoldItalic-tlf-t2c.tfm) \
tex(OldStandard-BoldItalic-tlf-ts1--base.tfm) \
tex(OldStandard-BoldItalic-tlf-ts1.tfm) \
tex(OldStandard-BoldItalic-tlf-ts1.vf) \
tex(OldStandard-Italic-sup-lgr.tfm) \
tex(OldStandard-Italic-sup-ly1.tfm) \
tex(OldStandard-Italic-sup-ot1.tfm) \
tex(OldStandard-Italic-sup-t1--base.tfm) \
tex(OldStandard-Italic-sup-t1.tfm) \
tex(OldStandard-Italic-sup-t1.vf) \
tex(OldStandard-Italic-sup-t2a.tfm) \
tex(OldStandard-Italic-sup-t2b.tfm) \
tex(OldStandard-Italic-sup-t2c.tfm) \
tex(OldStandard-Italic-tlf-lgr.tfm) \
tex(OldStandard-Italic-tlf-ly1.tfm) \
tex(OldStandard-Italic-tlf-ot1.tfm) \
tex(OldStandard-Italic-tlf-sc-lgr.tfm) \
tex(OldStandard-Italic-tlf-sc-ly1--base.tfm) \
tex(OldStandard-Italic-tlf-sc-ly1.tfm) \
tex(OldStandard-Italic-tlf-sc-ly1.vf) \
tex(OldStandard-Italic-tlf-sc-ot1--base.tfm) \
tex(OldStandard-Italic-tlf-sc-ot1.tfm) \
tex(OldStandard-Italic-tlf-sc-ot1.vf) \
tex(OldStandard-Italic-tlf-sc-t1--base.tfm) \
tex(OldStandard-Italic-tlf-sc-t1.tfm) \
tex(OldStandard-Italic-tlf-sc-t1.vf) \
tex(OldStandard-Italic-tlf-sc-t2a--base.tfm) \
tex(OldStandard-Italic-tlf-sc-t2a.tfm) \
tex(OldStandard-Italic-tlf-sc-t2a.vf) \
tex(OldStandard-Italic-tlf-sc-t2b--base.tfm) \
tex(OldStandard-Italic-tlf-sc-t2b.tfm) \
tex(OldStandard-Italic-tlf-sc-t2b.vf) \
tex(OldStandard-Italic-tlf-sc-t2c--base.tfm) \
tex(OldStandard-Italic-tlf-sc-t2c.tfm) \
tex(OldStandard-Italic-tlf-sc-t2c.vf) \
tex(OldStandard-Italic-tlf-t1--base.tfm) \
tex(OldStandard-Italic-tlf-t1.tfm) \
tex(OldStandard-Italic-tlf-t1.vf) \
tex(OldStandard-Italic-tlf-t2a.tfm) \
tex(OldStandard-Italic-tlf-t2b.tfm) \
tex(OldStandard-Italic-tlf-t2c.tfm) \
tex(OldStandard-Italic-tlf-ts1--base.tfm) \
tex(OldStandard-Italic-tlf-ts1.tfm) \
tex(OldStandard-Italic-tlf-ts1.vf) \
tex(OldStandard-Regular-sup-lgr.tfm) \
tex(OldStandard-Regular-sup-ly1.tfm) \
tex(OldStandard-Regular-sup-ot1.tfm) \
tex(OldStandard-Regular-sup-t1--base.tfm) \
tex(OldStandard-Regular-sup-t1.tfm) \
tex(OldStandard-Regular-sup-t1.vf) \
tex(OldStandard-Regular-sup-t2a.tfm) \
tex(OldStandard-Regular-sup-t2b.tfm) \
tex(OldStandard-Regular-sup-t2c.tfm) \
tex(OldStandard-Regular-tlf-lgr.tfm) \
tex(OldStandard-Regular-tlf-ly1.tfm) \
tex(OldStandard-Regular-tlf-ot1.tfm) \
tex(OldStandard-Regular-tlf-sc-lgr.tfm) \
tex(OldStandard-Regular-tlf-sc-ly1--base.tfm) \
tex(OldStandard-Regular-tlf-sc-ly1.tfm) \
tex(OldStandard-Regular-tlf-sc-ly1.vf) \
tex(OldStandard-Regular-tlf-sc-ot1--base.tfm) \
tex(OldStandard-Regular-tlf-sc-ot1.tfm) \
tex(OldStandard-Regular-tlf-sc-ot1.vf) \
tex(OldStandard-Regular-tlf-sc-t1--base.tfm) \
tex(OldStandard-Regular-tlf-sc-t1.tfm) \
tex(OldStandard-Regular-tlf-sc-t1.vf) \
tex(OldStandard-Regular-tlf-sc-t2a--base.tfm) \
tex(OldStandard-Regular-tlf-sc-t2a.tfm) \
tex(OldStandard-Regular-tlf-sc-t2a.vf) \
tex(OldStandard-Regular-tlf-sc-t2b--base.tfm) \
tex(OldStandard-Regular-tlf-sc-t2b.tfm) \
tex(OldStandard-Regular-tlf-sc-t2b.vf) \
tex(OldStandard-Regular-tlf-sc-t2c--base.tfm) \
tex(OldStandard-Regular-tlf-sc-t2c.tfm) \
tex(OldStandard-Regular-tlf-sc-t2c.vf) \
tex(OldStandard-Regular-tlf-t1--base.tfm) \
tex(OldStandard-Regular-tlf-t1.tfm) \
tex(OldStandard-Regular-tlf-t1.vf) \
tex(OldStandard-Regular-tlf-t2a.tfm) \
tex(OldStandard-Regular-tlf-t2b.tfm) \
tex(OldStandard-Regular-tlf-t2c.tfm) \
tex(OldStandard-Regular-tlf-ts1--base.tfm) \
tex(OldStandard-Regular-tlf-ts1.tfm) \
tex(OldStandard-Regular-tlf-ts1.vf) \
tex(OldStandard.map) \
tex(OldStandard.sty) \
tex(T1OldStandard-Sup.fd) \
tex(T1OldStandard-TLF.fd) \
tex(T2AOldStandard-Sup.fd) \
tex(T2AOldStandard-TLF.fd) \
tex(T2BOldStandard-Sup.fd) \
tex(T2BOldStandard-TLF.fd) \
tex(T2COldStandard-Sup.fd) \
tex(T2COldStandard-TLF.fd) \
tex(TS1OldStandard-TLF.fd) \
tex(ost_2deiwc.enc) \
tex(ost_4gryax.enc) \
tex(ost_4ubwsr.enc) \
tex(ost_5nnl5u.enc) \
tex(ost_5whbgv.enc) \
tex(ost_6xqr26.enc) \
tex(ost_angj2q.enc) \
tex(ost_asyrwx.enc) \
tex(ost_bjztjg.enc) \
tex(ost_bqhfkj.enc) \
tex(ost_dqfezc.enc) \
tex(ost_eyrxhh.enc) \
tex(ost_f7vsty.enc) \
tex(ost_hn3tfb.enc) \
tex(ost_im33zw.enc) \
tex(ost_jsesfs.enc) \
tex(ost_kb3yb7.enc) \
tex(ost_lpt7jr.enc) \
tex(ost_mknljf.enc) \
tex(ost_o47vxq.enc) \
tex(ost_p56nol.enc) \
tex(ost_ppxooj.enc) \
tex(ost_qpx6oq.enc) \
tex(ost_ra2ua5.enc) \
tex(ost_recs4b.enc) \
tex(ost_roofh6.enc) \
tex(ost_sef3nf.enc) \
tex(ost_sfa7gz.enc) \
tex(ost_sngi4d.enc) \
tex(ost_sykxvg.enc) \
tex(ost_tbxs5z.enc) \
tex(ost_uj34jt.enc) \
tex(ost_vznixw.enc) \
tex(ost_y2jfiq.enc) \
tex(ost_yp4wmb.enc) \
tex(ost_ytxedg.enc) \
texlive-oldstandard"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(fontaxes.sty) \
tex(fontenc.sty) \
tex(fontspec.sty) \
tex(ifluatex.sty) \
tex(ifxetex.sty) \
tex(textcomp.sty) \
tex(updmap.cfg) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-oldstandard-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
