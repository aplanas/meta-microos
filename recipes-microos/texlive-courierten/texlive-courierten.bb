SUMMARY = "Courier 10 Pitch BT with LaTeX support"
DESCRIPTION = "This is the font Courier 10 Pitch BT, with LaTeX support and an \
OpenType conversion as well."
LICENSE = "LPPL-1.0"

PV = "2023.204.svn55436"

RPM_NAME = "texlive-courierten-2023.204.svn55436-54.1.noarch.rpm"
RPM_HASH = "db2c6b30e6cb1a0ebc5d292af80586e12de785f58fc9f9e0e82edf60f80dd91c3724814dc4791bb54eb405ac0bb15f85bf914f1f2120037e39b20d8e4c458845"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(Courier10PitchBT-Bold-tlf-ly1--base.tfm) \
tex(Courier10PitchBT-Bold-tlf-ly1--lcdfj.tfm) \
tex(Courier10PitchBT-Bold-tlf-ly1.tfm) \
tex(Courier10PitchBT-Bold-tlf-ly1.vf) \
tex(Courier10PitchBT-Bold-tlf-ot1--base.tfm) \
tex(Courier10PitchBT-Bold-tlf-ot1--lcdfj.tfm) \
tex(Courier10PitchBT-Bold-tlf-ot1.tfm) \
tex(Courier10PitchBT-Bold-tlf-ot1.vf) \
tex(Courier10PitchBT-Bold-tlf-t1--base.tfm) \
tex(Courier10PitchBT-Bold-tlf-t1--lcdfj.tfm) \
tex(Courier10PitchBT-Bold-tlf-t1.tfm) \
tex(Courier10PitchBT-Bold-tlf-t1.vf) \
tex(Courier10PitchBT-Bold-tlf-ts1--base.tfm) \
tex(Courier10PitchBT-Bold-tlf-ts1.tfm) \
tex(Courier10PitchBT-Bold-tlf-ts1.vf) \
tex(Courier10PitchBT-BoldItalic-tlf-ly1--base.tfm) \
tex(Courier10PitchBT-BoldItalic-tlf-ly1--lcdfj.tfm) \
tex(Courier10PitchBT-BoldItalic-tlf-ly1.tfm) \
tex(Courier10PitchBT-BoldItalic-tlf-ly1.vf) \
tex(Courier10PitchBT-BoldItalic-tlf-ot1--base.tfm) \
tex(Courier10PitchBT-BoldItalic-tlf-ot1--lcdfj.tfm) \
tex(Courier10PitchBT-BoldItalic-tlf-ot1.tfm) \
tex(Courier10PitchBT-BoldItalic-tlf-ot1.vf) \
tex(Courier10PitchBT-BoldItalic-tlf-t1--base.tfm) \
tex(Courier10PitchBT-BoldItalic-tlf-t1--lcdfj.tfm) \
tex(Courier10PitchBT-BoldItalic-tlf-t1.tfm) \
tex(Courier10PitchBT-BoldItalic-tlf-t1.vf) \
tex(Courier10PitchBT-BoldItalic-tlf-ts1--base.tfm) \
tex(Courier10PitchBT-BoldItalic-tlf-ts1.tfm) \
tex(Courier10PitchBT-BoldItalic-tlf-ts1.vf) \
tex(Courier10PitchBT-Italic-tlf-ly1--base.tfm) \
tex(Courier10PitchBT-Italic-tlf-ly1--lcdfj.tfm) \
tex(Courier10PitchBT-Italic-tlf-ly1.tfm) \
tex(Courier10PitchBT-Italic-tlf-ly1.vf) \
tex(Courier10PitchBT-Italic-tlf-ot1--base.tfm) \
tex(Courier10PitchBT-Italic-tlf-ot1--lcdfj.tfm) \
tex(Courier10PitchBT-Italic-tlf-ot1.tfm) \
tex(Courier10PitchBT-Italic-tlf-ot1.vf) \
tex(Courier10PitchBT-Italic-tlf-t1--base.tfm) \
tex(Courier10PitchBT-Italic-tlf-t1--lcdfj.tfm) \
tex(Courier10PitchBT-Italic-tlf-t1.tfm) \
tex(Courier10PitchBT-Italic-tlf-t1.vf) \
tex(Courier10PitchBT-Italic-tlf-ts1--base.tfm) \
tex(Courier10PitchBT-Italic-tlf-ts1.tfm) \
tex(Courier10PitchBT-Italic-tlf-ts1.vf) \
tex(Courier10PitchBT-Roman-tlf-ly1--base.tfm) \
tex(Courier10PitchBT-Roman-tlf-ly1--lcdfj.tfm) \
tex(Courier10PitchBT-Roman-tlf-ly1.tfm) \
tex(Courier10PitchBT-Roman-tlf-ly1.vf) \
tex(Courier10PitchBT-Roman-tlf-ot1--base.tfm) \
tex(Courier10PitchBT-Roman-tlf-ot1--lcdfj.tfm) \
tex(Courier10PitchBT-Roman-tlf-ot1.tfm) \
tex(Courier10PitchBT-Roman-tlf-ot1.vf) \
tex(Courier10PitchBT-Roman-tlf-t1--base.tfm) \
tex(Courier10PitchBT-Roman-tlf-t1--lcdfj.tfm) \
tex(Courier10PitchBT-Roman-tlf-t1.tfm) \
tex(Courier10PitchBT-Roman-tlf-t1.vf) \
tex(Courier10PitchBT-Roman-tlf-ts1--base.tfm) \
tex(Courier10PitchBT-Roman-tlf-ts1.tfm) \
tex(Courier10PitchBT-Roman-tlf-ts1.vf) \
tex(CourierOneZeroPitch.map) \
tex(LY1CourierOneZeroPitch-TLF.fd) \
tex(OT1CourierOneZeroPitch-TLF.fd) \
tex(T1CourierOneZeroPitch-TLF.fd) \
tex(TS1CourierOneZeroPitch-TLF.fd) \
tex(a_2hg32y.enc) \
tex(a_5k4rzj.enc) \
tex(a_keoqme.enc) \
tex(a_n2okah.enc) \
tex(courierten.sty) \
texlive-courierten"
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
texlive-courierten-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
