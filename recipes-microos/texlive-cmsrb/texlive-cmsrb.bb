SUMMARY = "Computer Modern for Serbian and Macedonian"
DESCRIPTION = "This package provides provides Adobe Type 1 Computer Modern \
fonts for the Serbian and Macedonian languages. Although the \
cm-super package provides great support for cyrillic script in \
various languages, there remains a problem with italic variants \
of some letters for Serbian and Macedonian. This package \
includes the correct shapes for italic letters \\cyrb, \\cyrg, \
\\cyrd, \\cyrp, and \\cyrt. It also offers some improvements in \
letters and accents used in the Serbian language. Supported \
encodings are: T1, T2A, TS1, X2 and OT2. The OT2 encoding is \
modified so that it is now easy to transcribe Latin text to \
Cyrillic."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.4.0svn54706"

RPM_NAME = "texlive-cmsrb-2023.201.4.0svn54706-53.1.noarch.rpm"
RPM_HASH = "d84ec92b14b6f434ca5760d0e65b9c8f28979578e96240ef958f6cdaf7cd8e1e4738b24154a68d6a21d9aa9b9d33f08e8a33a0aa4f0e6ce938e6ec248e853c52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(cmsrb.map) \
tex(cmsrb.sty) \
tex(cmsrbecmsrb1.enc) \
tex(cmsrbecmsrb2.enc) \
tex(cmsrbot2.enc) \
tex(cmsrbt1.enc) \
tex(cmsrbt2a.enc) \
tex(cmsrbts1.enc) \
tex(cmsrbx2.enc) \
tex(ecmsrb1cmr.fd) \
tex(ecmsrb1cmsrbr.fd) \
tex(ecmsrb1cmsrbrb-base.tfm) \
tex(ecmsrb1cmsrbrb.tfm) \
tex(ecmsrb1cmsrbrb.vf) \
tex(ecmsrb1cmsrbrc-base.tfm) \
tex(ecmsrb1cmsrbrc.tfm) \
tex(ecmsrb1cmsrbrc.vf) \
tex(ecmsrb1cmsrbrd-base.tfm) \
tex(ecmsrb1cmsrbrd.tfm) \
tex(ecmsrb1cmsrbrd.vf) \
tex(ecmsrb1cmsrbri-base.tfm) \
tex(ecmsrb1cmsrbri.tfm) \
tex(ecmsrb1cmsrbri.vf) \
tex(ecmsrb1cmsrbrr-base.tfm) \
tex(ecmsrb1cmsrbrr.tfm) \
tex(ecmsrb1cmsrbrr.vf) \
tex(ecmsrb1cmsrbrs-base.tfm) \
tex(ecmsrb1cmsrbrs.tfm) \
tex(ecmsrb1cmsrbrs.vf) \
tex(ecmsrb1cmsrbrx-base.tfm) \
tex(ecmsrb1cmsrbrx.tfm) \
tex(ecmsrb1cmsrbrx.vf) \
tex(ecmsrb1cmsrbry-base.tfm) \
tex(ecmsrb1cmsrbry.tfm) \
tex(ecmsrb1cmsrbry.vf) \
tex(ecmsrb1cmsrbs.fd) \
tex(ecmsrb1cmsrbsb-base.tfm) \
tex(ecmsrb1cmsrbsb.tfm) \
tex(ecmsrb1cmsrbsb.vf) \
tex(ecmsrb1cmsrbsr-base.tfm) \
tex(ecmsrb1cmsrbsr.tfm) \
tex(ecmsrb1cmsrbsr.vf) \
tex(ecmsrb1cmsrbss-base.tfm) \
tex(ecmsrb1cmsrbss.tfm) \
tex(ecmsrb1cmsrbss.vf) \
tex(ecmsrb1cmsrbst-base.tfm) \
tex(ecmsrb1cmsrbst.tfm) \
tex(ecmsrb1cmsrbst.vf) \
tex(ecmsrb1cmsrbt.fd) \
tex(ecmsrb1cmsrbtc-base.tfm) \
tex(ecmsrb1cmsrbtc.tfm) \
tex(ecmsrb1cmsrbtc.vf) \
tex(ecmsrb1cmsrbti-base.tfm) \
tex(ecmsrb1cmsrbti.tfm) \
tex(ecmsrb1cmsrbti.vf) \
tex(ecmsrb1cmsrbtr-base.tfm) \
tex(ecmsrb1cmsrbtr.tfm) \
tex(ecmsrb1cmsrbtr.vf) \
tex(ecmsrb1cmsrbts-base.tfm) \
tex(ecmsrb1cmsrbts.tfm) \
tex(ecmsrb1cmsrbts.vf) \
tex(ecmsrb1enc.def) \
tex(ecmsrb2cmr.fd) \
tex(ecmsrb2cmsrbr.fd) \
tex(ecmsrb2cmsrbrb-base.tfm) \
tex(ecmsrb2cmsrbrb.tfm) \
tex(ecmsrb2cmsrbrb.vf) \
tex(ecmsrb2cmsrbrc-base.tfm) \
tex(ecmsrb2cmsrbrc.tfm) \
tex(ecmsrb2cmsrbrc.vf) \
tex(ecmsrb2cmsrbrd-base.tfm) \
tex(ecmsrb2cmsrbrd.tfm) \
tex(ecmsrb2cmsrbrd.vf) \
tex(ecmsrb2cmsrbri-base.tfm) \
tex(ecmsrb2cmsrbri.tfm) \
tex(ecmsrb2cmsrbri.vf) \
tex(ecmsrb2cmsrbrr-base.tfm) \
tex(ecmsrb2cmsrbrr.tfm) \
tex(ecmsrb2cmsrbrr.vf) \
tex(ecmsrb2cmsrbrs-base.tfm) \
tex(ecmsrb2cmsrbrs.tfm) \
tex(ecmsrb2cmsrbrs.vf) \
tex(ecmsrb2cmsrbrx-base.tfm) \
tex(ecmsrb2cmsrbrx.tfm) \
tex(ecmsrb2cmsrbrx.vf) \
tex(ecmsrb2cmsrbry-base.tfm) \
tex(ecmsrb2cmsrbry.tfm) \
tex(ecmsrb2cmsrbry.vf) \
tex(ecmsrb2cmsrbs.fd) \
tex(ecmsrb2cmsrbsb-base.tfm) \
tex(ecmsrb2cmsrbsb.tfm) \
tex(ecmsrb2cmsrbsb.vf) \
tex(ecmsrb2cmsrbsr-base.tfm) \
tex(ecmsrb2cmsrbsr.tfm) \
tex(ecmsrb2cmsrbsr.vf) \
tex(ecmsrb2cmsrbss-base.tfm) \
tex(ecmsrb2cmsrbss.tfm) \
tex(ecmsrb2cmsrbss.vf) \
tex(ecmsrb2cmsrbst-base.tfm) \
tex(ecmsrb2cmsrbst.tfm) \
tex(ecmsrb2cmsrbst.vf) \
tex(ecmsrb2cmsrbt.fd) \
tex(ecmsrb2cmsrbtc-base.tfm) \
tex(ecmsrb2cmsrbtc.tfm) \
tex(ecmsrb2cmsrbtc.vf) \
tex(ecmsrb2cmsrbti-base.tfm) \
tex(ecmsrb2cmsrbti.tfm) \
tex(ecmsrb2cmsrbti.vf) \
tex(ecmsrb2cmsrbtr-base.tfm) \
tex(ecmsrb2cmsrbtr.tfm) \
tex(ecmsrb2cmsrbtr.vf) \
tex(ecmsrb2cmsrbts-base.tfm) \
tex(ecmsrb2cmsrbts.tfm) \
tex(ecmsrb2cmsrbts.vf) \
tex(ecmsrb2enc.def) \
tex(ot2cmsrbr.fd) \
tex(ot2cmsrbrb-base.tfm) \
tex(ot2cmsrbrb.tfm) \
tex(ot2cmsrbrb.vf) \
tex(ot2cmsrbrc-base.tfm) \
tex(ot2cmsrbrc.tfm) \
tex(ot2cmsrbrc.vf) \
tex(ot2cmsrbrd-base.tfm) \
tex(ot2cmsrbrd.tfm) \
tex(ot2cmsrbrd.vf) \
tex(ot2cmsrbri-base.tfm) \
tex(ot2cmsrbri.tfm) \
tex(ot2cmsrbri.vf) \
tex(ot2cmsrbrr-base.tfm) \
tex(ot2cmsrbrr.tfm) \
tex(ot2cmsrbrr.vf) \
tex(ot2cmsrbrs-base.tfm) \
tex(ot2cmsrbrs.tfm) \
tex(ot2cmsrbrs.vf) \
tex(ot2cmsrbrx-base.tfm) \
tex(ot2cmsrbrx.tfm) \
tex(ot2cmsrbrx.vf) \
tex(ot2cmsrbry-base.tfm) \
tex(ot2cmsrbry.tfm) \
tex(ot2cmsrbry.vf) \
tex(ot2cmsrbs.fd) \
tex(ot2cmsrbsb-base.tfm) \
tex(ot2cmsrbsb.tfm) \
tex(ot2cmsrbsb.vf) \
tex(ot2cmsrbsr-base.tfm) \
tex(ot2cmsrbsr.tfm) \
tex(ot2cmsrbsr.vf) \
tex(ot2cmsrbss-base.tfm) \
tex(ot2cmsrbss.tfm) \
tex(ot2cmsrbss.vf) \
tex(ot2cmsrbst-base.tfm) \
tex(ot2cmsrbst.tfm) \
tex(ot2cmsrbst.vf) \
tex(ot2cmsrbt.fd) \
tex(ot2cmsrbtc-base.tfm) \
tex(ot2cmsrbtc.tfm) \
tex(ot2cmsrbtc.vf) \
tex(ot2cmsrbti-base.tfm) \
tex(ot2cmsrbti.tfm) \
tex(ot2cmsrbti.vf) \
tex(ot2cmsrbtr-base.tfm) \
tex(ot2cmsrbtr.tfm) \
tex(ot2cmsrbtr.vf) \
tex(ot2cmsrbts-base.tfm) \
tex(ot2cmsrbts.tfm) \
tex(ot2cmsrbts.vf) \
tex(t1cmsrbr.fd) \
tex(t1cmsrbrb-base.tfm) \
tex(t1cmsrbrb.tfm) \
tex(t1cmsrbrb.vf) \
tex(t1cmsrbrc-base.tfm) \
tex(t1cmsrbrc.tfm) \
tex(t1cmsrbrc.vf) \
tex(t1cmsrbrd-base.tfm) \
tex(t1cmsrbrd.tfm) \
tex(t1cmsrbrd.vf) \
tex(t1cmsrbri-base.tfm) \
tex(t1cmsrbri.tfm) \
tex(t1cmsrbri.vf) \
tex(t1cmsrbrr-base.tfm) \
tex(t1cmsrbrr.tfm) \
tex(t1cmsrbrr.vf) \
tex(t1cmsrbrs-base.tfm) \
tex(t1cmsrbrs.tfm) \
tex(t1cmsrbrs.vf) \
tex(t1cmsrbrx-base.tfm) \
tex(t1cmsrbrx.tfm) \
tex(t1cmsrbrx.vf) \
tex(t1cmsrbry-base.tfm) \
tex(t1cmsrbry.tfm) \
tex(t1cmsrbry.vf) \
tex(t1cmsrbs.fd) \
tex(t1cmsrbsb-base.tfm) \
tex(t1cmsrbsb.tfm) \
tex(t1cmsrbsb.vf) \
tex(t1cmsrbsr-base.tfm) \
tex(t1cmsrbsr.tfm) \
tex(t1cmsrbsr.vf) \
tex(t1cmsrbss-base.tfm) \
tex(t1cmsrbss.tfm) \
tex(t1cmsrbss.vf) \
tex(t1cmsrbst-base.tfm) \
tex(t1cmsrbst.tfm) \
tex(t1cmsrbst.vf) \
tex(t1cmsrbt.fd) \
tex(t1cmsrbtc-base.tfm) \
tex(t1cmsrbtc.tfm) \
tex(t1cmsrbtc.vf) \
tex(t1cmsrbti-base.tfm) \
tex(t1cmsrbti.tfm) \
tex(t1cmsrbti.vf) \
tex(t1cmsrbtr-base.tfm) \
tex(t1cmsrbtr.tfm) \
tex(t1cmsrbtr.vf) \
tex(t1cmsrbts-base.tfm) \
tex(t1cmsrbts.tfm) \
tex(t1cmsrbts.vf) \
tex(t2acmsrbr.fd) \
tex(t2acmsrbrb-base.tfm) \
tex(t2acmsrbrb.tfm) \
tex(t2acmsrbrb.vf) \
tex(t2acmsrbrc-base.tfm) \
tex(t2acmsrbrc.tfm) \
tex(t2acmsrbrc.vf) \
tex(t2acmsrbrd-base.tfm) \
tex(t2acmsrbrd.tfm) \
tex(t2acmsrbrd.vf) \
tex(t2acmsrbri-base.tfm) \
tex(t2acmsrbri.tfm) \
tex(t2acmsrbri.vf) \
tex(t2acmsrbrr-base.tfm) \
tex(t2acmsrbrr.tfm) \
tex(t2acmsrbrr.vf) \
tex(t2acmsrbrs-base.tfm) \
tex(t2acmsrbrs.tfm) \
tex(t2acmsrbrs.vf) \
tex(t2acmsrbrx-base.tfm) \
tex(t2acmsrbrx.tfm) \
tex(t2acmsrbrx.vf) \
tex(t2acmsrbry-base.tfm) \
tex(t2acmsrbry.tfm) \
tex(t2acmsrbry.vf) \
tex(t2acmsrbs.fd) \
tex(t2acmsrbsb-base.tfm) \
tex(t2acmsrbsb.tfm) \
tex(t2acmsrbsb.vf) \
tex(t2acmsrbsr-base.tfm) \
tex(t2acmsrbsr.tfm) \
tex(t2acmsrbsr.vf) \
tex(t2acmsrbss-base.tfm) \
tex(t2acmsrbss.tfm) \
tex(t2acmsrbss.vf) \
tex(t2acmsrbst-base.tfm) \
tex(t2acmsrbst.tfm) \
tex(t2acmsrbst.vf) \
tex(t2acmsrbt.fd) \
tex(t2acmsrbtc-base.tfm) \
tex(t2acmsrbtc.tfm) \
tex(t2acmsrbtc.vf) \
tex(t2acmsrbti-base.tfm) \
tex(t2acmsrbti.tfm) \
tex(t2acmsrbti.vf) \
tex(t2acmsrbtr-base.tfm) \
tex(t2acmsrbtr.tfm) \
tex(t2acmsrbtr.vf) \
tex(t2acmsrbts-base.tfm) \
tex(t2acmsrbts.tfm) \
tex(t2acmsrbts.vf) \
tex(ts1cmsrbr.fd) \
tex(ts1cmsrbrb-base.tfm) \
tex(ts1cmsrbrb.tfm) \
tex(ts1cmsrbrb.vf) \
tex(ts1cmsrbrc-base.tfm) \
tex(ts1cmsrbrc.tfm) \
tex(ts1cmsrbrc.vf) \
tex(ts1cmsrbrd-base.tfm) \
tex(ts1cmsrbrd.tfm) \
tex(ts1cmsrbrd.vf) \
tex(ts1cmsrbri-base.tfm) \
tex(ts1cmsrbri.tfm) \
tex(ts1cmsrbri.vf) \
tex(ts1cmsrbrr-base.tfm) \
tex(ts1cmsrbrr.tfm) \
tex(ts1cmsrbrr.vf) \
tex(ts1cmsrbrs-base.tfm) \
tex(ts1cmsrbrs.tfm) \
tex(ts1cmsrbrs.vf) \
tex(ts1cmsrbrx-base.tfm) \
tex(ts1cmsrbrx.tfm) \
tex(ts1cmsrbrx.vf) \
tex(ts1cmsrbry-base.tfm) \
tex(ts1cmsrbry.tfm) \
tex(ts1cmsrbry.vf) \
tex(ts1cmsrbs.fd) \
tex(ts1cmsrbsb-base.tfm) \
tex(ts1cmsrbsb.tfm) \
tex(ts1cmsrbsb.vf) \
tex(ts1cmsrbsr-base.tfm) \
tex(ts1cmsrbsr.tfm) \
tex(ts1cmsrbsr.vf) \
tex(ts1cmsrbss-base.tfm) \
tex(ts1cmsrbss.tfm) \
tex(ts1cmsrbss.vf) \
tex(ts1cmsrbst-base.tfm) \
tex(ts1cmsrbst.tfm) \
tex(ts1cmsrbst.vf) \
tex(ts1cmsrbt.fd) \
tex(ts1cmsrbtc-base.tfm) \
tex(ts1cmsrbtc.tfm) \
tex(ts1cmsrbtc.vf) \
tex(ts1cmsrbti-base.tfm) \
tex(ts1cmsrbti.tfm) \
tex(ts1cmsrbti.vf) \
tex(ts1cmsrbtr-base.tfm) \
tex(ts1cmsrbtr.tfm) \
tex(ts1cmsrbtr.vf) \
tex(ts1cmsrbts-base.tfm) \
tex(ts1cmsrbts.tfm) \
tex(ts1cmsrbts.vf) \
tex(x2cmsrbr.fd) \
tex(x2cmsrbrb-base.tfm) \
tex(x2cmsrbrb.tfm) \
tex(x2cmsrbrb.vf) \
tex(x2cmsrbrc-base.tfm) \
tex(x2cmsrbrc.tfm) \
tex(x2cmsrbrc.vf) \
tex(x2cmsrbrd-base.tfm) \
tex(x2cmsrbrd.tfm) \
tex(x2cmsrbrd.vf) \
tex(x2cmsrbri-base.tfm) \
tex(x2cmsrbri.tfm) \
tex(x2cmsrbri.vf) \
tex(x2cmsrbrr-base.tfm) \
tex(x2cmsrbrr.tfm) \
tex(x2cmsrbrr.vf) \
tex(x2cmsrbrs-base.tfm) \
tex(x2cmsrbrs.tfm) \
tex(x2cmsrbrs.vf) \
tex(x2cmsrbrx-base.tfm) \
tex(x2cmsrbrx.tfm) \
tex(x2cmsrbrx.vf) \
tex(x2cmsrbry-base.tfm) \
tex(x2cmsrbry.tfm) \
tex(x2cmsrbry.vf) \
tex(x2cmsrbs.fd) \
tex(x2cmsrbsb-base.tfm) \
tex(x2cmsrbsb.tfm) \
tex(x2cmsrbsb.vf) \
tex(x2cmsrbsr-base.tfm) \
tex(x2cmsrbsr.tfm) \
tex(x2cmsrbsr.vf) \
tex(x2cmsrbss-base.tfm) \
tex(x2cmsrbss.tfm) \
tex(x2cmsrbss.vf) \
tex(x2cmsrbst-base.tfm) \
tex(x2cmsrbst.tfm) \
tex(x2cmsrbst.vf) \
tex(x2cmsrbt.fd) \
tex(x2cmsrbtc-base.tfm) \
tex(x2cmsrbtc.tfm) \
tex(x2cmsrbtc.vf) \
tex(x2cmsrbti-base.tfm) \
tex(x2cmsrbti.tfm) \
tex(x2cmsrbti.vf) \
tex(x2cmsrbtr-base.tfm) \
tex(x2cmsrbtr.tfm) \
tex(x2cmsrbtr.vf) \
tex(x2cmsrbts-base.tfm) \
tex(x2cmsrbts.tfm) \
tex(x2cmsrbts.vf) \
texlive-cmsrb"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amssymb.sty) \
tex(cmupint.sty) \
tex(updmap.cfg) \
texlive \
texlive-cmsrb-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
