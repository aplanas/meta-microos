SUMMARY = "An expansion of Edward Tufte's ET-Bembo family"
DESCRIPTION = "Based on Daniel Benjamin Miller's XETBook, which expanded \
Tufte's ETBook, the family name for the Bembo-like font family \
he commissioned for his books, ETbb expands its features to \
include a full set of figure styles, small caps in all styles, \
superior letters and figures, inferior figures, a new capital \
Sharp S with small caps version, along with macros to activate \
these features in LaTeX. Both otf and pfb are provided."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.056svn61872"

RPM_NAME = "texlive-etbb-2023.201.1.056svn61872-52.1.noarch.rpm"
RPM_HASH = "f0dc028dcceafe22857b8acf9a51a9bf9cc038612fcf11b48949384cbc801bfd6d411885add8d2581f7a6816ca3f888ca08a6296aaf9f071f5431e6c4d0bb6c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ETbb-Bold-dnom-ly1--base.tfm) \
tex(ETbb-Bold-dnom-ly1.tfm) \
tex(ETbb-Bold-dnom-ly1.vf) \
tex(ETbb-Bold-dnom-ot1--base.tfm) \
tex(ETbb-Bold-dnom-ot1.tfm) \
tex(ETbb-Bold-dnom-ot1.vf) \
tex(ETbb-Bold-dnom-t1--base.tfm) \
tex(ETbb-Bold-dnom-t1.tfm) \
tex(ETbb-Bold-dnom-t1.vf) \
tex(ETbb-Bold-inf-ly1--base.tfm) \
tex(ETbb-Bold-inf-ly1.tfm) \
tex(ETbb-Bold-inf-ly1.vf) \
tex(ETbb-Bold-inf-ot1--base.tfm) \
tex(ETbb-Bold-inf-ot1.tfm) \
tex(ETbb-Bold-inf-ot1.vf) \
tex(ETbb-Bold-inf-t1--base.tfm) \
tex(ETbb-Bold-inf-t1.tfm) \
tex(ETbb-Bold-inf-t1.vf) \
tex(ETbb-Bold-lf-ly1--base.tfm) \
tex(ETbb-Bold-lf-ly1.tfm) \
tex(ETbb-Bold-lf-ly1.vf) \
tex(ETbb-Bold-lf-ot1--base.tfm) \
tex(ETbb-Bold-lf-ot1.tfm) \
tex(ETbb-Bold-lf-ot1.vf) \
tex(ETbb-Bold-lf-sc-ly1--base.tfm) \
tex(ETbb-Bold-lf-sc-ly1.tfm) \
tex(ETbb-Bold-lf-sc-ly1.vf) \
tex(ETbb-Bold-lf-sc-ot1--base.tfm) \
tex(ETbb-Bold-lf-sc-ot1.tfm) \
tex(ETbb-Bold-lf-sc-ot1.vf) \
tex(ETbb-Bold-lf-sc-t1--base.tfm) \
tex(ETbb-Bold-lf-sc-t1.tfm) \
tex(ETbb-Bold-lf-sc-t1.vf) \
tex(ETbb-Bold-lf-swash-ly1--base.tfm) \
tex(ETbb-Bold-lf-swash-ly1.tfm) \
tex(ETbb-Bold-lf-swash-ly1.vf) \
tex(ETbb-Bold-lf-swash-ot1--base.tfm) \
tex(ETbb-Bold-lf-swash-ot1.tfm) \
tex(ETbb-Bold-lf-swash-ot1.vf) \
tex(ETbb-Bold-lf-swash-t1--base.tfm) \
tex(ETbb-Bold-lf-swash-t1.tfm) \
tex(ETbb-Bold-lf-swash-t1.vf) \
tex(ETbb-Bold-lf-t1--base.tfm) \
tex(ETbb-Bold-lf-t1.tfm) \
tex(ETbb-Bold-lf-t1.vf) \
tex(ETbb-Bold-lf-ts1--base.tfm) \
tex(ETbb-Bold-lf-ts1.tfm) \
tex(ETbb-Bold-lf-ts1.vf) \
tex(ETbb-Bold-osf-ly1--base.tfm) \
tex(ETbb-Bold-osf-ly1.tfm) \
tex(ETbb-Bold-osf-ly1.vf) \
tex(ETbb-Bold-osf-ot1--base.tfm) \
tex(ETbb-Bold-osf-ot1.tfm) \
tex(ETbb-Bold-osf-ot1.vf) \
tex(ETbb-Bold-osf-sc-ly1--base.tfm) \
tex(ETbb-Bold-osf-sc-ly1.tfm) \
tex(ETbb-Bold-osf-sc-ly1.vf) \
tex(ETbb-Bold-osf-sc-ot1--base.tfm) \
tex(ETbb-Bold-osf-sc-ot1.tfm) \
tex(ETbb-Bold-osf-sc-ot1.vf) \
tex(ETbb-Bold-osf-sc-t1--base.tfm) \
tex(ETbb-Bold-osf-sc-t1.tfm) \
tex(ETbb-Bold-osf-sc-t1.vf) \
tex(ETbb-Bold-osf-swash-ly1--base.tfm) \
tex(ETbb-Bold-osf-swash-ly1.tfm) \
tex(ETbb-Bold-osf-swash-ly1.vf) \
tex(ETbb-Bold-osf-swash-ot1--base.tfm) \
tex(ETbb-Bold-osf-swash-ot1.tfm) \
tex(ETbb-Bold-osf-swash-ot1.vf) \
tex(ETbb-Bold-osf-swash-t1--base.tfm) \
tex(ETbb-Bold-osf-swash-t1.tfm) \
tex(ETbb-Bold-osf-swash-t1.vf) \
tex(ETbb-Bold-osf-t1--base.tfm) \
tex(ETbb-Bold-osf-t1.tfm) \
tex(ETbb-Bold-osf-t1.vf) \
tex(ETbb-Bold-osf-ts1--base.tfm) \
tex(ETbb-Bold-osf-ts1.tfm) \
tex(ETbb-Bold-osf-ts1.vf) \
tex(ETbb-Bold-sup-ly1--base.tfm) \
tex(ETbb-Bold-sup-ly1.tfm) \
tex(ETbb-Bold-sup-ly1.vf) \
tex(ETbb-Bold-sup-ot1--base.tfm) \
tex(ETbb-Bold-sup-ot1.tfm) \
tex(ETbb-Bold-sup-ot1.vf) \
tex(ETbb-Bold-sup-t1--base.tfm) \
tex(ETbb-Bold-sup-t1.tfm) \
tex(ETbb-Bold-sup-t1.vf) \
tex(ETbb-Bold-tlf-ly1--base.tfm) \
tex(ETbb-Bold-tlf-ly1.tfm) \
tex(ETbb-Bold-tlf-ly1.vf) \
tex(ETbb-Bold-tlf-ot1--base.tfm) \
tex(ETbb-Bold-tlf-ot1.tfm) \
tex(ETbb-Bold-tlf-ot1.vf) \
tex(ETbb-Bold-tlf-sc-ly1--base.tfm) \
tex(ETbb-Bold-tlf-sc-ly1.tfm) \
tex(ETbb-Bold-tlf-sc-ly1.vf) \
tex(ETbb-Bold-tlf-sc-ot1--base.tfm) \
tex(ETbb-Bold-tlf-sc-ot1.tfm) \
tex(ETbb-Bold-tlf-sc-ot1.vf) \
tex(ETbb-Bold-tlf-sc-t1--base.tfm) \
tex(ETbb-Bold-tlf-sc-t1.tfm) \
tex(ETbb-Bold-tlf-sc-t1.vf) \
tex(ETbb-Bold-tlf-swash-ly1--base.tfm) \
tex(ETbb-Bold-tlf-swash-ly1.tfm) \
tex(ETbb-Bold-tlf-swash-ly1.vf) \
tex(ETbb-Bold-tlf-swash-ot1--base.tfm) \
tex(ETbb-Bold-tlf-swash-ot1.tfm) \
tex(ETbb-Bold-tlf-swash-ot1.vf) \
tex(ETbb-Bold-tlf-swash-t1--base.tfm) \
tex(ETbb-Bold-tlf-swash-t1.tfm) \
tex(ETbb-Bold-tlf-swash-t1.vf) \
tex(ETbb-Bold-tlf-t1--base.tfm) \
tex(ETbb-Bold-tlf-t1.tfm) \
tex(ETbb-Bold-tlf-t1.vf) \
tex(ETbb-Bold-tlf-ts1--base.tfm) \
tex(ETbb-Bold-tlf-ts1.tfm) \
tex(ETbb-Bold-tlf-ts1.vf) \
tex(ETbb-Bold-tosf-ly1--base.tfm) \
tex(ETbb-Bold-tosf-ly1.tfm) \
tex(ETbb-Bold-tosf-ly1.vf) \
tex(ETbb-Bold-tosf-ot1--base.tfm) \
tex(ETbb-Bold-tosf-ot1.tfm) \
tex(ETbb-Bold-tosf-ot1.vf) \
tex(ETbb-Bold-tosf-sc-ly1--base.tfm) \
tex(ETbb-Bold-tosf-sc-ly1.tfm) \
tex(ETbb-Bold-tosf-sc-ly1.vf) \
tex(ETbb-Bold-tosf-sc-ot1--base.tfm) \
tex(ETbb-Bold-tosf-sc-ot1.tfm) \
tex(ETbb-Bold-tosf-sc-ot1.vf) \
tex(ETbb-Bold-tosf-sc-t1--base.tfm) \
tex(ETbb-Bold-tosf-sc-t1.tfm) \
tex(ETbb-Bold-tosf-sc-t1.vf) \
tex(ETbb-Bold-tosf-swash-ly1--base.tfm) \
tex(ETbb-Bold-tosf-swash-ly1.tfm) \
tex(ETbb-Bold-tosf-swash-ly1.vf) \
tex(ETbb-Bold-tosf-swash-ot1--base.tfm) \
tex(ETbb-Bold-tosf-swash-ot1.tfm) \
tex(ETbb-Bold-tosf-swash-ot1.vf) \
tex(ETbb-Bold-tosf-swash-t1--base.tfm) \
tex(ETbb-Bold-tosf-swash-t1.tfm) \
tex(ETbb-Bold-tosf-swash-t1.vf) \
tex(ETbb-Bold-tosf-t1--base.tfm) \
tex(ETbb-Bold-tosf-t1.tfm) \
tex(ETbb-Bold-tosf-t1.vf) \
tex(ETbb-Bold-tosf-ts1--base.tfm) \
tex(ETbb-Bold-tosf-ts1.tfm) \
tex(ETbb-Bold-tosf-ts1.vf) \
tex(ETbb-BoldItalic-dnom-ly1--base.tfm) \
tex(ETbb-BoldItalic-dnom-ly1.tfm) \
tex(ETbb-BoldItalic-dnom-ly1.vf) \
tex(ETbb-BoldItalic-dnom-ot1--base.tfm) \
tex(ETbb-BoldItalic-dnom-ot1.tfm) \
tex(ETbb-BoldItalic-dnom-ot1.vf) \
tex(ETbb-BoldItalic-dnom-t1--base.tfm) \
tex(ETbb-BoldItalic-dnom-t1.tfm) \
tex(ETbb-BoldItalic-dnom-t1.vf) \
tex(ETbb-BoldItalic-inf-ly1--base.tfm) \
tex(ETbb-BoldItalic-inf-ly1.tfm) \
tex(ETbb-BoldItalic-inf-ly1.vf) \
tex(ETbb-BoldItalic-inf-ot1--base.tfm) \
tex(ETbb-BoldItalic-inf-ot1.tfm) \
tex(ETbb-BoldItalic-inf-ot1.vf) \
tex(ETbb-BoldItalic-inf-t1--base.tfm) \
tex(ETbb-BoldItalic-inf-t1.tfm) \
tex(ETbb-BoldItalic-inf-t1.vf) \
tex(ETbb-BoldItalic-lf-ly1--base.tfm) \
tex(ETbb-BoldItalic-lf-ly1.tfm) \
tex(ETbb-BoldItalic-lf-ly1.vf) \
tex(ETbb-BoldItalic-lf-ot1--base.tfm) \
tex(ETbb-BoldItalic-lf-ot1.tfm) \
tex(ETbb-BoldItalic-lf-ot1.vf) \
tex(ETbb-BoldItalic-lf-sc-ly1--base.tfm) \
tex(ETbb-BoldItalic-lf-sc-ly1.tfm) \
tex(ETbb-BoldItalic-lf-sc-ly1.vf) \
tex(ETbb-BoldItalic-lf-sc-ot1--base.tfm) \
tex(ETbb-BoldItalic-lf-sc-ot1.tfm) \
tex(ETbb-BoldItalic-lf-sc-ot1.vf) \
tex(ETbb-BoldItalic-lf-sc-t1--base.tfm) \
tex(ETbb-BoldItalic-lf-sc-t1.tfm) \
tex(ETbb-BoldItalic-lf-sc-t1.vf) \
tex(ETbb-BoldItalic-lf-swash-ly1--base.tfm) \
tex(ETbb-BoldItalic-lf-swash-ly1.tfm) \
tex(ETbb-BoldItalic-lf-swash-ly1.vf) \
tex(ETbb-BoldItalic-lf-swash-ot1--base.tfm) \
tex(ETbb-BoldItalic-lf-swash-ot1.tfm) \
tex(ETbb-BoldItalic-lf-swash-ot1.vf) \
tex(ETbb-BoldItalic-lf-swash-t1--base.tfm) \
tex(ETbb-BoldItalic-lf-swash-t1.tfm) \
tex(ETbb-BoldItalic-lf-swash-t1.vf) \
tex(ETbb-BoldItalic-lf-t1--base.tfm) \
tex(ETbb-BoldItalic-lf-t1.tfm) \
tex(ETbb-BoldItalic-lf-t1.vf) \
tex(ETbb-BoldItalic-lf-ts1--base.tfm) \
tex(ETbb-BoldItalic-lf-ts1.tfm) \
tex(ETbb-BoldItalic-lf-ts1.vf) \
tex(ETbb-BoldItalic-osf-ly1--base.tfm) \
tex(ETbb-BoldItalic-osf-ly1.tfm) \
tex(ETbb-BoldItalic-osf-ly1.vf) \
tex(ETbb-BoldItalic-osf-ot1--base.tfm) \
tex(ETbb-BoldItalic-osf-ot1.tfm) \
tex(ETbb-BoldItalic-osf-ot1.vf) \
tex(ETbb-BoldItalic-osf-sc-ly1--base.tfm) \
tex(ETbb-BoldItalic-osf-sc-ly1.tfm) \
tex(ETbb-BoldItalic-osf-sc-ly1.vf) \
tex(ETbb-BoldItalic-osf-sc-ot1--base.tfm) \
tex(ETbb-BoldItalic-osf-sc-ot1.tfm) \
tex(ETbb-BoldItalic-osf-sc-ot1.vf) \
tex(ETbb-BoldItalic-osf-sc-t1--base.tfm) \
tex(ETbb-BoldItalic-osf-sc-t1.tfm) \
tex(ETbb-BoldItalic-osf-sc-t1.vf) \
tex(ETbb-BoldItalic-osf-swash-ly1--base.tfm) \
tex(ETbb-BoldItalic-osf-swash-ly1.tfm) \
tex(ETbb-BoldItalic-osf-swash-ly1.vf) \
tex(ETbb-BoldItalic-osf-swash-ot1--base.tfm) \
tex(ETbb-BoldItalic-osf-swash-ot1.tfm) \
tex(ETbb-BoldItalic-osf-swash-ot1.vf) \
tex(ETbb-BoldItalic-osf-swash-t1--base.tfm) \
tex(ETbb-BoldItalic-osf-swash-t1.tfm) \
tex(ETbb-BoldItalic-osf-swash-t1.vf) \
tex(ETbb-BoldItalic-osf-t1--base.tfm) \
tex(ETbb-BoldItalic-osf-t1.tfm) \
tex(ETbb-BoldItalic-osf-t1.vf) \
tex(ETbb-BoldItalic-osf-ts1--base.tfm) \
tex(ETbb-BoldItalic-osf-ts1.tfm) \
tex(ETbb-BoldItalic-osf-ts1.vf) \
tex(ETbb-BoldItalic-sup-ly1--base.tfm) \
tex(ETbb-BoldItalic-sup-ly1.tfm) \
tex(ETbb-BoldItalic-sup-ly1.vf) \
tex(ETbb-BoldItalic-sup-ot1--base.tfm) \
tex(ETbb-BoldItalic-sup-ot1.tfm) \
tex(ETbb-BoldItalic-sup-ot1.vf) \
tex(ETbb-BoldItalic-sup-t1--base.tfm) \
tex(ETbb-BoldItalic-sup-t1.tfm) \
tex(ETbb-BoldItalic-sup-t1.vf) \
tex(ETbb-BoldItalic-tlf-ly1--base.tfm) \
tex(ETbb-BoldItalic-tlf-ly1.tfm) \
tex(ETbb-BoldItalic-tlf-ly1.vf) \
tex(ETbb-BoldItalic-tlf-ot1--base.tfm) \
tex(ETbb-BoldItalic-tlf-ot1.tfm) \
tex(ETbb-BoldItalic-tlf-ot1.vf) \
tex(ETbb-BoldItalic-tlf-sc-ly1--base.tfm) \
tex(ETbb-BoldItalic-tlf-sc-ly1.tfm) \
tex(ETbb-BoldItalic-tlf-sc-ly1.vf) \
tex(ETbb-BoldItalic-tlf-sc-ot1--base.tfm) \
tex(ETbb-BoldItalic-tlf-sc-ot1.tfm) \
tex(ETbb-BoldItalic-tlf-sc-ot1.vf) \
tex(ETbb-BoldItalic-tlf-sc-t1--base.tfm) \
tex(ETbb-BoldItalic-tlf-sc-t1.tfm) \
tex(ETbb-BoldItalic-tlf-sc-t1.vf) \
tex(ETbb-BoldItalic-tlf-swash-ly1--base.tfm) \
tex(ETbb-BoldItalic-tlf-swash-ly1.tfm) \
tex(ETbb-BoldItalic-tlf-swash-ly1.vf) \
tex(ETbb-BoldItalic-tlf-swash-ot1--base.tfm) \
tex(ETbb-BoldItalic-tlf-swash-ot1.tfm) \
tex(ETbb-BoldItalic-tlf-swash-ot1.vf) \
tex(ETbb-BoldItalic-tlf-swash-t1--base.tfm) \
tex(ETbb-BoldItalic-tlf-swash-t1.tfm) \
tex(ETbb-BoldItalic-tlf-swash-t1.vf) \
tex(ETbb-BoldItalic-tlf-t1--base.tfm) \
tex(ETbb-BoldItalic-tlf-t1.tfm) \
tex(ETbb-BoldItalic-tlf-t1.vf) \
tex(ETbb-BoldItalic-tlf-ts1--base.tfm) \
tex(ETbb-BoldItalic-tlf-ts1.tfm) \
tex(ETbb-BoldItalic-tlf-ts1.vf) \
tex(ETbb-BoldItalic-tosf-ly1--base.tfm) \
tex(ETbb-BoldItalic-tosf-ly1.tfm) \
tex(ETbb-BoldItalic-tosf-ly1.vf) \
tex(ETbb-BoldItalic-tosf-ot1--base.tfm) \
tex(ETbb-BoldItalic-tosf-ot1.tfm) \
tex(ETbb-BoldItalic-tosf-ot1.vf) \
tex(ETbb-BoldItalic-tosf-sc-ly1--base.tfm) \
tex(ETbb-BoldItalic-tosf-sc-ly1.tfm) \
tex(ETbb-BoldItalic-tosf-sc-ly1.vf) \
tex(ETbb-BoldItalic-tosf-sc-ot1--base.tfm) \
tex(ETbb-BoldItalic-tosf-sc-ot1.tfm) \
tex(ETbb-BoldItalic-tosf-sc-ot1.vf) \
tex(ETbb-BoldItalic-tosf-sc-t1--base.tfm) \
tex(ETbb-BoldItalic-tosf-sc-t1.tfm) \
tex(ETbb-BoldItalic-tosf-sc-t1.vf) \
tex(ETbb-BoldItalic-tosf-swash-ly1--base.tfm) \
tex(ETbb-BoldItalic-tosf-swash-ly1.tfm) \
tex(ETbb-BoldItalic-tosf-swash-ly1.vf) \
tex(ETbb-BoldItalic-tosf-swash-ot1--base.tfm) \
tex(ETbb-BoldItalic-tosf-swash-ot1.tfm) \
tex(ETbb-BoldItalic-tosf-swash-ot1.vf) \
tex(ETbb-BoldItalic-tosf-swash-t1--base.tfm) \
tex(ETbb-BoldItalic-tosf-swash-t1.tfm) \
tex(ETbb-BoldItalic-tosf-swash-t1.vf) \
tex(ETbb-BoldItalic-tosf-t1--base.tfm) \
tex(ETbb-BoldItalic-tosf-t1.tfm) \
tex(ETbb-BoldItalic-tosf-t1.vf) \
tex(ETbb-BoldItalic-tosf-ts1--base.tfm) \
tex(ETbb-BoldItalic-tosf-ts1.tfm) \
tex(ETbb-BoldItalic-tosf-ts1.vf) \
tex(ETbb-Italic-dnom-ly1--base.tfm) \
tex(ETbb-Italic-dnom-ly1.tfm) \
tex(ETbb-Italic-dnom-ly1.vf) \
tex(ETbb-Italic-dnom-ot1--base.tfm) \
tex(ETbb-Italic-dnom-ot1.tfm) \
tex(ETbb-Italic-dnom-ot1.vf) \
tex(ETbb-Italic-dnom-t1--base.tfm) \
tex(ETbb-Italic-dnom-t1.tfm) \
tex(ETbb-Italic-dnom-t1.vf) \
tex(ETbb-Italic-inf-ly1--base.tfm) \
tex(ETbb-Italic-inf-ly1.tfm) \
tex(ETbb-Italic-inf-ly1.vf) \
tex(ETbb-Italic-inf-ot1--base.tfm) \
tex(ETbb-Italic-inf-ot1.tfm) \
tex(ETbb-Italic-inf-ot1.vf) \
tex(ETbb-Italic-inf-t1--base.tfm) \
tex(ETbb-Italic-inf-t1.tfm) \
tex(ETbb-Italic-inf-t1.vf) \
tex(ETbb-Italic-lf-ly1--base.tfm) \
tex(ETbb-Italic-lf-ly1.tfm) \
tex(ETbb-Italic-lf-ly1.vf) \
tex(ETbb-Italic-lf-ot1--base.tfm) \
tex(ETbb-Italic-lf-ot1.tfm) \
tex(ETbb-Italic-lf-ot1.vf) \
tex(ETbb-Italic-lf-sc-ly1--base.tfm) \
tex(ETbb-Italic-lf-sc-ly1.tfm) \
tex(ETbb-Italic-lf-sc-ly1.vf) \
tex(ETbb-Italic-lf-sc-ot1--base.tfm) \
tex(ETbb-Italic-lf-sc-ot1.tfm) \
tex(ETbb-Italic-lf-sc-ot1.vf) \
tex(ETbb-Italic-lf-sc-t1--base.tfm) \
tex(ETbb-Italic-lf-sc-t1.tfm) \
tex(ETbb-Italic-lf-sc-t1.vf) \
tex(ETbb-Italic-lf-swash-ly1--base.tfm) \
tex(ETbb-Italic-lf-swash-ly1.tfm) \
tex(ETbb-Italic-lf-swash-ly1.vf) \
tex(ETbb-Italic-lf-swash-ot1--base.tfm) \
tex(ETbb-Italic-lf-swash-ot1.tfm) \
tex(ETbb-Italic-lf-swash-ot1.vf) \
tex(ETbb-Italic-lf-swash-t1--base.tfm) \
tex(ETbb-Italic-lf-swash-t1.tfm) \
tex(ETbb-Italic-lf-swash-t1.vf) \
tex(ETbb-Italic-lf-t1--base.tfm) \
tex(ETbb-Italic-lf-t1.tfm) \
tex(ETbb-Italic-lf-t1.vf) \
tex(ETbb-Italic-lf-ts1--base.tfm) \
tex(ETbb-Italic-lf-ts1.tfm) \
tex(ETbb-Italic-lf-ts1.vf) \
tex(ETbb-Italic-osf-ly1--base.tfm) \
tex(ETbb-Italic-osf-ly1.tfm) \
tex(ETbb-Italic-osf-ly1.vf) \
tex(ETbb-Italic-osf-ot1--base.tfm) \
tex(ETbb-Italic-osf-ot1.tfm) \
tex(ETbb-Italic-osf-ot1.vf) \
tex(ETbb-Italic-osf-sc-ly1--base.tfm) \
tex(ETbb-Italic-osf-sc-ly1.tfm) \
tex(ETbb-Italic-osf-sc-ly1.vf) \
tex(ETbb-Italic-osf-sc-ot1--base.tfm) \
tex(ETbb-Italic-osf-sc-ot1.tfm) \
tex(ETbb-Italic-osf-sc-ot1.vf) \
tex(ETbb-Italic-osf-sc-t1--base.tfm) \
tex(ETbb-Italic-osf-sc-t1.tfm) \
tex(ETbb-Italic-osf-sc-t1.vf) \
tex(ETbb-Italic-osf-swash-ly1--base.tfm) \
tex(ETbb-Italic-osf-swash-ly1.tfm) \
tex(ETbb-Italic-osf-swash-ly1.vf) \
tex(ETbb-Italic-osf-swash-ot1--base.tfm) \
tex(ETbb-Italic-osf-swash-ot1.tfm) \
tex(ETbb-Italic-osf-swash-ot1.vf) \
tex(ETbb-Italic-osf-swash-t1--base.tfm) \
tex(ETbb-Italic-osf-swash-t1.tfm) \
tex(ETbb-Italic-osf-swash-t1.vf) \
tex(ETbb-Italic-osf-t1--base.tfm) \
tex(ETbb-Italic-osf-t1.tfm) \
tex(ETbb-Italic-osf-t1.vf) \
tex(ETbb-Italic-osf-ts1--base.tfm) \
tex(ETbb-Italic-osf-ts1.tfm) \
tex(ETbb-Italic-osf-ts1.vf) \
tex(ETbb-Italic-sup-ly1--base.tfm) \
tex(ETbb-Italic-sup-ly1.tfm) \
tex(ETbb-Italic-sup-ly1.vf) \
tex(ETbb-Italic-sup-ot1--base.tfm) \
tex(ETbb-Italic-sup-ot1.tfm) \
tex(ETbb-Italic-sup-ot1.vf) \
tex(ETbb-Italic-sup-t1--base.tfm) \
tex(ETbb-Italic-sup-t1.tfm) \
tex(ETbb-Italic-sup-t1.vf) \
tex(ETbb-Italic-tlf-ly1--base.tfm) \
tex(ETbb-Italic-tlf-ly1.tfm) \
tex(ETbb-Italic-tlf-ly1.vf) \
tex(ETbb-Italic-tlf-ot1--base.tfm) \
tex(ETbb-Italic-tlf-ot1.tfm) \
tex(ETbb-Italic-tlf-ot1.vf) \
tex(ETbb-Italic-tlf-sc-ly1--base.tfm) \
tex(ETbb-Italic-tlf-sc-ly1.tfm) \
tex(ETbb-Italic-tlf-sc-ly1.vf) \
tex(ETbb-Italic-tlf-sc-ot1--base.tfm) \
tex(ETbb-Italic-tlf-sc-ot1.tfm) \
tex(ETbb-Italic-tlf-sc-ot1.vf) \
tex(ETbb-Italic-tlf-sc-t1--base.tfm) \
tex(ETbb-Italic-tlf-sc-t1.tfm) \
tex(ETbb-Italic-tlf-sc-t1.vf) \
tex(ETbb-Italic-tlf-swash-ly1--base.tfm) \
tex(ETbb-Italic-tlf-swash-ly1.tfm) \
tex(ETbb-Italic-tlf-swash-ly1.vf) \
tex(ETbb-Italic-tlf-swash-ot1--base.tfm) \
tex(ETbb-Italic-tlf-swash-ot1.tfm) \
tex(ETbb-Italic-tlf-swash-ot1.vf) \
tex(ETbb-Italic-tlf-swash-t1--base.tfm) \
tex(ETbb-Italic-tlf-swash-t1.tfm) \
tex(ETbb-Italic-tlf-swash-t1.vf) \
tex(ETbb-Italic-tlf-t1--base.tfm) \
tex(ETbb-Italic-tlf-t1.tfm) \
tex(ETbb-Italic-tlf-t1.vf) \
tex(ETbb-Italic-tlf-ts1--base.tfm) \
tex(ETbb-Italic-tlf-ts1.tfm) \
tex(ETbb-Italic-tlf-ts1.vf) \
tex(ETbb-Italic-tosf-ly1--base.tfm) \
tex(ETbb-Italic-tosf-ly1.tfm) \
tex(ETbb-Italic-tosf-ly1.vf) \
tex(ETbb-Italic-tosf-ot1--base.tfm) \
tex(ETbb-Italic-tosf-ot1.tfm) \
tex(ETbb-Italic-tosf-ot1.vf) \
tex(ETbb-Italic-tosf-sc-ly1--base.tfm) \
tex(ETbb-Italic-tosf-sc-ly1.tfm) \
tex(ETbb-Italic-tosf-sc-ly1.vf) \
tex(ETbb-Italic-tosf-sc-ot1--base.tfm) \
tex(ETbb-Italic-tosf-sc-ot1.tfm) \
tex(ETbb-Italic-tosf-sc-ot1.vf) \
tex(ETbb-Italic-tosf-sc-t1--base.tfm) \
tex(ETbb-Italic-tosf-sc-t1.tfm) \
tex(ETbb-Italic-tosf-sc-t1.vf) \
tex(ETbb-Italic-tosf-swash-ly1--base.tfm) \
tex(ETbb-Italic-tosf-swash-ly1.tfm) \
tex(ETbb-Italic-tosf-swash-ly1.vf) \
tex(ETbb-Italic-tosf-swash-ot1--base.tfm) \
tex(ETbb-Italic-tosf-swash-ot1.tfm) \
tex(ETbb-Italic-tosf-swash-ot1.vf) \
tex(ETbb-Italic-tosf-swash-t1--base.tfm) \
tex(ETbb-Italic-tosf-swash-t1.tfm) \
tex(ETbb-Italic-tosf-swash-t1.vf) \
tex(ETbb-Italic-tosf-t1--base.tfm) \
tex(ETbb-Italic-tosf-t1.tfm) \
tex(ETbb-Italic-tosf-t1.vf) \
tex(ETbb-Italic-tosf-ts1--base.tfm) \
tex(ETbb-Italic-tosf-ts1.tfm) \
tex(ETbb-Italic-tosf-ts1.vf) \
tex(ETbb-Regular-dnom-ly1--base.tfm) \
tex(ETbb-Regular-dnom-ly1.tfm) \
tex(ETbb-Regular-dnom-ly1.vf) \
tex(ETbb-Regular-dnom-ot1.tfm) \
tex(ETbb-Regular-dnom-t1--base.tfm) \
tex(ETbb-Regular-dnom-t1.tfm) \
tex(ETbb-Regular-dnom-t1.vf) \
tex(ETbb-Regular-inf-ly1--base.tfm) \
tex(ETbb-Regular-inf-ly1.tfm) \
tex(ETbb-Regular-inf-ly1.vf) \
tex(ETbb-Regular-inf-ot1.tfm) \
tex(ETbb-Regular-inf-t1--base.tfm) \
tex(ETbb-Regular-inf-t1.tfm) \
tex(ETbb-Regular-inf-t1.vf) \
tex(ETbb-Regular-lf-ly1--base.tfm) \
tex(ETbb-Regular-lf-ly1.tfm) \
tex(ETbb-Regular-lf-ly1.vf) \
tex(ETbb-Regular-lf-ot1.tfm) \
tex(ETbb-Regular-lf-sc-ly1--base.tfm) \
tex(ETbb-Regular-lf-sc-ly1.tfm) \
tex(ETbb-Regular-lf-sc-ly1.vf) \
tex(ETbb-Regular-lf-sc-ot1--base.tfm) \
tex(ETbb-Regular-lf-sc-ot1.tfm) \
tex(ETbb-Regular-lf-sc-ot1.vf) \
tex(ETbb-Regular-lf-sc-t1--base.tfm) \
tex(ETbb-Regular-lf-sc-t1.tfm) \
tex(ETbb-Regular-lf-sc-t1.vf) \
tex(ETbb-Regular-lf-swash-ly1--base.tfm) \
tex(ETbb-Regular-lf-swash-ly1.tfm) \
tex(ETbb-Regular-lf-swash-ly1.vf) \
tex(ETbb-Regular-lf-swash-ot1.tfm) \
tex(ETbb-Regular-lf-swash-t1--base.tfm) \
tex(ETbb-Regular-lf-swash-t1.tfm) \
tex(ETbb-Regular-lf-swash-t1.vf) \
tex(ETbb-Regular-lf-t1--base.tfm) \
tex(ETbb-Regular-lf-t1.tfm) \
tex(ETbb-Regular-lf-t1.vf) \
tex(ETbb-Regular-lf-ts1--base.tfm) \
tex(ETbb-Regular-lf-ts1.tfm) \
tex(ETbb-Regular-lf-ts1.vf) \
tex(ETbb-Regular-osf-ly1--base.tfm) \
tex(ETbb-Regular-osf-ly1.tfm) \
tex(ETbb-Regular-osf-ly1.vf) \
tex(ETbb-Regular-osf-ot1.tfm) \
tex(ETbb-Regular-osf-sc-ly1--base.tfm) \
tex(ETbb-Regular-osf-sc-ly1.tfm) \
tex(ETbb-Regular-osf-sc-ly1.vf) \
tex(ETbb-Regular-osf-sc-ot1--base.tfm) \
tex(ETbb-Regular-osf-sc-ot1.tfm) \
tex(ETbb-Regular-osf-sc-ot1.vf) \
tex(ETbb-Regular-osf-sc-t1--base.tfm) \
tex(ETbb-Regular-osf-sc-t1.tfm) \
tex(ETbb-Regular-osf-sc-t1.vf) \
tex(ETbb-Regular-osf-swash-ly1--base.tfm) \
tex(ETbb-Regular-osf-swash-ly1.tfm) \
tex(ETbb-Regular-osf-swash-ly1.vf) \
tex(ETbb-Regular-osf-swash-ot1.tfm) \
tex(ETbb-Regular-osf-swash-t1--base.tfm) \
tex(ETbb-Regular-osf-swash-t1.tfm) \
tex(ETbb-Regular-osf-swash-t1.vf) \
tex(ETbb-Regular-osf-t1--base.tfm) \
tex(ETbb-Regular-osf-t1.tfm) \
tex(ETbb-Regular-osf-t1.vf) \
tex(ETbb-Regular-osf-ts1--base.tfm) \
tex(ETbb-Regular-osf-ts1.tfm) \
tex(ETbb-Regular-osf-ts1.vf) \
tex(ETbb-Regular-sup-ly1--base.tfm) \
tex(ETbb-Regular-sup-ly1.tfm) \
tex(ETbb-Regular-sup-ly1.vf) \
tex(ETbb-Regular-sup-ot1.tfm) \
tex(ETbb-Regular-sup-t1--base.tfm) \
tex(ETbb-Regular-sup-t1.tfm) \
tex(ETbb-Regular-sup-t1.vf) \
tex(ETbb-Regular-tlf-ly1--base.tfm) \
tex(ETbb-Regular-tlf-ly1.tfm) \
tex(ETbb-Regular-tlf-ly1.vf) \
tex(ETbb-Regular-tlf-ot1.tfm) \
tex(ETbb-Regular-tlf-sc-ly1--base.tfm) \
tex(ETbb-Regular-tlf-sc-ly1.tfm) \
tex(ETbb-Regular-tlf-sc-ly1.vf) \
tex(ETbb-Regular-tlf-sc-ot1--base.tfm) \
tex(ETbb-Regular-tlf-sc-ot1.tfm) \
tex(ETbb-Regular-tlf-sc-ot1.vf) \
tex(ETbb-Regular-tlf-sc-t1--base.tfm) \
tex(ETbb-Regular-tlf-sc-t1.tfm) \
tex(ETbb-Regular-tlf-sc-t1.vf) \
tex(ETbb-Regular-tlf-swash-ly1--base.tfm) \
tex(ETbb-Regular-tlf-swash-ly1.tfm) \
tex(ETbb-Regular-tlf-swash-ly1.vf) \
tex(ETbb-Regular-tlf-swash-ot1.tfm) \
tex(ETbb-Regular-tlf-swash-t1--base.tfm) \
tex(ETbb-Regular-tlf-swash-t1.tfm) \
tex(ETbb-Regular-tlf-swash-t1.vf) \
tex(ETbb-Regular-tlf-t1--base.tfm) \
tex(ETbb-Regular-tlf-t1.tfm) \
tex(ETbb-Regular-tlf-t1.vf) \
tex(ETbb-Regular-tlf-ts1--base.tfm) \
tex(ETbb-Regular-tlf-ts1.tfm) \
tex(ETbb-Regular-tlf-ts1.vf) \
tex(ETbb-Regular-tosf-ly1--base.tfm) \
tex(ETbb-Regular-tosf-ly1.tfm) \
tex(ETbb-Regular-tosf-ly1.vf) \
tex(ETbb-Regular-tosf-ot1.tfm) \
tex(ETbb-Regular-tosf-sc-ly1--base.tfm) \
tex(ETbb-Regular-tosf-sc-ly1.tfm) \
tex(ETbb-Regular-tosf-sc-ly1.vf) \
tex(ETbb-Regular-tosf-sc-ot1--base.tfm) \
tex(ETbb-Regular-tosf-sc-ot1.tfm) \
tex(ETbb-Regular-tosf-sc-ot1.vf) \
tex(ETbb-Regular-tosf-sc-t1--base.tfm) \
tex(ETbb-Regular-tosf-sc-t1.tfm) \
tex(ETbb-Regular-tosf-sc-t1.vf) \
tex(ETbb-Regular-tosf-swash-ly1--base.tfm) \
tex(ETbb-Regular-tosf-swash-ly1.tfm) \
tex(ETbb-Regular-tosf-swash-ly1.vf) \
tex(ETbb-Regular-tosf-swash-ot1.tfm) \
tex(ETbb-Regular-tosf-swash-t1--base.tfm) \
tex(ETbb-Regular-tosf-swash-t1.tfm) \
tex(ETbb-Regular-tosf-swash-t1.vf) \
tex(ETbb-Regular-tosf-t1--base.tfm) \
tex(ETbb-Regular-tosf-t1.tfm) \
tex(ETbb-Regular-tosf-t1.vf) \
tex(ETbb-Regular-tosf-ts1--base.tfm) \
tex(ETbb-Regular-tosf-ts1.tfm) \
tex(ETbb-Regular-tosf-ts1.vf) \
tex(ETbb.map) \
tex(ETbb.sty) \
tex(Etbb1-Bold-lf-sc-t1--base.tfm) \
tex(Etbb1-Bold-lf-sc-t1.tfm) \
tex(Etbb1-Bold-lf-sc-t1.vf) \
tex(Etbb1-Bold-lf-swash-t1--base.tfm) \
tex(Etbb1-Bold-lf-swash-t1.tfm) \
tex(Etbb1-Bold-lf-swash-t1.vf) \
tex(Etbb1-Bold-lf-t1--base.tfm) \
tex(Etbb1-Bold-lf-t1.tfm) \
tex(Etbb1-Bold-lf-t1.vf) \
tex(Etbb1-Bold-osf-sc-t1--base.tfm) \
tex(Etbb1-Bold-osf-sc-t1.tfm) \
tex(Etbb1-Bold-osf-sc-t1.vf) \
tex(Etbb1-Bold-osf-swash-t1--base.tfm) \
tex(Etbb1-Bold-osf-swash-t1.tfm) \
tex(Etbb1-Bold-osf-swash-t1.vf) \
tex(Etbb1-Bold-osf-t1--base.tfm) \
tex(Etbb1-Bold-osf-t1.tfm) \
tex(Etbb1-Bold-osf-t1.vf) \
tex(Etbb1-Bold-tlf-sc-t1--base.tfm) \
tex(Etbb1-Bold-tlf-sc-t1.tfm) \
tex(Etbb1-Bold-tlf-sc-t1.vf) \
tex(Etbb1-Bold-tlf-swash-t1--base.tfm) \
tex(Etbb1-Bold-tlf-swash-t1.tfm) \
tex(Etbb1-Bold-tlf-swash-t1.vf) \
tex(Etbb1-Bold-tlf-t1--base.tfm) \
tex(Etbb1-Bold-tlf-t1.tfm) \
tex(Etbb1-Bold-tlf-t1.vf) \
tex(Etbb1-Bold-tosf-sc-t1--base.tfm) \
tex(Etbb1-Bold-tosf-sc-t1.tfm) \
tex(Etbb1-Bold-tosf-sc-t1.vf) \
tex(Etbb1-Bold-tosf-swash-t1--base.tfm) \
tex(Etbb1-Bold-tosf-swash-t1.tfm) \
tex(Etbb1-Bold-tosf-swash-t1.vf) \
tex(Etbb1-Bold-tosf-t1--base.tfm) \
tex(Etbb1-Bold-tosf-t1.tfm) \
tex(Etbb1-Bold-tosf-t1.vf) \
tex(Etbb1-BoldItalic-lf-sc-t1--base.tfm) \
tex(Etbb1-BoldItalic-lf-sc-t1.tfm) \
tex(Etbb1-BoldItalic-lf-sc-t1.vf) \
tex(Etbb1-BoldItalic-lf-swash-t1--base.tfm) \
tex(Etbb1-BoldItalic-lf-swash-t1.tfm) \
tex(Etbb1-BoldItalic-lf-swash-t1.vf) \
tex(Etbb1-BoldItalic-lf-t1--base.tfm) \
tex(Etbb1-BoldItalic-lf-t1.tfm) \
tex(Etbb1-BoldItalic-lf-t1.vf) \
tex(Etbb1-BoldItalic-osf-sc-t1--base.tfm) \
tex(Etbb1-BoldItalic-osf-sc-t1.tfm) \
tex(Etbb1-BoldItalic-osf-sc-t1.vf) \
tex(Etbb1-BoldItalic-osf-swash-t1--base.tfm) \
tex(Etbb1-BoldItalic-osf-swash-t1.tfm) \
tex(Etbb1-BoldItalic-osf-swash-t1.vf) \
tex(Etbb1-BoldItalic-osf-t1--base.tfm) \
tex(Etbb1-BoldItalic-osf-t1.tfm) \
tex(Etbb1-BoldItalic-osf-t1.vf) \
tex(Etbb1-BoldItalic-tlf-sc-t1--base.tfm) \
tex(Etbb1-BoldItalic-tlf-sc-t1.tfm) \
tex(Etbb1-BoldItalic-tlf-sc-t1.vf) \
tex(Etbb1-BoldItalic-tlf-swash-t1--base.tfm) \
tex(Etbb1-BoldItalic-tlf-swash-t1.tfm) \
tex(Etbb1-BoldItalic-tlf-swash-t1.vf) \
tex(Etbb1-BoldItalic-tlf-t1--base.tfm) \
tex(Etbb1-BoldItalic-tlf-t1.tfm) \
tex(Etbb1-BoldItalic-tlf-t1.vf) \
tex(Etbb1-BoldItalic-tosf-sc-t1--base.tfm) \
tex(Etbb1-BoldItalic-tosf-sc-t1.tfm) \
tex(Etbb1-BoldItalic-tosf-sc-t1.vf) \
tex(Etbb1-BoldItalic-tosf-swash-t1--base.tfm) \
tex(Etbb1-BoldItalic-tosf-swash-t1.tfm) \
tex(Etbb1-BoldItalic-tosf-swash-t1.vf) \
tex(Etbb1-BoldItalic-tosf-t1--base.tfm) \
tex(Etbb1-BoldItalic-tosf-t1.tfm) \
tex(Etbb1-BoldItalic-tosf-t1.vf) \
tex(Etbb1-Italic-lf-sc-t1--base.tfm) \
tex(Etbb1-Italic-lf-sc-t1.tfm) \
tex(Etbb1-Italic-lf-sc-t1.vf) \
tex(Etbb1-Italic-lf-swash-t1--base.tfm) \
tex(Etbb1-Italic-lf-swash-t1.tfm) \
tex(Etbb1-Italic-lf-swash-t1.vf) \
tex(Etbb1-Italic-lf-t1--base.tfm) \
tex(Etbb1-Italic-lf-t1.tfm) \
tex(Etbb1-Italic-lf-t1.vf) \
tex(Etbb1-Italic-osf-sc-t1--base.tfm) \
tex(Etbb1-Italic-osf-sc-t1.tfm) \
tex(Etbb1-Italic-osf-sc-t1.vf) \
tex(Etbb1-Italic-osf-swash-t1--base.tfm) \
tex(Etbb1-Italic-osf-swash-t1.tfm) \
tex(Etbb1-Italic-osf-swash-t1.vf) \
tex(Etbb1-Italic-osf-t1--base.tfm) \
tex(Etbb1-Italic-osf-t1.tfm) \
tex(Etbb1-Italic-osf-t1.vf) \
tex(Etbb1-Italic-tlf-sc-t1--base.tfm) \
tex(Etbb1-Italic-tlf-sc-t1.tfm) \
tex(Etbb1-Italic-tlf-sc-t1.vf) \
tex(Etbb1-Italic-tlf-swash-t1--base.tfm) \
tex(Etbb1-Italic-tlf-swash-t1.tfm) \
tex(Etbb1-Italic-tlf-swash-t1.vf) \
tex(Etbb1-Italic-tlf-t1--base.tfm) \
tex(Etbb1-Italic-tlf-t1.tfm) \
tex(Etbb1-Italic-tlf-t1.vf) \
tex(Etbb1-Italic-tosf-sc-t1--base.tfm) \
tex(Etbb1-Italic-tosf-sc-t1.tfm) \
tex(Etbb1-Italic-tosf-sc-t1.vf) \
tex(Etbb1-Italic-tosf-swash-t1--base.tfm) \
tex(Etbb1-Italic-tosf-swash-t1.tfm) \
tex(Etbb1-Italic-tosf-swash-t1.vf) \
tex(Etbb1-Italic-tosf-t1--base.tfm) \
tex(Etbb1-Italic-tosf-t1.tfm) \
tex(Etbb1-Italic-tosf-t1.vf) \
tex(Etbb1-Regular-lf-sc-t1--base.tfm) \
tex(Etbb1-Regular-lf-sc-t1.tfm) \
tex(Etbb1-Regular-lf-sc-t1.vf) \
tex(Etbb1-Regular-lf-swash-t1--base.tfm) \
tex(Etbb1-Regular-lf-swash-t1.tfm) \
tex(Etbb1-Regular-lf-swash-t1.vf) \
tex(Etbb1-Regular-lf-t1--base.tfm) \
tex(Etbb1-Regular-lf-t1.tfm) \
tex(Etbb1-Regular-lf-t1.vf) \
tex(Etbb1-Regular-osf-sc-t1--base.tfm) \
tex(Etbb1-Regular-osf-sc-t1.tfm) \
tex(Etbb1-Regular-osf-sc-t1.vf) \
tex(Etbb1-Regular-osf-swash-t1--base.tfm) \
tex(Etbb1-Regular-osf-swash-t1.tfm) \
tex(Etbb1-Regular-osf-swash-t1.vf) \
tex(Etbb1-Regular-osf-t1--base.tfm) \
tex(Etbb1-Regular-osf-t1.tfm) \
tex(Etbb1-Regular-osf-t1.vf) \
tex(Etbb1-Regular-tlf-sc-t1--base.tfm) \
tex(Etbb1-Regular-tlf-sc-t1.tfm) \
tex(Etbb1-Regular-tlf-sc-t1.vf) \
tex(Etbb1-Regular-tlf-swash-t1--base.tfm) \
tex(Etbb1-Regular-tlf-swash-t1.tfm) \
tex(Etbb1-Regular-tlf-swash-t1.vf) \
tex(Etbb1-Regular-tlf-t1--base.tfm) \
tex(Etbb1-Regular-tlf-t1.tfm) \
tex(Etbb1-Regular-tlf-t1.vf) \
tex(Etbb1-Regular-tosf-sc-t1--base.tfm) \
tex(Etbb1-Regular-tosf-sc-t1.tfm) \
tex(Etbb1-Regular-tosf-sc-t1.vf) \
tex(Etbb1-Regular-tosf-swash-t1--base.tfm) \
tex(Etbb1-Regular-tosf-swash-t1.tfm) \
tex(Etbb1-Regular-tosf-swash-t1.vf) \
tex(Etbb1-Regular-tosf-t1--base.tfm) \
tex(Etbb1-Regular-tosf-t1.tfm) \
tex(Etbb1-Regular-tosf-t1.vf) \
tex(LY1ETbb-Dnom.fd) \
tex(LY1ETbb-Inf.fd) \
tex(LY1ETbb-LF.fd) \
tex(LY1ETbb-OsF.fd) \
tex(LY1ETbb-Sup.fd) \
tex(LY1ETbb-TLF.fd) \
tex(LY1ETbb-TOsF.fd) \
tex(OT1ETbb-Dnom.fd) \
tex(OT1ETbb-Inf.fd) \
tex(OT1ETbb-LF.fd) \
tex(OT1ETbb-OsF.fd) \
tex(OT1ETbb-Sup.fd) \
tex(OT1ETbb-TLF.fd) \
tex(OT1ETbb-TOsF.fd) \
tex(T1ETbb-Dnom.fd) \
tex(T1ETbb-Inf.fd) \
tex(T1ETbb-LF.fd) \
tex(T1ETbb-OsF.fd) \
tex(T1ETbb-Sup.fd) \
tex(T1ETbb-TLF.fd) \
tex(T1ETbb-TOsF.fd) \
tex(TS1ETbb-LF.fd) \
tex(TS1ETbb-OsF.fd) \
tex(TS1ETbb-TLF.fd) \
tex(TS1ETbb-TOsF.fd) \
tex(etbb1_3ccbvp.enc) \
tex(etbb1_3ggaku.enc) \
tex(etbb1_6bhqsy.enc) \
tex(etbb1_6dkfmm.enc) \
tex(etbb1_d63baf.enc) \
tex(etbb1_dpvwoq.enc) \
tex(etbb1_eqc2ac.enc) \
tex(etbb1_frcze6.enc) \
tex(etbb1_hah5or.enc) \
tex(etbb1_mfrons.enc) \
tex(etbb1_mgm6re.enc) \
tex(etbb1_pvrda3.enc) \
tex(etbb1_sb7odk.enc) \
tex(etbb1_vtabip.enc) \
tex(etbb1_xaqh3v.enc) \
tex(etbb1_yziesh.enc) \
tex(etbb_242knm.enc) \
tex(etbb_2jmcdk.enc) \
tex(etbb_2ynk4h.enc) \
tex(etbb_33mftd.enc) \
tex(etbb_3ccbvp.enc) \
tex(etbb_3ggaku.enc) \
tex(etbb_3obh62.enc) \
tex(etbb_3pymqv.enc) \
tex(etbb_3ygfa2.enc) \
tex(etbb_42bwpg.enc) \
tex(etbb_4hpi45.enc) \
tex(etbb_4o3pf4.enc) \
tex(etbb_4sxvu4.enc) \
tex(etbb_4xv7ax.enc) \
tex(etbb_5drz2o.enc) \
tex(etbb_5iollt.enc) \
tex(etbb_5um4so.enc) \
tex(etbb_65swoa.enc) \
tex(etbb_6bhqsy.enc) \
tex(etbb_6dkfmm.enc) \
tex(etbb_6z6nrw.enc) \
tex(etbb_7dlbn4.enc) \
tex(etbb_7ipmvr.enc) \
tex(etbb_7pzsmk.enc) \
tex(etbb_7t4ywj.enc) \
tex(etbb_7tqudy.enc) \
tex(etbb_7uz5xh.enc) \
tex(etbb_atf2m5.enc) \
tex(etbb_b3flk2.enc) \
tex(etbb_bb5xlm.enc) \
tex(etbb_boj3jd.enc) \
tex(etbb_cq6xx2.enc) \
tex(etbb_cxbogn.enc) \
tex(etbb_cyp5f5.enc) \
tex(etbb_cyyszv.enc) \
tex(etbb_d63baf.enc) \
tex(etbb_dkuysn.enc) \
tex(etbb_dpvwoq.enc) \
tex(etbb_e7zo2o.enc) \
tex(etbb_ehl4wc.enc) \
tex(etbb_elsw3h.enc) \
tex(etbb_eqc2ac.enc) \
tex(etbb_eqlboo.enc) \
tex(etbb_f55msl.enc) \
tex(etbb_fpvlkw.enc) \
tex(etbb_frcze6.enc) \
tex(etbb_fveuju.enc) \
tex(etbb_fwcdph.enc) \
tex(etbb_fyek6u.enc) \
tex(etbb_g2yynh.enc) \
tex(etbb_gteq3q.enc) \
tex(etbb_gtqfg2.enc) \
tex(etbb_hah5or.enc) \
tex(etbb_hdnox5.enc) \
tex(etbb_hn62ay.enc) \
tex(etbb_i2z4ax.enc) \
tex(etbb_i5ezvi.enc) \
tex(etbb_izxro2.enc) \
tex(etbb_j43iwo.enc) \
tex(etbb_j4gzyc.enc) \
tex(etbb_j7myeh.enc) \
tex(etbb_jjhcst.enc) \
tex(etbb_kvzzr3.enc) \
tex(etbb_ladhhj.enc) \
tex(etbb_m5kdwt.enc) \
tex(etbb_mfrons.enc) \
tex(etbb_mgm6re.enc) \
tex(etbb_mpvq56.enc) \
tex(etbb_n73bzf.enc) \
tex(etbb_num7wi.enc) \
tex(etbb_nvfc5y.enc) \
tex(etbb_oe3mzn.enc) \
tex(etbb_ohc25e.enc) \
tex(etbb_olodrh.enc) \
tex(etbb_onypnl.enc) \
tex(etbb_ooqfsa.enc) \
tex(etbb_ow4ien.enc) \
tex(etbb_oynaqb.enc) \
tex(etbb_p6ehom.enc) \
tex(etbb_pqh27d.enc) \
tex(etbb_pvrda3.enc) \
tex(etbb_q62n24.enc) \
tex(etbb_rgl4wj.enc) \
tex(etbb_riohwx.enc) \
tex(etbb_rzlqzq.enc) \
tex(etbb_sb7odk.enc) \
tex(etbb_sjtq2a.enc) \
tex(etbb_skushq.enc) \
tex(etbb_t4d6nl.enc) \
tex(etbb_tbmtgo.enc) \
tex(etbb_tunzhv.enc) \
tex(etbb_ujzbb6.enc) \
tex(etbb_v6nho7.enc) \
tex(etbb_vazzz3.enc) \
tex(etbb_veuqiz.enc) \
tex(etbb_vmilsn.enc) \
tex(etbb_vqghpl.enc) \
tex(etbb_vtabip.enc) \
tex(etbb_xaqh3v.enc) \
tex(etbb_xe5wuh.enc) \
tex(etbb_xmn5et.enc) \
tex(etbb_xwgzeq.enc) \
tex(etbb_y6dqd4.enc) \
tex(etbb_yadlkl.enc) \
tex(etbb_ybjyd4.enc) \
tex(etbb_yiqwpu.enc) \
tex(etbb_ytzykv.enc) \
tex(etbb_yziesh.enc) \
tex(etbb_yzoycr.enc) \
tex(etbb_zpkt7y.enc) \
texlive-etbb"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(etoolbox.sty) \
tex(fontaxes.sty) \
tex(fontenc.sty) \
tex(ifetex.sty) \
tex(ifthen.sty) \
tex(mweights.sty) \
tex(scalefnt.sty) \
tex(textcomp.sty) \
tex(updmap.cfg) \
tex(xkeyval.sty) \
tex(xstring.sty) \
texlive \
texlive-etbb-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
