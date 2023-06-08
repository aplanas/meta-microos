SUMMARY = "LaTeX support for MintSpirit font families"
DESCRIPTION = "The package provides LaTeX, pdfLaTeX, XeLaTeX and LuaLaTeX \
support for the MintSpirit and MintSpiritNo2 families of fonts, \
designed by Hirwen Harendal. MintSpirit was originally designed \
for use as a system font on a Linux Mint system. The No. 2 \
variant provides more conventional shapes for some glyphs."
LICENSE = "OFL-1.1"

PV = "2023.201.svn64461"

RPM_NAME = "texlive-mintspirit-2023.201.svn64461-54.1.noarch.rpm"
RPM_HASH = "0b9a399931d1b68afcf6b50d920cecd5d39ab7339d0aeb6df6f3ac0698b796d5eb70e249eb9c40325d40429a703aded79937d4389de1b7285a3148ccd00b9cef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(LY1MintSpirit-Inf.fd) tex(LY1MintSpirit-LF.fd) tex(LY1MintSpirit-OsF.fd) tex(LY1MintSpirit-Sup.fd) tex(LY1MintSpirit-TLF.fd) tex(LY1MintSpirit-TOsF.fd) tex(LY1MintSpiritNoTwo-Inf.fd) tex(LY1MintSpiritNoTwo-LF.fd) tex(LY1MintSpiritNoTwo-OsF.fd) tex(LY1MintSpiritNoTwo-Sup.fd) tex(LY1MintSpiritNoTwo-TLF.fd) tex(LY1MintSpiritNoTwo-TOsF.fd) tex(MintSpirit-Bold-inf-ly1--base.tfm) tex(MintSpirit-Bold-inf-ly1.tfm) tex(MintSpirit-Bold-inf-ly1.vf) tex(MintSpirit-Bold-inf-ot1.tfm) tex(MintSpirit-Bold-inf-t1--base.tfm) tex(MintSpirit-Bold-inf-t1.tfm) tex(MintSpirit-Bold-inf-t1.vf) tex(MintSpirit-Bold-lf-ly1--base.tfm) tex(MintSpirit-Bold-lf-ly1.tfm) tex(MintSpirit-Bold-lf-ly1.vf) tex(MintSpirit-Bold-lf-ot1.tfm) tex(MintSpirit-Bold-lf-t1--base.tfm) tex(MintSpirit-Bold-lf-t1.tfm) tex(MintSpirit-Bold-lf-t1.vf) tex(MintSpirit-Bold-lf-ts1--base.tfm) tex(MintSpirit-Bold-lf-ts1.tfm) tex(MintSpirit-Bold-lf-ts1.vf) tex(MintSpirit-Bold-osf-ly1--base.tfm) tex(MintSpirit-Bold-osf-ly1.tfm) tex(MintSpirit-Bold-osf-ly1.vf) tex(MintSpirit-Bold-osf-ot1.tfm) tex(MintSpirit-Bold-osf-t1--base.tfm) tex(MintSpirit-Bold-osf-t1.tfm) tex(MintSpirit-Bold-osf-t1.vf) tex(MintSpirit-Bold-osf-ts1--base.tfm) tex(MintSpirit-Bold-osf-ts1.tfm) tex(MintSpirit-Bold-osf-ts1.vf) tex(MintSpirit-Bold-sup-ly1--base.tfm) tex(MintSpirit-Bold-sup-ly1.tfm) tex(MintSpirit-Bold-sup-ly1.vf) tex(MintSpirit-Bold-sup-ot1.tfm) tex(MintSpirit-Bold-sup-t1--base.tfm) tex(MintSpirit-Bold-sup-t1.tfm) tex(MintSpirit-Bold-sup-t1.vf) tex(MintSpirit-Bold-tlf-ly1--base.tfm) tex(MintSpirit-Bold-tlf-ly1.tfm) tex(MintSpirit-Bold-tlf-ly1.vf) tex(MintSpirit-Bold-tlf-ot1.tfm) tex(MintSpirit-Bold-tlf-t1--base.tfm) tex(MintSpirit-Bold-tlf-t1.tfm) tex(MintSpirit-Bold-tlf-t1.vf) tex(MintSpirit-Bold-tlf-ts1--base.tfm) tex(MintSpirit-Bold-tlf-ts1.tfm) tex(MintSpirit-Bold-tlf-ts1.vf) tex(MintSpirit-Bold-tosf-ly1--base.tfm) tex(MintSpirit-Bold-tosf-ly1.tfm) tex(MintSpirit-Bold-tosf-ly1.vf) tex(MintSpirit-Bold-tosf-ot1.tfm) tex(MintSpirit-Bold-tosf-t1--base.tfm) tex(MintSpirit-Bold-tosf-t1.tfm) tex(MintSpirit-Bold-tosf-t1.vf) tex(MintSpirit-Bold-tosf-ts1--base.tfm) tex(MintSpirit-Bold-tosf-ts1.tfm) tex(MintSpirit-Bold-tosf-ts1.vf) tex(MintSpirit-BoldItalic-inf-ly1--base.tfm) tex(MintSpirit-BoldItalic-inf-ly1.tfm) tex(MintSpirit-BoldItalic-inf-ly1.vf) tex(MintSpirit-BoldItalic-inf-ot1.tfm) tex(MintSpirit-BoldItalic-inf-t1--base.tfm) tex(MintSpirit-BoldItalic-inf-t1.tfm) tex(MintSpirit-BoldItalic-inf-t1.vf) tex(MintSpirit-BoldItalic-lf-ly1--base.tfm) tex(MintSpirit-BoldItalic-lf-ly1.tfm) tex(MintSpirit-BoldItalic-lf-ly1.vf) tex(MintSpirit-BoldItalic-lf-ot1.tfm) tex(MintSpirit-BoldItalic-lf-t1--base.tfm) tex(MintSpirit-BoldItalic-lf-t1.tfm) tex(MintSpirit-BoldItalic-lf-t1.vf) tex(MintSpirit-BoldItalic-lf-ts1--base.tfm) tex(MintSpirit-BoldItalic-lf-ts1.tfm) tex(MintSpirit-BoldItalic-lf-ts1.vf) tex(MintSpirit-BoldItalic-osf-ly1--base.tfm) tex(MintSpirit-BoldItalic-osf-ly1.tfm) tex(MintSpirit-BoldItalic-osf-ly1.vf) tex(MintSpirit-BoldItalic-osf-ot1.tfm) tex(MintSpirit-BoldItalic-osf-t1--base.tfm) tex(MintSpirit-BoldItalic-osf-t1.tfm) tex(MintSpirit-BoldItalic-osf-t1.vf) tex(MintSpirit-BoldItalic-osf-ts1--base.tfm) tex(MintSpirit-BoldItalic-osf-ts1.tfm) tex(MintSpirit-BoldItalic-osf-ts1.vf) tex(MintSpirit-BoldItalic-sup-ly1--base.tfm) tex(MintSpirit-BoldItalic-sup-ly1.tfm) tex(MintSpirit-BoldItalic-sup-ly1.vf) tex(MintSpirit-BoldItalic-sup-ot1.tfm) tex(MintSpirit-BoldItalic-sup-t1--base.tfm) tex(MintSpirit-BoldItalic-sup-t1.tfm) tex(MintSpirit-BoldItalic-sup-t1.vf) tex(MintSpirit-BoldItalic-tlf-ly1--base.tfm) tex(MintSpirit-BoldItalic-tlf-ly1.tfm) tex(MintSpirit-BoldItalic-tlf-ly1.vf) tex(MintSpirit-BoldItalic-tlf-ot1.tfm) tex(MintSpirit-BoldItalic-tlf-t1--base.tfm) tex(MintSpirit-BoldItalic-tlf-t1.tfm) tex(MintSpirit-BoldItalic-tlf-t1.vf) tex(MintSpirit-BoldItalic-tlf-ts1--base.tfm) tex(MintSpirit-BoldItalic-tlf-ts1.tfm) tex(MintSpirit-BoldItalic-tlf-ts1.vf) tex(MintSpirit-BoldItalic-tosf-ly1--base.tfm) tex(MintSpirit-BoldItalic-tosf-ly1.tfm) tex(MintSpirit-BoldItalic-tosf-ly1.vf) tex(MintSpirit-BoldItalic-tosf-ot1.tfm) tex(MintSpirit-BoldItalic-tosf-t1--base.tfm) tex(MintSpirit-BoldItalic-tosf-t1.tfm) tex(MintSpirit-BoldItalic-tosf-t1.vf) tex(MintSpirit-BoldItalic-tosf-ts1--base.tfm) tex(MintSpirit-BoldItalic-tosf-ts1.tfm) tex(MintSpirit-BoldItalic-tosf-ts1.vf) tex(MintSpirit-Italic-inf-ly1--base.tfm) tex(MintSpirit-Italic-inf-ly1.tfm) tex(MintSpirit-Italic-inf-ly1.vf) tex(MintSpirit-Italic-inf-ot1.tfm) tex(MintSpirit-Italic-inf-t1--base.tfm) tex(MintSpirit-Italic-inf-t1.tfm) tex(MintSpirit-Italic-inf-t1.vf) tex(MintSpirit-Italic-lf-ly1--base.tfm) tex(MintSpirit-Italic-lf-ly1.tfm) tex(MintSpirit-Italic-lf-ly1.vf) tex(MintSpirit-Italic-lf-ot1.tfm) tex(MintSpirit-Italic-lf-t1--base.tfm) tex(MintSpirit-Italic-lf-t1.tfm) tex(MintSpirit-Italic-lf-t1.vf) tex(MintSpirit-Italic-lf-ts1--base.tfm) tex(MintSpirit-Italic-lf-ts1.tfm) tex(MintSpirit-Italic-lf-ts1.vf) tex(MintSpirit-Italic-osf-ly1--base.tfm) tex(MintSpirit-Italic-osf-ly1.tfm) tex(MintSpirit-Italic-osf-ly1.vf) tex(MintSpirit-Italic-osf-ot1.tfm) tex(MintSpirit-Italic-osf-t1--base.tfm) tex(MintSpirit-Italic-osf-t1.tfm) tex(MintSpirit-Italic-osf-t1.vf) tex(MintSpirit-Italic-osf-ts1--base.tfm) tex(MintSpirit-Italic-osf-ts1.tfm) tex(MintSpirit-Italic-osf-ts1.vf) tex(MintSpirit-Italic-sup-ly1--base.tfm) tex(MintSpirit-Italic-sup-ly1.tfm) tex(MintSpirit-Italic-sup-ly1.vf) tex(MintSpirit-Italic-sup-ot1.tfm) tex(MintSpirit-Italic-sup-t1--base.tfm) tex(MintSpirit-Italic-sup-t1.tfm) tex(MintSpirit-Italic-sup-t1.vf) tex(MintSpirit-Italic-tlf-ly1--base.tfm) tex(MintSpirit-Italic-tlf-ly1.tfm) tex(MintSpirit-Italic-tlf-ly1.vf) tex(MintSpirit-Italic-tlf-ot1.tfm) tex(MintSpirit-Italic-tlf-t1--base.tfm) tex(MintSpirit-Italic-tlf-t1.tfm) tex(MintSpirit-Italic-tlf-t1.vf) tex(MintSpirit-Italic-tlf-ts1--base.tfm) tex(MintSpirit-Italic-tlf-ts1.tfm) tex(MintSpirit-Italic-tlf-ts1.vf) tex(MintSpirit-Italic-tosf-ly1--base.tfm) tex(MintSpirit-Italic-tosf-ly1.tfm) tex(MintSpirit-Italic-tosf-ly1.vf) tex(MintSpirit-Italic-tosf-ot1.tfm) tex(MintSpirit-Italic-tosf-t1--base.tfm) tex(MintSpirit-Italic-tosf-t1.tfm) tex(MintSpirit-Italic-tosf-t1.vf) tex(MintSpirit-Italic-tosf-ts1--base.tfm) tex(MintSpirit-Italic-tosf-ts1.tfm) tex(MintSpirit-Italic-tosf-ts1.vf) tex(MintSpirit-Regular-inf-ly1--base.tfm) tex(MintSpirit-Regular-inf-ly1.tfm) tex(MintSpirit-Regular-inf-ly1.vf) tex(MintSpirit-Regular-inf-ot1.tfm) tex(MintSpirit-Regular-inf-t1--base.tfm) tex(MintSpirit-Regular-inf-t1.tfm) tex(MintSpirit-Regular-inf-t1.vf) tex(MintSpirit-Regular-lf-ly1--base.tfm) tex(MintSpirit-Regular-lf-ly1.tfm) tex(MintSpirit-Regular-lf-ly1.vf) tex(MintSpirit-Regular-lf-ot1.tfm) tex(MintSpirit-Regular-lf-t1--base.tfm) tex(MintSpirit-Regular-lf-t1.tfm) tex(MintSpirit-Regular-lf-t1.vf) tex(MintSpirit-Regular-lf-ts1--base.tfm) tex(MintSpirit-Regular-lf-ts1.tfm) tex(MintSpirit-Regular-lf-ts1.vf) tex(MintSpirit-Regular-osf-ly1--base.tfm) tex(MintSpirit-Regular-osf-ly1.tfm) tex(MintSpirit-Regular-osf-ly1.vf) tex(MintSpirit-Regular-osf-ot1.tfm) tex(MintSpirit-Regular-osf-t1--base.tfm) tex(MintSpirit-Regular-osf-t1.tfm) tex(MintSpirit-Regular-osf-t1.vf) tex(MintSpirit-Regular-osf-ts1--base.tfm) tex(MintSpirit-Regular-osf-ts1.tfm) tex(MintSpirit-Regular-osf-ts1.vf) tex(MintSpirit-Regular-sup-ly1--base.tfm) tex(MintSpirit-Regular-sup-ly1.tfm) tex(MintSpirit-Regular-sup-ly1.vf) tex(MintSpirit-Regular-sup-ot1.tfm) tex(MintSpirit-Regular-sup-t1--base.tfm) tex(MintSpirit-Regular-sup-t1.tfm) tex(MintSpirit-Regular-sup-t1.vf) tex(MintSpirit-Regular-tlf-ly1--base.tfm) tex(MintSpirit-Regular-tlf-ly1.tfm) tex(MintSpirit-Regular-tlf-ly1.vf) tex(MintSpirit-Regular-tlf-ot1.tfm) tex(MintSpirit-Regular-tlf-t1--base.tfm) tex(MintSpirit-Regular-tlf-t1.tfm) tex(MintSpirit-Regular-tlf-t1.vf) tex(MintSpirit-Regular-tlf-ts1--base.tfm) tex(MintSpirit-Regular-tlf-ts1.tfm) tex(MintSpirit-Regular-tlf-ts1.vf) tex(MintSpirit-Regular-tosf-ly1--base.tfm) tex(MintSpirit-Regular-tosf-ly1.tfm) tex(MintSpirit-Regular-tosf-ly1.vf) tex(MintSpirit-Regular-tosf-ot1.tfm) tex(MintSpirit-Regular-tosf-t1--base.tfm) tex(MintSpirit-Regular-tosf-t1.tfm) tex(MintSpirit-Regular-tosf-t1.vf) tex(MintSpirit-Regular-tosf-ts1--base.tfm) tex(MintSpirit-Regular-tosf-ts1.tfm) tex(MintSpirit-Regular-tosf-ts1.vf) tex(MintSpiritNo2-Bold-inf-ly1--base.tfm) tex(MintSpiritNo2-Bold-inf-ly1.tfm) tex(MintSpiritNo2-Bold-inf-ly1.vf) tex(MintSpiritNo2-Bold-inf-ot1.tfm) tex(MintSpiritNo2-Bold-inf-t1--base.tfm) tex(MintSpiritNo2-Bold-inf-t1.tfm) tex(MintSpiritNo2-Bold-inf-t1.vf) tex(MintSpiritNo2-Bold-lf-ly1--base.tfm) tex(MintSpiritNo2-Bold-lf-ly1.tfm) tex(MintSpiritNo2-Bold-lf-ly1.vf) tex(MintSpiritNo2-Bold-lf-ot1.tfm) tex(MintSpiritNo2-Bold-lf-t1--base.tfm) tex(MintSpiritNo2-Bold-lf-t1.tfm) tex(MintSpiritNo2-Bold-lf-t1.vf) tex(MintSpiritNo2-Bold-lf-ts1--base.tfm) tex(MintSpiritNo2-Bold-lf-ts1.tfm) tex(MintSpiritNo2-Bold-lf-ts1.vf) tex(MintSpiritNo2-Bold-osf-ly1--base.tfm) tex(MintSpiritNo2-Bold-osf-ly1.tfm) tex(MintSpiritNo2-Bold-osf-ly1.vf) tex(MintSpiritNo2-Bold-osf-ot1.tfm) tex(MintSpiritNo2-Bold-osf-t1--base.tfm) tex(MintSpiritNo2-Bold-osf-t1.tfm) tex(MintSpiritNo2-Bold-osf-t1.vf) tex(MintSpiritNo2-Bold-osf-ts1--base.tfm) tex(MintSpiritNo2-Bold-osf-ts1.tfm) tex(MintSpiritNo2-Bold-osf-ts1.vf) tex(MintSpiritNo2-Bold-sup-ly1--base.tfm) tex(MintSpiritNo2-Bold-sup-ly1.tfm) tex(MintSpiritNo2-Bold-sup-ly1.vf) tex(MintSpiritNo2-Bold-sup-ot1.tfm) tex(MintSpiritNo2-Bold-sup-t1--base.tfm) tex(MintSpiritNo2-Bold-sup-t1.tfm) tex(MintSpiritNo2-Bold-sup-t1.vf) tex(MintSpiritNo2-Bold-tlf-ly1--base.tfm) tex(MintSpiritNo2-Bold-tlf-ly1.tfm) tex(MintSpiritNo2-Bold-tlf-ly1.vf) tex(MintSpiritNo2-Bold-tlf-ot1.tfm) tex(MintSpiritNo2-Bold-tlf-t1--base.tfm) tex(MintSpiritNo2-Bold-tlf-t1.tfm) tex(MintSpiritNo2-Bold-tlf-t1.vf) tex(MintSpiritNo2-Bold-tlf-ts1--base.tfm) tex(MintSpiritNo2-Bold-tlf-ts1.tfm) tex(MintSpiritNo2-Bold-tlf-ts1.vf) tex(MintSpiritNo2-Bold-tosf-ly1--base.tfm) tex(MintSpiritNo2-Bold-tosf-ly1.tfm) tex(MintSpiritNo2-Bold-tosf-ly1.vf) tex(MintSpiritNo2-Bold-tosf-ot1.tfm) tex(MintSpiritNo2-Bold-tosf-t1--base.tfm) tex(MintSpiritNo2-Bold-tosf-t1.tfm) tex(MintSpiritNo2-Bold-tosf-t1.vf) tex(MintSpiritNo2-Bold-tosf-ts1--base.tfm) tex(MintSpiritNo2-Bold-tosf-ts1.tfm) tex(MintSpiritNo2-Bold-tosf-ts1.vf) tex(MintSpiritNo2-BoldItalic-inf-ly1--base.tfm) tex(MintSpiritNo2-BoldItalic-inf-ly1.tfm) tex(MintSpiritNo2-BoldItalic-inf-ly1.vf) tex(MintSpiritNo2-BoldItalic-inf-ot1.tfm) tex(MintSpiritNo2-BoldItalic-inf-t1--base.tfm) tex(MintSpiritNo2-BoldItalic-inf-t1.tfm) tex(MintSpiritNo2-BoldItalic-inf-t1.vf) tex(MintSpiritNo2-BoldItalic-lf-ly1--base.tfm) tex(MintSpiritNo2-BoldItalic-lf-ly1.tfm) tex(MintSpiritNo2-BoldItalic-lf-ly1.vf) tex(MintSpiritNo2-BoldItalic-lf-ot1.tfm) tex(MintSpiritNo2-BoldItalic-lf-t1--base.tfm) tex(MintSpiritNo2-BoldItalic-lf-t1.tfm) tex(MintSpiritNo2-BoldItalic-lf-t1.vf) tex(MintSpiritNo2-BoldItalic-lf-ts1--base.tfm) tex(MintSpiritNo2-BoldItalic-lf-ts1.tfm) tex(MintSpiritNo2-BoldItalic-lf-ts1.vf) tex(MintSpiritNo2-BoldItalic-osf-ly1--base.tfm) tex(MintSpiritNo2-BoldItalic-osf-ly1.tfm) tex(MintSpiritNo2-BoldItalic-osf-ly1.vf) tex(MintSpiritNo2-BoldItalic-osf-ot1.tfm) tex(MintSpiritNo2-BoldItalic-osf-t1--base.tfm) tex(MintSpiritNo2-BoldItalic-osf-t1.tfm) tex(MintSpiritNo2-BoldItalic-osf-t1.vf) tex(MintSpiritNo2-BoldItalic-osf-ts1--base.tfm) tex(MintSpiritNo2-BoldItalic-osf-ts1.tfm) tex(MintSpiritNo2-BoldItalic-osf-ts1.vf) tex(MintSpiritNo2-BoldItalic-sup-ly1--base.tfm) tex(MintSpiritNo2-BoldItalic-sup-ly1.tfm) tex(MintSpiritNo2-BoldItalic-sup-ly1.vf) tex(MintSpiritNo2-BoldItalic-sup-ot1.tfm) tex(MintSpiritNo2-BoldItalic-sup-t1--base.tfm) tex(MintSpiritNo2-BoldItalic-sup-t1.tfm) tex(MintSpiritNo2-BoldItalic-sup-t1.vf) tex(MintSpiritNo2-BoldItalic-tlf-ly1--base.tfm) tex(MintSpiritNo2-BoldItalic-tlf-ly1.tfm) tex(MintSpiritNo2-BoldItalic-tlf-ly1.vf) tex(MintSpiritNo2-BoldItalic-tlf-ot1.tfm) tex(MintSpiritNo2-BoldItalic-tlf-t1--base.tfm) tex(MintSpiritNo2-BoldItalic-tlf-t1.tfm) tex(MintSpiritNo2-BoldItalic-tlf-t1.vf) tex(MintSpiritNo2-BoldItalic-tlf-ts1--base.tfm) tex(MintSpiritNo2-BoldItalic-tlf-ts1.tfm) tex(MintSpiritNo2-BoldItalic-tlf-ts1.vf) tex(MintSpiritNo2-BoldItalic-tosf-ly1--base.tfm) tex(MintSpiritNo2-BoldItalic-tosf-ly1.tfm) tex(MintSpiritNo2-BoldItalic-tosf-ly1.vf) tex(MintSpiritNo2-BoldItalic-tosf-ot1.tfm) tex(MintSpiritNo2-BoldItalic-tosf-t1--base.tfm) tex(MintSpiritNo2-BoldItalic-tosf-t1.tfm) tex(MintSpiritNo2-BoldItalic-tosf-t1.vf) tex(MintSpiritNo2-BoldItalic-tosf-ts1--base.tfm) tex(MintSpiritNo2-BoldItalic-tosf-ts1.tfm) tex(MintSpiritNo2-BoldItalic-tosf-ts1.vf) tex(MintSpiritNo2-Italic-inf-ly1--base.tfm) tex(MintSpiritNo2-Italic-inf-ly1.tfm) tex(MintSpiritNo2-Italic-inf-ly1.vf) tex(MintSpiritNo2-Italic-inf-ot1.tfm) tex(MintSpiritNo2-Italic-inf-t1--base.tfm) tex(MintSpiritNo2-Italic-inf-t1.tfm) tex(MintSpiritNo2-Italic-inf-t1.vf) tex(MintSpiritNo2-Italic-lf-ly1--base.tfm) tex(MintSpiritNo2-Italic-lf-ly1.tfm) tex(MintSpiritNo2-Italic-lf-ly1.vf) tex(MintSpiritNo2-Italic-lf-ot1.tfm) tex(MintSpiritNo2-Italic-lf-t1--base.tfm) tex(MintSpiritNo2-Italic-lf-t1.tfm) tex(MintSpiritNo2-Italic-lf-t1.vf) tex(MintSpiritNo2-Italic-lf-ts1--base.tfm) tex(MintSpiritNo2-Italic-lf-ts1.tfm) tex(MintSpiritNo2-Italic-lf-ts1.vf) tex(MintSpiritNo2-Italic-osf-ly1--base.tfm) tex(MintSpiritNo2-Italic-osf-ly1.tfm) tex(MintSpiritNo2-Italic-osf-ly1.vf) tex(MintSpiritNo2-Italic-osf-ot1.tfm) tex(MintSpiritNo2-Italic-osf-t1--base.tfm) tex(MintSpiritNo2-Italic-osf-t1.tfm) tex(MintSpiritNo2-Italic-osf-t1.vf) tex(MintSpiritNo2-Italic-osf-ts1--base.tfm) tex(MintSpiritNo2-Italic-osf-ts1.tfm) tex(MintSpiritNo2-Italic-osf-ts1.vf) tex(MintSpiritNo2-Italic-sup-ly1--base.tfm) tex(MintSpiritNo2-Italic-sup-ly1.tfm) tex(MintSpiritNo2-Italic-sup-ly1.vf) tex(MintSpiritNo2-Italic-sup-ot1.tfm) tex(MintSpiritNo2-Italic-sup-t1--base.tfm) tex(MintSpiritNo2-Italic-sup-t1.tfm) tex(MintSpiritNo2-Italic-sup-t1.vf) tex(MintSpiritNo2-Italic-tlf-ly1--base.tfm) tex(MintSpiritNo2-Italic-tlf-ly1.tfm) tex(MintSpiritNo2-Italic-tlf-ly1.vf) tex(MintSpiritNo2-Italic-tlf-ot1.tfm) tex(MintSpiritNo2-Italic-tlf-t1--base.tfm) tex(MintSpiritNo2-Italic-tlf-t1.tfm) tex(MintSpiritNo2-Italic-tlf-t1.vf) tex(MintSpiritNo2-Italic-tlf-ts1--base.tfm) tex(MintSpiritNo2-Italic-tlf-ts1.tfm) tex(MintSpiritNo2-Italic-tlf-ts1.vf) tex(MintSpiritNo2-Italic-tosf-ly1--base.tfm) tex(MintSpiritNo2-Italic-tosf-ly1.tfm) tex(MintSpiritNo2-Italic-tosf-ly1.vf) tex(MintSpiritNo2-Italic-tosf-ot1.tfm) tex(MintSpiritNo2-Italic-tosf-t1--base.tfm) tex(MintSpiritNo2-Italic-tosf-t1.tfm) tex(MintSpiritNo2-Italic-tosf-t1.vf) tex(MintSpiritNo2-Italic-tosf-ts1--base.tfm) tex(MintSpiritNo2-Italic-tosf-ts1.tfm) tex(MintSpiritNo2-Italic-tosf-ts1.vf) tex(MintSpiritNo2-Regular-inf-ly1--base.tfm) tex(MintSpiritNo2-Regular-inf-ly1.tfm) tex(MintSpiritNo2-Regular-inf-ly1.vf) tex(MintSpiritNo2-Regular-inf-ot1.tfm) tex(MintSpiritNo2-Regular-inf-t1--base.tfm) tex(MintSpiritNo2-Regular-inf-t1.tfm) tex(MintSpiritNo2-Regular-inf-t1.vf) tex(MintSpiritNo2-Regular-lf-ly1--base.tfm) tex(MintSpiritNo2-Regular-lf-ly1.tfm) tex(MintSpiritNo2-Regular-lf-ly1.vf) tex(MintSpiritNo2-Regular-lf-ot1.tfm) tex(MintSpiritNo2-Regular-lf-t1--base.tfm) tex(MintSpiritNo2-Regular-lf-t1.tfm) tex(MintSpiritNo2-Regular-lf-t1.vf) tex(MintSpiritNo2-Regular-lf-ts1--base.tfm) tex(MintSpiritNo2-Regular-lf-ts1.tfm) tex(MintSpiritNo2-Regular-lf-ts1.vf) tex(MintSpiritNo2-Regular-osf-ly1--base.tfm) tex(MintSpiritNo2-Regular-osf-ly1.tfm) tex(MintSpiritNo2-Regular-osf-ly1.vf) tex(MintSpiritNo2-Regular-osf-ot1.tfm) tex(MintSpiritNo2-Regular-osf-t1--base.tfm) tex(MintSpiritNo2-Regular-osf-t1.tfm) tex(MintSpiritNo2-Regular-osf-t1.vf) tex(MintSpiritNo2-Regular-osf-ts1--base.tfm) tex(MintSpiritNo2-Regular-osf-ts1.tfm) tex(MintSpiritNo2-Regular-osf-ts1.vf) tex(MintSpiritNo2-Regular-sup-ly1--base.tfm) tex(MintSpiritNo2-Regular-sup-ly1.tfm) tex(MintSpiritNo2-Regular-sup-ly1.vf) tex(MintSpiritNo2-Regular-sup-ot1.tfm) tex(MintSpiritNo2-Regular-sup-t1--base.tfm) tex(MintSpiritNo2-Regular-sup-t1.tfm) tex(MintSpiritNo2-Regular-sup-t1.vf) tex(MintSpiritNo2-Regular-tlf-ly1--base.tfm) tex(MintSpiritNo2-Regular-tlf-ly1.tfm) tex(MintSpiritNo2-Regular-tlf-ly1.vf) tex(MintSpiritNo2-Regular-tlf-ot1.tfm) tex(MintSpiritNo2-Regular-tlf-t1--base.tfm) tex(MintSpiritNo2-Regular-tlf-t1.tfm) tex(MintSpiritNo2-Regular-tlf-t1.vf) tex(MintSpiritNo2-Regular-tlf-ts1--base.tfm) tex(MintSpiritNo2-Regular-tlf-ts1.tfm) tex(MintSpiritNo2-Regular-tlf-ts1.vf) tex(MintSpiritNo2-Regular-tosf-ly1--base.tfm) tex(MintSpiritNo2-Regular-tosf-ly1.tfm) tex(MintSpiritNo2-Regular-tosf-ly1.vf) tex(MintSpiritNo2-Regular-tosf-ot1.tfm) tex(MintSpiritNo2-Regular-tosf-t1--base.tfm) tex(MintSpiritNo2-Regular-tosf-t1.tfm) tex(MintSpiritNo2-Regular-tosf-t1.vf) tex(MintSpiritNo2-Regular-tosf-ts1--base.tfm) tex(MintSpiritNo2-Regular-tosf-ts1.tfm) tex(MintSpiritNo2-Regular-tosf-ts1.vf) tex(OT1MintSpirit-Inf.fd) tex(OT1MintSpirit-LF.fd) tex(OT1MintSpirit-OsF.fd) tex(OT1MintSpirit-Sup.fd) tex(OT1MintSpirit-TLF.fd) tex(OT1MintSpirit-TOsF.fd) tex(OT1MintSpiritNoTwo-Inf.fd) tex(OT1MintSpiritNoTwo-LF.fd) tex(OT1MintSpiritNoTwo-OsF.fd) tex(OT1MintSpiritNoTwo-Sup.fd) tex(OT1MintSpiritNoTwo-TLF.fd) tex(OT1MintSpiritNoTwo-TOsF.fd) tex(T1MintSpirit-Inf.fd) tex(T1MintSpirit-LF.fd) tex(T1MintSpirit-OsF.fd) tex(T1MintSpirit-Sup.fd) tex(T1MintSpirit-TLF.fd) tex(T1MintSpirit-TOsF.fd) tex(T1MintSpiritNoTwo-Inf.fd) tex(T1MintSpiritNoTwo-LF.fd) tex(T1MintSpiritNoTwo-OsF.fd) tex(T1MintSpiritNoTwo-Sup.fd) tex(T1MintSpiritNoTwo-TLF.fd) tex(T1MintSpiritNoTwo-TOsF.fd) tex(TS1MintSpirit-LF.fd) tex(TS1MintSpirit-OsF.fd) tex(TS1MintSpirit-TLF.fd) tex(TS1MintSpirit-TOsF.fd) tex(TS1MintSpiritNoTwo-LF.fd) tex(TS1MintSpiritNoTwo-OsF.fd) tex(TS1MintSpiritNoTwo-TLF.fd) tex(TS1MintSpiritNoTwo-TOsF.fd) tex(mintspirit.map) tex(mintspirit.sty) tex(mintspirit2.sty) tex(mntsprt2_24uybq.enc) tex(mntsprt2_2dxuba.enc) tex(mntsprt2_3vy5j3.enc) tex(mntsprt2_5cazkt.enc) tex(mntsprt2_63vcua.enc) tex(mntsprt2_6x4rw3.enc) tex(mntsprt2_7ayy44.enc) tex(mntsprt2_7u5374.enc) tex(mntsprt2_amdskp.enc) tex(mntsprt2_biiinc.enc) tex(mntsprt2_bkoczj.enc) tex(mntsprt2_dnk3mn.enc) tex(mntsprt2_eex3ia.enc) tex(mntsprt2_eqihrw.enc) tex(mntsprt2_eqrkmo.enc) tex(mntsprt2_fizmng.enc) tex(mntsprt2_fm3wlu.enc) tex(mntsprt2_j4bodc.enc) tex(mntsprt2_k4fv75.enc) tex(mntsprt2_l3e5vj.enc) tex(mntsprt2_lm7mhw.enc) tex(mntsprt2_lwraz3.enc) tex(mntsprt2_me5dp6.enc) tex(mntsprt2_oe76kg.enc) tex(mntsprt2_ref42g.enc) tex(mntsprt2_s7rd6p.enc) tex(mntsprt2_taixll.enc) tex(mntsprt2_tmtdfz.enc) tex(mntsprt2_ywkmiw.enc) tex(mntsprt_2isll4.enc) tex(mntsprt_3sm7wd.enc) tex(mntsprt_3y5hmb.enc) tex(mntsprt_5lbatd.enc) tex(mntsprt_5yvi6n.enc) tex(mntsprt_675dmr.enc) tex(mntsprt_7enqs3.enc) tex(mntsprt_bjjcsi.enc) tex(mntsprt_f4utek.enc) tex(mntsprt_gcdgcc.enc) tex(mntsprt_gdx47l.enc) tex(mntsprt_girsvq.enc) tex(mntsprt_gr6qqq.enc) tex(mntsprt_imdxi4.enc) tex(mntsprt_lvhuc6.enc) tex(mntsprt_lzc2o4.enc) tex(mntsprt_oj7rfe.enc) tex(mntsprt_opresw.enc) tex(mntsprt_pulfbi.enc) tex(mntsprt_swumq4.enc) tex(mntsprt_v6lq4b.enc) tex(mntsprt_wk34ig.enc) tex(mntsprt_y4xqha.enc) tex(mntsprt_zt2pqo.enc) texlive-mintspirit"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(fontaxes.sty) tex(fontenc.sty) tex(fontspec.sty) tex(ifluatex.sty) tex(ifxetex.sty) tex(textcomp.sty) tex(updmap.cfg) tex(xkeyval.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-mintspirit-fonts texlive-scripts texlive-scripts-bin"

inherit rpm
