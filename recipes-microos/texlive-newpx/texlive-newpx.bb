SUMMARY = "Alternative uses of the PX fonts, with improved metrics"
DESCRIPTION = "This package, initially based on pxfonts, provides many fixes \
and enhancements to that package, and splits it in two parts \
(newpxtext and newpxmath) which may be run independently of one \
another. It provides scaling, improved metrics, and other \
options. For proper operation, the packages require that the \
packages newtxmath, pxfonts, and TeXGyrePagella be installed \
and their map files enabled."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.505svn61806"

RPM_NAME = "texlive-newpx-2023.201.1.505svn61806-54.1.noarch.rpm"
RPM_HASH = "af81c05b24e4e81743aa0d946d1c7c05beea6956a88ac02e78ffde04fa6969c08ac2a5b393a2a248fdabc87fb8c57bdc5ea0fc4674f1e089801fd5855ea0fa05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(NewPXBMI.tfm) tex(NewPXBMI_gnu.tfm) tex(NewPXMI.tfm) tex(NewPXMI_gnu.tfm) tex(lmsnpxsy.fd) tex(lmxnpxexx.fd) tex(ly1npxtt.fd) tex(ly1zpldnom.fd) tex(ly1zplinf.fd) tex(ly1zpllf.fd) tex(ly1zplosf.fd) tex(ly1zplsubs.fd) tex(ly1zplsups.fd) tex(ly1zplth-lf.fd) tex(ly1zplth-osf.fd) tex(ly1zplth-tlf.fd) tex(ly1zplth-tosf.fd) tex(ly1zpltlf.fd) tex(ly1zpltosf.fd) tex(newpx-subs.tex) tex(newpx.map) tex(newpxmath.sty) tex(newpxtext.sty) tex(npxdnom_LY1.enc) tex(npxdnom_OT1.enc) tex(npxdnom_T1.enc) tex(npxnumr_LY1.enc) tex(npxnumr_OT1.enc) tex(npxnumr_T1.enc) tex(npxsubs_LY1.enc) tex(npxsubs_OT1.enc) tex(npxsubs_T1.enc) tex(npxsups-Bold-ly1.tfm) tex(npxsups-Bold-ot1.tfm) tex(npxsups-Bold-t1.tfm) tex(npxsups-BoldItalic-ly1.tfm) tex(npxsups-BoldItalic-ot1.tfm) tex(npxsups-BoldItalic-t1.tfm) tex(npxsups-Italic-ly1.tfm) tex(npxsups-Italic-ot1.tfm) tex(npxsups-Italic-t1.tfm) tex(npxsups-Regular-ly1.tfm) tex(npxsups-Regular-ot1.tfm) tex(npxsups-Regular-t1.tfm) tex(npxsups_LY1.enc) tex(npxsups_OT1.enc) tex(npxsups_T1.enc) tex(omlnpxmi.fd) tex(ot1npxtt.fd) tex(ot1zpldnom.fd) tex(ot1zplinf.fd) tex(ot1zpllf.fd) tex(ot1zplosf.fd) tex(ot1zplsubs.fd) tex(ot1zplsups.fd) tex(ot1zplth-lf.fd) tex(ot1zplth-osf.fd) tex(ot1zplth-tlf.fd) tex(ot1zplth-tosf.fd) tex(ot1zpltlf.fd) tex(ot1zpltosf.fd) tex(pxbmiaX.tfm) tex(pxbsys.tfm) tex(pxmiaX.tfm) tex(pxsys.tfm) tex(t1npxtt.fd) tex(t1zpldnom.fd) tex(t1zplinf.fd) tex(t1zpllf.fd) tex(t1zplnumr.fd) tex(t1zplosf.fd) tex(t1zplsubs.fd) tex(t1zplsups.fd) tex(t1zplth-lf.fd) tex(t1zplth-osf.fd) tex(t1zplth-tlf.fd) tex(t1zplth-tosf.fd) tex(t1zpltlf.fd) tex(t1zpltosf.fd) tex(tgpdiff.enc) tex(ts1npxtt.fd) tex(ts1zpllf.fd) tex(ts1zplosf.fd) tex(ts1zpltlf.fd) tex(ts1zpltosf.fd) tex(unpxexa.fd) tex(unpxmia.fd) tex(unpxss.fd) tex(unpxsyc.fd) tex(unpxsym.fd) tex(unpxtt.fd) tex(zpl-Bold-lf-ly1.tfm) tex(zpl-Bold-lf-ot1.tfm) tex(zpl-Bold-lf-sc-ly1.tfm) tex(zpl-Bold-lf-sc-ot1.tfm) tex(zpl-Bold-lf-sc-t1.tfm) tex(zpl-Bold-lf-scl-ly1.tfm) tex(zpl-Bold-lf-scl-ot1.tfm) tex(zpl-Bold-lf-scl-t1.tfm) tex(zpl-Bold-lf-t1.tfm) tex(zpl-Bold-osf-ly1.tfm) tex(zpl-Bold-osf-ot1.tfm) tex(zpl-Bold-osf-sc-ly1.tfm) tex(zpl-Bold-osf-sc-ot1.tfm) tex(zpl-Bold-osf-sc-t1.tfm) tex(zpl-Bold-osf-scl-ly1.tfm) tex(zpl-Bold-osf-scl-ot1.tfm) tex(zpl-Bold-osf-scl-t1.tfm) tex(zpl-Bold-osf-t1.tfm) tex(zpl-Bold-tlf-ly1.tfm) tex(zpl-Bold-tlf-ot1.tfm) tex(zpl-Bold-tlf-sc-ly1.tfm) tex(zpl-Bold-tlf-sc-ot1.tfm) tex(zpl-Bold-tlf-sc-t1.tfm) tex(zpl-Bold-tlf-scl-ly1.tfm) tex(zpl-Bold-tlf-scl-ot1.tfm) tex(zpl-Bold-tlf-scl-t1.tfm) tex(zpl-Bold-tlf-t1.tfm) tex(zpl-Bold-tosf-ly1.tfm) tex(zpl-Bold-tosf-ot1.tfm) tex(zpl-Bold-tosf-sc-ly1.tfm) tex(zpl-Bold-tosf-sc-ot1.tfm) tex(zpl-Bold-tosf-sc-t1.tfm) tex(zpl-Bold-tosf-scl-ly1.tfm) tex(zpl-Bold-tosf-scl-ot1.tfm) tex(zpl-Bold-tosf-scl-t1.tfm) tex(zpl-Bold-tosf-t1.tfm) tex(zpl-BoldItalic-lf-ly1.tfm) tex(zpl-BoldItalic-lf-ot1.tfm) tex(zpl-BoldItalic-lf-sc-ly1.tfm) tex(zpl-BoldItalic-lf-sc-ot1.tfm) tex(zpl-BoldItalic-lf-sc-t1.tfm) tex(zpl-BoldItalic-lf-scl-ly1.tfm) tex(zpl-BoldItalic-lf-scl-ot1.tfm) tex(zpl-BoldItalic-lf-scl-t1.tfm) tex(zpl-BoldItalic-lf-t1.tfm) tex(zpl-BoldItalic-osf-ly1.tfm) tex(zpl-BoldItalic-osf-ot1.tfm) tex(zpl-BoldItalic-osf-sc-ly1.tfm) tex(zpl-BoldItalic-osf-sc-ot1.tfm) tex(zpl-BoldItalic-osf-sc-t1.tfm) tex(zpl-BoldItalic-osf-scl-ly1.tfm) tex(zpl-BoldItalic-osf-scl-ot1.tfm) tex(zpl-BoldItalic-osf-scl-t1.tfm) tex(zpl-BoldItalic-osf-t1.tfm) tex(zpl-BoldItalic-tlf-ly1.tfm) tex(zpl-BoldItalic-tlf-ot1.tfm) tex(zpl-BoldItalic-tlf-sc-ly1.tfm) tex(zpl-BoldItalic-tlf-sc-ot1.tfm) tex(zpl-BoldItalic-tlf-sc-t1.tfm) tex(zpl-BoldItalic-tlf-scl-ly1.tfm) tex(zpl-BoldItalic-tlf-scl-ot1.tfm) tex(zpl-BoldItalic-tlf-scl-t1.tfm) tex(zpl-BoldItalic-tlf-t1.tfm) tex(zpl-BoldItalic-tosf-ly1.tfm) tex(zpl-BoldItalic-tosf-ot1.tfm) tex(zpl-BoldItalic-tosf-sc-ly1.tfm) tex(zpl-BoldItalic-tosf-sc-ot1.tfm) tex(zpl-BoldItalic-tosf-sc-t1.tfm) tex(zpl-BoldItalic-tosf-scl-ly1.tfm) tex(zpl-BoldItalic-tosf-scl-ot1.tfm) tex(zpl-BoldItalic-tosf-scl-t1.tfm) tex(zpl-BoldItalic-tosf-t1.tfm) tex(zpl-BoldSlanted-lf-ly1.tfm) tex(zpl-BoldSlanted-lf-ot1.tfm) tex(zpl-BoldSlanted-lf-sc-ly1.tfm) tex(zpl-BoldSlanted-lf-sc-ot1.tfm) tex(zpl-BoldSlanted-lf-sc-t1.tfm) tex(zpl-BoldSlanted-lf-scl-ly1.tfm) tex(zpl-BoldSlanted-lf-scl-ot1.tfm) tex(zpl-BoldSlanted-lf-scl-t1.tfm) tex(zpl-BoldSlanted-lf-t1.tfm) tex(zpl-BoldSlanted-osf-ly1.tfm) tex(zpl-BoldSlanted-osf-ot1.tfm) tex(zpl-BoldSlanted-osf-sc-ly1.tfm) tex(zpl-BoldSlanted-osf-sc-ot1.tfm) tex(zpl-BoldSlanted-osf-sc-t1.tfm) tex(zpl-BoldSlanted-osf-scl-ly1.tfm) tex(zpl-BoldSlanted-osf-scl-ot1.tfm) tex(zpl-BoldSlanted-osf-scl-t1.tfm) tex(zpl-BoldSlanted-osf-t1.tfm) tex(zpl-BoldSlanted-tlf-ly1.tfm) tex(zpl-BoldSlanted-tlf-ot1.tfm) tex(zpl-BoldSlanted-tlf-sc-ly1.tfm) tex(zpl-BoldSlanted-tlf-sc-ot1.tfm) tex(zpl-BoldSlanted-tlf-sc-t1.tfm) tex(zpl-BoldSlanted-tlf-scl-ly1.tfm) tex(zpl-BoldSlanted-tlf-scl-ot1.tfm) tex(zpl-BoldSlanted-tlf-scl-t1.tfm) tex(zpl-BoldSlanted-tlf-t1.tfm) tex(zpl-BoldSlanted-tosf-ly1.tfm) tex(zpl-BoldSlanted-tosf-ot1.tfm) tex(zpl-BoldSlanted-tosf-sc-ly1.tfm) tex(zpl-BoldSlanted-tosf-sc-ot1.tfm) tex(zpl-BoldSlanted-tosf-sc-t1.tfm) tex(zpl-BoldSlanted-tosf-scl-ly1.tfm) tex(zpl-BoldSlanted-tosf-scl-ot1.tfm) tex(zpl-BoldSlanted-tosf-scl-t1.tfm) tex(zpl-BoldSlanted-tosf-t1.tfm) tex(zpl-Italic-lf-ly1.tfm) tex(zpl-Italic-lf-ot1.tfm) tex(zpl-Italic-lf-sc-ly1.tfm) tex(zpl-Italic-lf-sc-ot1.tfm) tex(zpl-Italic-lf-sc-t1.tfm) tex(zpl-Italic-lf-scl-ly1.tfm) tex(zpl-Italic-lf-scl-ot1.tfm) tex(zpl-Italic-lf-scl-t1.tfm) tex(zpl-Italic-lf-t1.tfm) tex(zpl-Italic-osf-ly1.tfm) tex(zpl-Italic-osf-ot1.tfm) tex(zpl-Italic-osf-sc-ly1.tfm) tex(zpl-Italic-osf-sc-ot1.tfm) tex(zpl-Italic-osf-sc-t1.tfm) tex(zpl-Italic-osf-scl-ly1.tfm) tex(zpl-Italic-osf-scl-ot1.tfm) tex(zpl-Italic-osf-scl-t1.tfm) tex(zpl-Italic-osf-t1.tfm) tex(zpl-Italic-tlf-ly1.tfm) tex(zpl-Italic-tlf-ot1.tfm) tex(zpl-Italic-tlf-sc-ly1.tfm) tex(zpl-Italic-tlf-sc-ot1.tfm) tex(zpl-Italic-tlf-sc-t1.tfm) tex(zpl-Italic-tlf-scl-ly1.tfm) tex(zpl-Italic-tlf-scl-ot1.tfm) tex(zpl-Italic-tlf-scl-t1.tfm) tex(zpl-Italic-tlf-t1.tfm) tex(zpl-Italic-tosf-ly1.tfm) tex(zpl-Italic-tosf-ot1.tfm) tex(zpl-Italic-tosf-sc-ly1.tfm) tex(zpl-Italic-tosf-sc-ot1.tfm) tex(zpl-Italic-tosf-sc-t1.tfm) tex(zpl-Italic-tosf-scl-ly1.tfm) tex(zpl-Italic-tosf-scl-ot1.tfm) tex(zpl-Italic-tosf-scl-t1.tfm) tex(zpl-Italic-tosf-t1.tfm) tex(zpl-Regular-lf-ly1.tfm) tex(zpl-Regular-lf-ot1.tfm) tex(zpl-Regular-lf-ot1r.tfm) tex(zpl-Regular-lf-sc-ly1.tfm) tex(zpl-Regular-lf-sc-ot1.tfm) tex(zpl-Regular-lf-sc-t1.tfm) tex(zpl-Regular-lf-scl-ly1.tfm) tex(zpl-Regular-lf-scl-ot1.tfm) tex(zpl-Regular-lf-scl-t1.tfm) tex(zpl-Regular-lf-t1.tfm) tex(zpl-Regular-osf-ly1.tfm) tex(zpl-Regular-osf-ot1.tfm) tex(zpl-Regular-osf-ot1r.tfm) tex(zpl-Regular-osf-sc-ly1.tfm) tex(zpl-Regular-osf-sc-ot1.tfm) tex(zpl-Regular-osf-sc-t1.tfm) tex(zpl-Regular-osf-scl-ly1.tfm) tex(zpl-Regular-osf-scl-ot1.tfm) tex(zpl-Regular-osf-scl-t1.tfm) tex(zpl-Regular-osf-t1.tfm) tex(zpl-Regular-tlf-ly1.tfm) tex(zpl-Regular-tlf-ot1.tfm) tex(zpl-Regular-tlf-ot1r.tfm) tex(zpl-Regular-tlf-sc-ly1.tfm) tex(zpl-Regular-tlf-sc-ot1.tfm) tex(zpl-Regular-tlf-sc-t1.tfm) tex(zpl-Regular-tlf-scl-ly1.tfm) tex(zpl-Regular-tlf-scl-ot1.tfm) tex(zpl-Regular-tlf-scl-t1.tfm) tex(zpl-Regular-tlf-t1.tfm) tex(zpl-Regular-tosf-ly1.tfm) tex(zpl-Regular-tosf-ot1.tfm) tex(zpl-Regular-tosf-ot1r.tfm) tex(zpl-Regular-tosf-sc-ly1.tfm) tex(zpl-Regular-tosf-sc-ot1.tfm) tex(zpl-Regular-tosf-sc-t1.tfm) tex(zpl-Regular-tosf-scl-ly1.tfm) tex(zpl-Regular-tosf-scl-ot1.tfm) tex(zpl-Regular-tosf-scl-t1.tfm) tex(zpl-Regular-tosf-t1.tfm) tex(zpl-Slanted-lf-ly1.tfm) tex(zpl-Slanted-lf-ot1.tfm) tex(zpl-Slanted-lf-sc-ly1.tfm) tex(zpl-Slanted-lf-sc-ot1.tfm) tex(zpl-Slanted-lf-sc-t1.tfm) tex(zpl-Slanted-lf-scl-ly1.tfm) tex(zpl-Slanted-lf-scl-ot1.tfm) tex(zpl-Slanted-lf-scl-t1.tfm) tex(zpl-Slanted-lf-t1.tfm) tex(zpl-Slanted-osf-ly1.tfm) tex(zpl-Slanted-osf-ot1.tfm) tex(zpl-Slanted-osf-sc-ly1.tfm) tex(zpl-Slanted-osf-sc-ot1.tfm) tex(zpl-Slanted-osf-sc-t1.tfm) tex(zpl-Slanted-osf-scl-ly1.tfm) tex(zpl-Slanted-osf-scl-ot1.tfm) tex(zpl-Slanted-osf-scl-t1.tfm) tex(zpl-Slanted-osf-t1.tfm) tex(zpl-Slanted-tlf-ly1.tfm) tex(zpl-Slanted-tlf-ot1.tfm) tex(zpl-Slanted-tlf-sc-ly1.tfm) tex(zpl-Slanted-tlf-sc-ot1.tfm) tex(zpl-Slanted-tlf-sc-t1.tfm) tex(zpl-Slanted-tlf-scl-ly1.tfm) tex(zpl-Slanted-tlf-scl-ot1.tfm) tex(zpl-Slanted-tlf-scl-t1.tfm) tex(zpl-Slanted-tlf-t1.tfm) tex(zpl-Slanted-tosf-ly1.tfm) tex(zpl-Slanted-tosf-ot1.tfm) tex(zpl-Slanted-tosf-sc-ly1.tfm) tex(zpl-Slanted-tosf-sc-ot1.tfm) tex(zpl-Slanted-tosf-sc-t1.tfm) tex(zpl-Slanted-tosf-scl-ly1.tfm) tex(zpl-Slanted-tosf-scl-ot1.tfm) tex(zpl-Slanted-tosf-scl-t1.tfm) tex(zpl-Slanted-tosf-t1.tfm) tex(zplLF-Bold-ts1.tfm) tex(zplLF-BoldItalic-ts1.tfm) tex(zplLF-BoldSlanted-ts1.tfm) tex(zplLF-Italic-ts1.tfm) tex(zplLF-Regular-ts1.tfm) tex(zplLF-Slanted-ts1.tfm) tex(zplOsF-Bold-ts1.tfm) tex(zplOsF-BoldItalic-ts1.tfm) tex(zplOsF-BoldSlanted-ts1.tfm) tex(zplOsF-Italic-ts1.tfm) tex(zplOsF-Regular-ts1.tfm) tex(zplOsF-Slanted-ts1.tfm) tex(zplTLF-Bold-ts1.tfm) tex(zplTLF-BoldItalic-ts1.tfm) tex(zplTLF-BoldSlanted-ts1.tfm) tex(zplTLF-Italic-ts1.tfm) tex(zplTLF-Regular-ts1.tfm) tex(zplTLF-Slanted-ts1.tfm) tex(zplTOsF-Bold-ts1.tfm) tex(zplTOsF-BoldItalic-ts1.tfm) tex(zplTOsF-BoldSlanted-ts1.tfm) tex(zplTOsF-Italic-ts1.tfm) tex(zplTOsF-Regular-ts1.tfm) tex(zplTOsF-Slanted-ts1.tfm) tex(zpl_OsF.enc) tex(zpl_TOsF.enc) tex(zplb-x.tfm) tex(zplbexa.tfm) tex(zplbexa.vf) tex(zplbexx.tfm) tex(zplbexx.vf) tex(zplbmi.tfm) tex(zplbmi.vf) tex(zplbmi0.tfm) tex(zplbmi0.vf) tex(zplbmi1.tfm) tex(zplbmi1.vf) tex(zplbmia.tfm) tex(zplbmia.vf) tex(zplbsy.tfm) tex(zplbsy.vf) tex(zplbsyc.tfm) tex(zplbsyc.vf) tex(zplbsym.tfm) tex(zplbsym.vf) tex(zpldnom-Bold-ly1.tfm) tex(zpldnom-Bold-ot1.tfm) tex(zpldnom-Bold-t1.tfm) tex(zpldnom-BoldItalic-ly1.tfm) tex(zpldnom-BoldItalic-ot1.tfm) tex(zpldnom-BoldItalic-t1.tfm) tex(zpldnom-BoldSlanted-ly1.tfm) tex(zpldnom-BoldSlanted-ot1.tfm) tex(zpldnom-BoldSlanted-t1.tfm) tex(zpldnom-Italic-ly1.tfm) tex(zpldnom-Italic-ot1.tfm) tex(zpldnom-Italic-t1.tfm) tex(zpldnom-Regular-ly1.tfm) tex(zpldnom-Regular-ot1.tfm) tex(zpldnom-Regular-t1.tfm) tex(zpldnom-Slanted-ly1.tfm) tex(zpldnom-Slanted-ot1.tfm) tex(zpldnom-Slanted-t1.tfm) tex(zplexa.tfm) tex(zplexa.vf) tex(zplexx.tfm) tex(zplexx.vf) tex(zplmi.tfm) tex(zplmi.vf) tex(zplmi1.tfm) tex(zplmi1.vf) tex(zplmia.tfm) tex(zplmia.vf) tex(zplnumr-Bold-ly1.tfm) tex(zplnumr-Bold-ot1.tfm) tex(zplnumr-Bold-t1.tfm) tex(zplnumr-BoldItalic-ly1.tfm) tex(zplnumr-BoldItalic-ot1.tfm) tex(zplnumr-BoldItalic-t1.tfm) tex(zplnumr-BoldSlanted-ly1.tfm) tex(zplnumr-BoldSlanted-ot1.tfm) tex(zplnumr-BoldSlanted-t1.tfm) tex(zplnumr-Italic-ly1.tfm) tex(zplnumr-Italic-ot1.tfm) tex(zplnumr-Italic-t1.tfm) tex(zplnumr-Regular-ly1.tfm) tex(zplnumr-Regular-ot1.tfm) tex(zplnumr-Regular-t1.tfm) tex(zplnumr-Slanted-ly1.tfm) tex(zplnumr-Slanted-ot1.tfm) tex(zplnumr-Slanted-t1.tfm) tex(zplr-x.tfm) tex(zplsubs-Bold-ly1.tfm) tex(zplsubs-Bold-ot1.tfm) tex(zplsubs-Bold-t1.tfm) tex(zplsubs-BoldItalic-ly1.tfm) tex(zplsubs-BoldItalic-ot1.tfm) tex(zplsubs-BoldItalic-t1.tfm) tex(zplsubs-BoldSlanted-ly1.tfm) tex(zplsubs-BoldSlanted-ot1.tfm) tex(zplsubs-BoldSlanted-t1.tfm) tex(zplsubs-Italic-ly1.tfm) tex(zplsubs-Italic-ot1.tfm) tex(zplsubs-Italic-t1.tfm) tex(zplsubs-Regular-ly1.tfm) tex(zplsubs-Regular-ot1.tfm) tex(zplsubs-Regular-t1.tfm) tex(zplsubs-Slanted-ly1.tfm) tex(zplsubs-Slanted-ot1.tfm) tex(zplsubs-Slanted-t1.tfm) tex(zplsups-Bold-ly1.tfm) tex(zplsups-Bold-ot1.tfm) tex(zplsups-Bold-t1.tfm) tex(zplsups-BoldItalic-ly1.tfm) tex(zplsups-BoldItalic-ot1.tfm) tex(zplsups-BoldItalic-t1.tfm) tex(zplsups-Italic-ly1.tfm) tex(zplsups-Italic-ot1.tfm) tex(zplsups-Italic-t1.tfm) tex(zplsups-Regular-ly1.tfm) tex(zplsups-Regular-ot1.tfm) tex(zplsups-Regular-t1.tfm) tex(zplsy.tfm) tex(zplsy.vf) tex(zplsyc.tfm) tex(zplsyc.vf) tex(zplsym.tfm) tex(zplsym.vf) tex(zplth-Italic-osf-ly1.tfm) tex(zplth-Italic-osf-ot1.tfm) tex(zplth-Italic-osf-t1.tfm) tex(zplth-Italic-tlf-ly1.tfm) tex(zplth-Italic-tlf-ot1.tfm) tex(zplth-Italic-tlf-t1.tfm) tex(ztm-Bold-lf-ly1.tfm) tex(ztm-Bold-lf-ot1.tfm) tex(ztm-Bold-lf-sc-ly1.tfm) tex(ztm-Bold-lf-sc-ot1.tfm) tex(ztm-Bold-lf-sc-t1.tfm) tex(ztm-Bold-lf-t1.tfm) tex(ztm-Bold-osf-ly1.tfm) tex(ztm-Bold-osf-ot1.tfm) tex(ztm-Bold-osf-sc-ly1.tfm) tex(ztm-Bold-osf-sc-ot1.tfm) tex(ztm-Bold-osf-sc-t1.tfm) tex(ztm-Bold-osf-t1.tfm) tex(ztm-Bold-tlf-ly1.tfm) tex(ztm-Bold-tlf-ot1.tfm) tex(ztm-Bold-tlf-sc-ly1.tfm) tex(ztm-Bold-tlf-sc-ot1.tfm) tex(ztm-Bold-tlf-sc-t1.tfm) tex(ztm-Bold-tlf-t1.tfm) tex(ztm-Bold-tosf-ly1.tfm) tex(ztm-Bold-tosf-ot1.tfm) tex(ztm-Bold-tosf-sc-ly1.tfm) tex(ztm-Bold-tosf-sc-ot1.tfm) tex(ztm-Bold-tosf-sc-t1.tfm) tex(ztm-Bold-tosf-t1.tfm) tex(ztm-BoldItalic-lf-ly1.tfm) tex(ztm-BoldItalic-lf-ot1.tfm) tex(ztm-BoldItalic-lf-sc-ly1.tfm) tex(ztm-BoldItalic-lf-sc-ot1.tfm) tex(ztm-BoldItalic-lf-sc-t1.tfm) tex(ztm-BoldItalic-lf-t1.tfm) tex(ztm-BoldItalic-osf-ly1.tfm) tex(ztm-BoldItalic-osf-ot1.tfm) tex(ztm-BoldItalic-osf-sc-ly1.tfm) tex(ztm-BoldItalic-osf-sc-ot1.tfm) tex(ztm-BoldItalic-osf-sc-t1.tfm) tex(ztm-BoldItalic-osf-t1.tfm) tex(ztm-BoldItalic-tlf-ly1.tfm) tex(ztm-BoldItalic-tlf-ot1.tfm) tex(ztm-BoldItalic-tlf-sc-ly1.tfm) tex(ztm-BoldItalic-tlf-sc-ot1.tfm) tex(ztm-BoldItalic-tlf-sc-t1.tfm) tex(ztm-BoldItalic-tlf-t1.tfm) tex(ztm-BoldItalic-tosf-ly1.tfm) tex(ztm-BoldItalic-tosf-ot1.tfm) tex(ztm-BoldItalic-tosf-sc-ly1.tfm) tex(ztm-BoldItalic-tosf-sc-ot1.tfm) tex(ztm-BoldItalic-tosf-sc-t1.tfm) tex(ztm-BoldItalic-tosf-t1.tfm) tex(ztm-Italic-lf-ly1.tfm) tex(ztm-Italic-lf-ot1.tfm) tex(ztm-Italic-lf-sc-ly1.tfm) tex(ztm-Italic-lf-sc-ot1.tfm) tex(ztm-Italic-lf-sc-t1.tfm) tex(ztm-Italic-lf-t1.tfm) tex(ztm-Italic-osf-ly1.tfm) tex(ztm-Italic-osf-ot1.tfm) tex(ztm-Italic-osf-sc-ly1.tfm) tex(ztm-Italic-osf-sc-ot1.tfm) tex(ztm-Italic-osf-sc-t1.tfm) tex(ztm-Italic-osf-t1.tfm) tex(ztm-Italic-tlf-ly1.tfm) tex(ztm-Italic-tlf-ot1.tfm) tex(ztm-Italic-tlf-sc-ly1.tfm) tex(ztm-Italic-tlf-sc-ot1.tfm) tex(ztm-Italic-tlf-sc-t1.tfm) tex(ztm-Italic-tlf-t1.tfm) tex(ztm-Italic-tosf-ly1.tfm) tex(ztm-Italic-tosf-ot1.tfm) tex(ztm-Italic-tosf-sc-ly1.tfm) tex(ztm-Italic-tosf-sc-ot1.tfm) tex(ztm-Italic-tosf-sc-t1.tfm) tex(ztm-Italic-tosf-t1.tfm) tex(ztm-Regular-lf-ly1.tfm) tex(ztm-Regular-lf-ot1r.tfm) tex(ztm-Regular-lf-sc-ly1.tfm) tex(ztm-Regular-lf-sc-ot1.tfm) tex(ztm-Regular-lf-sc-t1.tfm) tex(ztm-Regular-lf-t1.tfm) tex(ztm-Regular-osf-ly1.tfm) tex(ztm-Regular-osf-ot1r.tfm) tex(ztm-Regular-osf-sc-ly1.tfm) tex(ztm-Regular-osf-sc-ot1.tfm) tex(ztm-Regular-osf-sc-t1.tfm) tex(ztm-Regular-osf-t1.tfm) tex(ztm-Regular-tlf-ly1.tfm) tex(ztm-Regular-tlf-ot1r.tfm) tex(ztm-Regular-tlf-sc-ly1.tfm) tex(ztm-Regular-tlf-sc-ot1.tfm) tex(ztm-Regular-tlf-sc-t1.tfm) tex(ztm-Regular-tlf-t1.tfm) tex(ztm-Regular-tosf-ly1.tfm) tex(ztm-Regular-tosf-ot1r.tfm) tex(ztm-Regular-tosf-sc-ly1.tfm) tex(ztm-Regular-tosf-sc-ot1.tfm) tex(ztm-Regular-tosf-sc-t1.tfm) tex(ztm-Regular-tosf-t1.tfm) texlive-newpx"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(amsmath.sty) tex(centernot.sty) tex(etoolbox.sty) tex(fontaxes.sty) tex(fontenc.sty) tex(fontspec.sty) tex(ifluatex.sty) tex(ifthen.sty) tex(ifxetex.sty) tex(mweights.sty) tex(ntxbexa.tfm) tex(ntxbexx.tfm) tex(ntxbsyc.tfm) tex(ntxbsym.tfm) tex(ntxexa.tfm) tex(ntxexx.tfm) tex(ntxsyc.tfm) tex(ntxsym.tfm) tex(pxbmi.tfm) tex(pxbmi1.tfm) tex(realscripts.sty) tex(scalefnt.sty) tex(stxscr.tfm) tex(textcomp.sty) tex(txbex-bar.tfm) tex(txbmiaSTbb.tfm) tex(txex-bar.tfm) tex(txmiaSTbb.tfm) tex(updmap.cfg) tex(xkeyval.sty) tex(xstring.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-newpx-fonts texlive-scripts texlive-scripts-bin"

inherit rpm
