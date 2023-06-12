SUMMARY = "Use SourceCodePro with TeX(-alike) systems"
DESCRIPTION = "The font is an open-source Monospaced development from Adobe. \
The package provides fonts (in both Adobe Type 1 and OpenType \
formats) and macros supporting their use in LaTeX (Type 1) and \
XeLaTeX/LuaLaTeX (OTF)."
LICENSE = "OFL-1.1"

PV = "2023.201.2.7svn54512"

RPM_NAME = "texlive-sourcecodepro-2023.201.2.7svn54512-57.1.noarch.rpm"
RPM_HASH = "d09c171b2f3e039ec7bc4493c7bf74474be84b05d243640abf8d24572c3e4e6a40335df107d41fa14ee3c0fc7abb4ed4bc0b5150cc98d2079eee55f247611414"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(LY1SourceCodePro-Dnom.fd) \
tex(LY1SourceCodePro-Numr.fd) \
tex(LY1SourceCodePro-Sup.fd) \
tex(LY1SourceCodePro-TLF.fd) \
tex(LY1SourceCodePro-TOsF.fd) \
tex(OT1SourceCodePro-Dnom.fd) \
tex(OT1SourceCodePro-Numr.fd) \
tex(OT1SourceCodePro-Sup.fd) \
tex(OT1SourceCodePro-TLF.fd) \
tex(OT1SourceCodePro-TOsF.fd) \
tex(SourceCodePro-Black-dnom-ly1--base.tfm) \
tex(SourceCodePro-Black-dnom-ly1.tfm) \
tex(SourceCodePro-Black-dnom-ly1.vf) \
tex(SourceCodePro-Black-dnom-ot1.tfm) \
tex(SourceCodePro-Black-dnom-t1--base.tfm) \
tex(SourceCodePro-Black-dnom-t1.tfm) \
tex(SourceCodePro-Black-dnom-t1.vf) \
tex(SourceCodePro-Black-dnom-t2a.tfm) \
tex(SourceCodePro-Black-numr-ly1--base.tfm) \
tex(SourceCodePro-Black-numr-ly1.tfm) \
tex(SourceCodePro-Black-numr-ly1.vf) \
tex(SourceCodePro-Black-numr-ot1.tfm) \
tex(SourceCodePro-Black-numr-t1--base.tfm) \
tex(SourceCodePro-Black-numr-t1.tfm) \
tex(SourceCodePro-Black-numr-t1.vf) \
tex(SourceCodePro-Black-numr-t2a.tfm) \
tex(SourceCodePro-Black-sup-ly1--base.tfm) \
tex(SourceCodePro-Black-sup-ly1.tfm) \
tex(SourceCodePro-Black-sup-ly1.vf) \
tex(SourceCodePro-Black-sup-ot1.tfm) \
tex(SourceCodePro-Black-sup-t1--base.tfm) \
tex(SourceCodePro-Black-sup-t1.tfm) \
tex(SourceCodePro-Black-sup-t1.vf) \
tex(SourceCodePro-Black-sup-t2a.tfm) \
tex(SourceCodePro-Black-tlf-ly1--base.tfm) \
tex(SourceCodePro-Black-tlf-ly1.tfm) \
tex(SourceCodePro-Black-tlf-ly1.vf) \
tex(SourceCodePro-Black-tlf-ot1.tfm) \
tex(SourceCodePro-Black-tlf-t1--base.tfm) \
tex(SourceCodePro-Black-tlf-t1.tfm) \
tex(SourceCodePro-Black-tlf-t1.vf) \
tex(SourceCodePro-Black-tlf-t2a.tfm) \
tex(SourceCodePro-Black-tlf-ts1--base.tfm) \
tex(SourceCodePro-Black-tlf-ts1.tfm) \
tex(SourceCodePro-Black-tlf-ts1.vf) \
tex(SourceCodePro-Black-tosf-ly1--base.tfm) \
tex(SourceCodePro-Black-tosf-ly1.tfm) \
tex(SourceCodePro-Black-tosf-ly1.vf) \
tex(SourceCodePro-Black-tosf-ot1.tfm) \
tex(SourceCodePro-Black-tosf-t1--base.tfm) \
tex(SourceCodePro-Black-tosf-t1.tfm) \
tex(SourceCodePro-Black-tosf-t1.vf) \
tex(SourceCodePro-Black-tosf-t2a.tfm) \
tex(SourceCodePro-Black-tosf-ts1--base.tfm) \
tex(SourceCodePro-Black-tosf-ts1.tfm) \
tex(SourceCodePro-Black-tosf-ts1.vf) \
tex(SourceCodePro-BlackIt-dnom-ly1--base.tfm) \
tex(SourceCodePro-BlackIt-dnom-ly1.tfm) \
tex(SourceCodePro-BlackIt-dnom-ly1.vf) \
tex(SourceCodePro-BlackIt-dnom-ot1.tfm) \
tex(SourceCodePro-BlackIt-dnom-t1--base.tfm) \
tex(SourceCodePro-BlackIt-dnom-t1.tfm) \
tex(SourceCodePro-BlackIt-dnom-t1.vf) \
tex(SourceCodePro-BlackIt-dnom-t2a.tfm) \
tex(SourceCodePro-BlackIt-numr-ly1--base.tfm) \
tex(SourceCodePro-BlackIt-numr-ly1.tfm) \
tex(SourceCodePro-BlackIt-numr-ly1.vf) \
tex(SourceCodePro-BlackIt-numr-ot1.tfm) \
tex(SourceCodePro-BlackIt-numr-t1--base.tfm) \
tex(SourceCodePro-BlackIt-numr-t1.tfm) \
tex(SourceCodePro-BlackIt-numr-t1.vf) \
tex(SourceCodePro-BlackIt-numr-t2a.tfm) \
tex(SourceCodePro-BlackIt-sup-ly1--base.tfm) \
tex(SourceCodePro-BlackIt-sup-ly1.tfm) \
tex(SourceCodePro-BlackIt-sup-ly1.vf) \
tex(SourceCodePro-BlackIt-sup-ot1.tfm) \
tex(SourceCodePro-BlackIt-sup-t1--base.tfm) \
tex(SourceCodePro-BlackIt-sup-t1.tfm) \
tex(SourceCodePro-BlackIt-sup-t1.vf) \
tex(SourceCodePro-BlackIt-sup-t2a.tfm) \
tex(SourceCodePro-BlackIt-tlf-ly1--base.tfm) \
tex(SourceCodePro-BlackIt-tlf-ly1.tfm) \
tex(SourceCodePro-BlackIt-tlf-ly1.vf) \
tex(SourceCodePro-BlackIt-tlf-ot1.tfm) \
tex(SourceCodePro-BlackIt-tlf-t1--base.tfm) \
tex(SourceCodePro-BlackIt-tlf-t1.tfm) \
tex(SourceCodePro-BlackIt-tlf-t1.vf) \
tex(SourceCodePro-BlackIt-tlf-t2a.tfm) \
tex(SourceCodePro-BlackIt-tlf-ts1--base.tfm) \
tex(SourceCodePro-BlackIt-tlf-ts1.tfm) \
tex(SourceCodePro-BlackIt-tlf-ts1.vf) \
tex(SourceCodePro-BlackIt-tosf-ly1--base.tfm) \
tex(SourceCodePro-BlackIt-tosf-ly1.tfm) \
tex(SourceCodePro-BlackIt-tosf-ly1.vf) \
tex(SourceCodePro-BlackIt-tosf-ot1.tfm) \
tex(SourceCodePro-BlackIt-tosf-t1--base.tfm) \
tex(SourceCodePro-BlackIt-tosf-t1.tfm) \
tex(SourceCodePro-BlackIt-tosf-t1.vf) \
tex(SourceCodePro-BlackIt-tosf-t2a.tfm) \
tex(SourceCodePro-BlackIt-tosf-ts1--base.tfm) \
tex(SourceCodePro-BlackIt-tosf-ts1.tfm) \
tex(SourceCodePro-BlackIt-tosf-ts1.vf) \
tex(SourceCodePro-Bold-dnom-ly1--base.tfm) \
tex(SourceCodePro-Bold-dnom-ly1.tfm) \
tex(SourceCodePro-Bold-dnom-ly1.vf) \
tex(SourceCodePro-Bold-dnom-ot1.tfm) \
tex(SourceCodePro-Bold-dnom-t1--base.tfm) \
tex(SourceCodePro-Bold-dnom-t1.tfm) \
tex(SourceCodePro-Bold-dnom-t1.vf) \
tex(SourceCodePro-Bold-dnom-t2a.tfm) \
tex(SourceCodePro-Bold-numr-ly1--base.tfm) \
tex(SourceCodePro-Bold-numr-ly1.tfm) \
tex(SourceCodePro-Bold-numr-ly1.vf) \
tex(SourceCodePro-Bold-numr-ot1.tfm) \
tex(SourceCodePro-Bold-numr-t1--base.tfm) \
tex(SourceCodePro-Bold-numr-t1.tfm) \
tex(SourceCodePro-Bold-numr-t1.vf) \
tex(SourceCodePro-Bold-numr-t2a.tfm) \
tex(SourceCodePro-Bold-sup-ly1--base.tfm) \
tex(SourceCodePro-Bold-sup-ly1.tfm) \
tex(SourceCodePro-Bold-sup-ly1.vf) \
tex(SourceCodePro-Bold-sup-ot1.tfm) \
tex(SourceCodePro-Bold-sup-t1--base.tfm) \
tex(SourceCodePro-Bold-sup-t1.tfm) \
tex(SourceCodePro-Bold-sup-t1.vf) \
tex(SourceCodePro-Bold-sup-t2a.tfm) \
tex(SourceCodePro-Bold-tlf-ly1--base.tfm) \
tex(SourceCodePro-Bold-tlf-ly1.tfm) \
tex(SourceCodePro-Bold-tlf-ly1.vf) \
tex(SourceCodePro-Bold-tlf-ot1.tfm) \
tex(SourceCodePro-Bold-tlf-t1--base.tfm) \
tex(SourceCodePro-Bold-tlf-t1.tfm) \
tex(SourceCodePro-Bold-tlf-t1.vf) \
tex(SourceCodePro-Bold-tlf-t2a.tfm) \
tex(SourceCodePro-Bold-tlf-ts1--base.tfm) \
tex(SourceCodePro-Bold-tlf-ts1.tfm) \
tex(SourceCodePro-Bold-tlf-ts1.vf) \
tex(SourceCodePro-Bold-tosf-ly1--base.tfm) \
tex(SourceCodePro-Bold-tosf-ly1.tfm) \
tex(SourceCodePro-Bold-tosf-ly1.vf) \
tex(SourceCodePro-Bold-tosf-ot1.tfm) \
tex(SourceCodePro-Bold-tosf-t1--base.tfm) \
tex(SourceCodePro-Bold-tosf-t1.tfm) \
tex(SourceCodePro-Bold-tosf-t1.vf) \
tex(SourceCodePro-Bold-tosf-t2a.tfm) \
tex(SourceCodePro-Bold-tosf-ts1--base.tfm) \
tex(SourceCodePro-Bold-tosf-ts1.tfm) \
tex(SourceCodePro-Bold-tosf-ts1.vf) \
tex(SourceCodePro-BoldIt-dnom-ly1--base.tfm) \
tex(SourceCodePro-BoldIt-dnom-ly1.tfm) \
tex(SourceCodePro-BoldIt-dnom-ly1.vf) \
tex(SourceCodePro-BoldIt-dnom-ot1.tfm) \
tex(SourceCodePro-BoldIt-dnom-t1--base.tfm) \
tex(SourceCodePro-BoldIt-dnom-t1.tfm) \
tex(SourceCodePro-BoldIt-dnom-t1.vf) \
tex(SourceCodePro-BoldIt-dnom-t2a.tfm) \
tex(SourceCodePro-BoldIt-numr-ly1--base.tfm) \
tex(SourceCodePro-BoldIt-numr-ly1.tfm) \
tex(SourceCodePro-BoldIt-numr-ly1.vf) \
tex(SourceCodePro-BoldIt-numr-ot1.tfm) \
tex(SourceCodePro-BoldIt-numr-t1--base.tfm) \
tex(SourceCodePro-BoldIt-numr-t1.tfm) \
tex(SourceCodePro-BoldIt-numr-t1.vf) \
tex(SourceCodePro-BoldIt-numr-t2a.tfm) \
tex(SourceCodePro-BoldIt-sup-ly1--base.tfm) \
tex(SourceCodePro-BoldIt-sup-ly1.tfm) \
tex(SourceCodePro-BoldIt-sup-ly1.vf) \
tex(SourceCodePro-BoldIt-sup-ot1.tfm) \
tex(SourceCodePro-BoldIt-sup-t1--base.tfm) \
tex(SourceCodePro-BoldIt-sup-t1.tfm) \
tex(SourceCodePro-BoldIt-sup-t1.vf) \
tex(SourceCodePro-BoldIt-sup-t2a.tfm) \
tex(SourceCodePro-BoldIt-tlf-ly1--base.tfm) \
tex(SourceCodePro-BoldIt-tlf-ly1.tfm) \
tex(SourceCodePro-BoldIt-tlf-ly1.vf) \
tex(SourceCodePro-BoldIt-tlf-ot1.tfm) \
tex(SourceCodePro-BoldIt-tlf-t1--base.tfm) \
tex(SourceCodePro-BoldIt-tlf-t1.tfm) \
tex(SourceCodePro-BoldIt-tlf-t1.vf) \
tex(SourceCodePro-BoldIt-tlf-t2a.tfm) \
tex(SourceCodePro-BoldIt-tlf-ts1--base.tfm) \
tex(SourceCodePro-BoldIt-tlf-ts1.tfm) \
tex(SourceCodePro-BoldIt-tlf-ts1.vf) \
tex(SourceCodePro-BoldIt-tosf-ly1--base.tfm) \
tex(SourceCodePro-BoldIt-tosf-ly1.tfm) \
tex(SourceCodePro-BoldIt-tosf-ly1.vf) \
tex(SourceCodePro-BoldIt-tosf-ot1.tfm) \
tex(SourceCodePro-BoldIt-tosf-t1--base.tfm) \
tex(SourceCodePro-BoldIt-tosf-t1.tfm) \
tex(SourceCodePro-BoldIt-tosf-t1.vf) \
tex(SourceCodePro-BoldIt-tosf-t2a.tfm) \
tex(SourceCodePro-BoldIt-tosf-ts1--base.tfm) \
tex(SourceCodePro-BoldIt-tosf-ts1.tfm) \
tex(SourceCodePro-BoldIt-tosf-ts1.vf) \
tex(SourceCodePro-ExtraLight-dnom-ly1--base.tfm) \
tex(SourceCodePro-ExtraLight-dnom-ly1.tfm) \
tex(SourceCodePro-ExtraLight-dnom-ly1.vf) \
tex(SourceCodePro-ExtraLight-dnom-ot1.tfm) \
tex(SourceCodePro-ExtraLight-dnom-t1--base.tfm) \
tex(SourceCodePro-ExtraLight-dnom-t1.tfm) \
tex(SourceCodePro-ExtraLight-dnom-t1.vf) \
tex(SourceCodePro-ExtraLight-dnom-t2a.tfm) \
tex(SourceCodePro-ExtraLight-numr-ly1--base.tfm) \
tex(SourceCodePro-ExtraLight-numr-ly1.tfm) \
tex(SourceCodePro-ExtraLight-numr-ly1.vf) \
tex(SourceCodePro-ExtraLight-numr-ot1.tfm) \
tex(SourceCodePro-ExtraLight-numr-t1--base.tfm) \
tex(SourceCodePro-ExtraLight-numr-t1.tfm) \
tex(SourceCodePro-ExtraLight-numr-t1.vf) \
tex(SourceCodePro-ExtraLight-numr-t2a.tfm) \
tex(SourceCodePro-ExtraLight-sup-ly1--base.tfm) \
tex(SourceCodePro-ExtraLight-sup-ly1.tfm) \
tex(SourceCodePro-ExtraLight-sup-ly1.vf) \
tex(SourceCodePro-ExtraLight-sup-ot1.tfm) \
tex(SourceCodePro-ExtraLight-sup-t1--base.tfm) \
tex(SourceCodePro-ExtraLight-sup-t1.tfm) \
tex(SourceCodePro-ExtraLight-sup-t1.vf) \
tex(SourceCodePro-ExtraLight-sup-t2a.tfm) \
tex(SourceCodePro-ExtraLight-tlf-ly1--base.tfm) \
tex(SourceCodePro-ExtraLight-tlf-ly1.tfm) \
tex(SourceCodePro-ExtraLight-tlf-ly1.vf) \
tex(SourceCodePro-ExtraLight-tlf-ot1.tfm) \
tex(SourceCodePro-ExtraLight-tlf-t1--base.tfm) \
tex(SourceCodePro-ExtraLight-tlf-t1.tfm) \
tex(SourceCodePro-ExtraLight-tlf-t1.vf) \
tex(SourceCodePro-ExtraLight-tlf-t2a.tfm) \
tex(SourceCodePro-ExtraLight-tlf-ts1--base.tfm) \
tex(SourceCodePro-ExtraLight-tlf-ts1.tfm) \
tex(SourceCodePro-ExtraLight-tlf-ts1.vf) \
tex(SourceCodePro-ExtraLight-tosf-ly1--base.tfm) \
tex(SourceCodePro-ExtraLight-tosf-ly1.tfm) \
tex(SourceCodePro-ExtraLight-tosf-ly1.vf) \
tex(SourceCodePro-ExtraLight-tosf-ot1.tfm) \
tex(SourceCodePro-ExtraLight-tosf-t1--base.tfm) \
tex(SourceCodePro-ExtraLight-tosf-t1.tfm) \
tex(SourceCodePro-ExtraLight-tosf-t1.vf) \
tex(SourceCodePro-ExtraLight-tosf-t2a.tfm) \
tex(SourceCodePro-ExtraLight-tosf-ts1--base.tfm) \
tex(SourceCodePro-ExtraLight-tosf-ts1.tfm) \
tex(SourceCodePro-ExtraLight-tosf-ts1.vf) \
tex(SourceCodePro-ExtraLightIt-dnom-ly1--base.tfm) \
tex(SourceCodePro-ExtraLightIt-dnom-ly1.tfm) \
tex(SourceCodePro-ExtraLightIt-dnom-ly1.vf) \
tex(SourceCodePro-ExtraLightIt-dnom-ot1.tfm) \
tex(SourceCodePro-ExtraLightIt-dnom-t1--base.tfm) \
tex(SourceCodePro-ExtraLightIt-dnom-t1.tfm) \
tex(SourceCodePro-ExtraLightIt-dnom-t1.vf) \
tex(SourceCodePro-ExtraLightIt-dnom-t2a.tfm) \
tex(SourceCodePro-ExtraLightIt-numr-ly1--base.tfm) \
tex(SourceCodePro-ExtraLightIt-numr-ly1.tfm) \
tex(SourceCodePro-ExtraLightIt-numr-ly1.vf) \
tex(SourceCodePro-ExtraLightIt-numr-ot1.tfm) \
tex(SourceCodePro-ExtraLightIt-numr-t1--base.tfm) \
tex(SourceCodePro-ExtraLightIt-numr-t1.tfm) \
tex(SourceCodePro-ExtraLightIt-numr-t1.vf) \
tex(SourceCodePro-ExtraLightIt-numr-t2a.tfm) \
tex(SourceCodePro-ExtraLightIt-sup-ly1--base.tfm) \
tex(SourceCodePro-ExtraLightIt-sup-ly1.tfm) \
tex(SourceCodePro-ExtraLightIt-sup-ly1.vf) \
tex(SourceCodePro-ExtraLightIt-sup-ot1.tfm) \
tex(SourceCodePro-ExtraLightIt-sup-t1--base.tfm) \
tex(SourceCodePro-ExtraLightIt-sup-t1.tfm) \
tex(SourceCodePro-ExtraLightIt-sup-t1.vf) \
tex(SourceCodePro-ExtraLightIt-sup-t2a.tfm) \
tex(SourceCodePro-ExtraLightIt-tlf-ly1--base.tfm) \
tex(SourceCodePro-ExtraLightIt-tlf-ly1.tfm) \
tex(SourceCodePro-ExtraLightIt-tlf-ly1.vf) \
tex(SourceCodePro-ExtraLightIt-tlf-ot1.tfm) \
tex(SourceCodePro-ExtraLightIt-tlf-t1--base.tfm) \
tex(SourceCodePro-ExtraLightIt-tlf-t1.tfm) \
tex(SourceCodePro-ExtraLightIt-tlf-t1.vf) \
tex(SourceCodePro-ExtraLightIt-tlf-t2a.tfm) \
tex(SourceCodePro-ExtraLightIt-tlf-ts1--base.tfm) \
tex(SourceCodePro-ExtraLightIt-tlf-ts1.tfm) \
tex(SourceCodePro-ExtraLightIt-tlf-ts1.vf) \
tex(SourceCodePro-ExtraLightIt-tosf-ly1--base.tfm) \
tex(SourceCodePro-ExtraLightIt-tosf-ly1.tfm) \
tex(SourceCodePro-ExtraLightIt-tosf-ly1.vf) \
tex(SourceCodePro-ExtraLightIt-tosf-ot1.tfm) \
tex(SourceCodePro-ExtraLightIt-tosf-t1--base.tfm) \
tex(SourceCodePro-ExtraLightIt-tosf-t1.tfm) \
tex(SourceCodePro-ExtraLightIt-tosf-t1.vf) \
tex(SourceCodePro-ExtraLightIt-tosf-t2a.tfm) \
tex(SourceCodePro-ExtraLightIt-tosf-ts1--base.tfm) \
tex(SourceCodePro-ExtraLightIt-tosf-ts1.tfm) \
tex(SourceCodePro-ExtraLightIt-tosf-ts1.vf) \
tex(SourceCodePro-It-dnom-ly1--base.tfm) \
tex(SourceCodePro-It-dnom-ly1.tfm) \
tex(SourceCodePro-It-dnom-ly1.vf) \
tex(SourceCodePro-It-dnom-ot1.tfm) \
tex(SourceCodePro-It-dnom-t1--base.tfm) \
tex(SourceCodePro-It-dnom-t1.tfm) \
tex(SourceCodePro-It-dnom-t1.vf) \
tex(SourceCodePro-It-dnom-t2a.tfm) \
tex(SourceCodePro-It-numr-ly1--base.tfm) \
tex(SourceCodePro-It-numr-ly1.tfm) \
tex(SourceCodePro-It-numr-ly1.vf) \
tex(SourceCodePro-It-numr-ot1.tfm) \
tex(SourceCodePro-It-numr-t1--base.tfm) \
tex(SourceCodePro-It-numr-t1.tfm) \
tex(SourceCodePro-It-numr-t1.vf) \
tex(SourceCodePro-It-numr-t2a.tfm) \
tex(SourceCodePro-It-sup-ly1--base.tfm) \
tex(SourceCodePro-It-sup-ly1.tfm) \
tex(SourceCodePro-It-sup-ly1.vf) \
tex(SourceCodePro-It-sup-ot1.tfm) \
tex(SourceCodePro-It-sup-t1--base.tfm) \
tex(SourceCodePro-It-sup-t1.tfm) \
tex(SourceCodePro-It-sup-t1.vf) \
tex(SourceCodePro-It-sup-t2a.tfm) \
tex(SourceCodePro-It-tlf-ly1--base.tfm) \
tex(SourceCodePro-It-tlf-ly1.tfm) \
tex(SourceCodePro-It-tlf-ly1.vf) \
tex(SourceCodePro-It-tlf-ot1.tfm) \
tex(SourceCodePro-It-tlf-t1--base.tfm) \
tex(SourceCodePro-It-tlf-t1.tfm) \
tex(SourceCodePro-It-tlf-t1.vf) \
tex(SourceCodePro-It-tlf-t2a.tfm) \
tex(SourceCodePro-It-tlf-ts1--base.tfm) \
tex(SourceCodePro-It-tlf-ts1.tfm) \
tex(SourceCodePro-It-tlf-ts1.vf) \
tex(SourceCodePro-It-tosf-ly1--base.tfm) \
tex(SourceCodePro-It-tosf-ly1.tfm) \
tex(SourceCodePro-It-tosf-ly1.vf) \
tex(SourceCodePro-It-tosf-ot1.tfm) \
tex(SourceCodePro-It-tosf-t1--base.tfm) \
tex(SourceCodePro-It-tosf-t1.tfm) \
tex(SourceCodePro-It-tosf-t1.vf) \
tex(SourceCodePro-It-tosf-t2a.tfm) \
tex(SourceCodePro-It-tosf-ts1--base.tfm) \
tex(SourceCodePro-It-tosf-ts1.tfm) \
tex(SourceCodePro-It-tosf-ts1.vf) \
tex(SourceCodePro-Light-dnom-ly1--base.tfm) \
tex(SourceCodePro-Light-dnom-ly1.tfm) \
tex(SourceCodePro-Light-dnom-ly1.vf) \
tex(SourceCodePro-Light-dnom-ot1.tfm) \
tex(SourceCodePro-Light-dnom-t1--base.tfm) \
tex(SourceCodePro-Light-dnom-t1.tfm) \
tex(SourceCodePro-Light-dnom-t1.vf) \
tex(SourceCodePro-Light-dnom-t2a.tfm) \
tex(SourceCodePro-Light-numr-ly1--base.tfm) \
tex(SourceCodePro-Light-numr-ly1.tfm) \
tex(SourceCodePro-Light-numr-ly1.vf) \
tex(SourceCodePro-Light-numr-ot1.tfm) \
tex(SourceCodePro-Light-numr-t1--base.tfm) \
tex(SourceCodePro-Light-numr-t1.tfm) \
tex(SourceCodePro-Light-numr-t1.vf) \
tex(SourceCodePro-Light-numr-t2a.tfm) \
tex(SourceCodePro-Light-sup-ly1--base.tfm) \
tex(SourceCodePro-Light-sup-ly1.tfm) \
tex(SourceCodePro-Light-sup-ly1.vf) \
tex(SourceCodePro-Light-sup-ot1.tfm) \
tex(SourceCodePro-Light-sup-t1--base.tfm) \
tex(SourceCodePro-Light-sup-t1.tfm) \
tex(SourceCodePro-Light-sup-t1.vf) \
tex(SourceCodePro-Light-sup-t2a.tfm) \
tex(SourceCodePro-Light-tlf-ly1--base.tfm) \
tex(SourceCodePro-Light-tlf-ly1.tfm) \
tex(SourceCodePro-Light-tlf-ly1.vf) \
tex(SourceCodePro-Light-tlf-ot1.tfm) \
tex(SourceCodePro-Light-tlf-t1--base.tfm) \
tex(SourceCodePro-Light-tlf-t1.tfm) \
tex(SourceCodePro-Light-tlf-t1.vf) \
tex(SourceCodePro-Light-tlf-t2a.tfm) \
tex(SourceCodePro-Light-tlf-ts1--base.tfm) \
tex(SourceCodePro-Light-tlf-ts1.tfm) \
tex(SourceCodePro-Light-tlf-ts1.vf) \
tex(SourceCodePro-Light-tosf-ly1--base.tfm) \
tex(SourceCodePro-Light-tosf-ly1.tfm) \
tex(SourceCodePro-Light-tosf-ly1.vf) \
tex(SourceCodePro-Light-tosf-ot1.tfm) \
tex(SourceCodePro-Light-tosf-t1--base.tfm) \
tex(SourceCodePro-Light-tosf-t1.tfm) \
tex(SourceCodePro-Light-tosf-t1.vf) \
tex(SourceCodePro-Light-tosf-t2a.tfm) \
tex(SourceCodePro-Light-tosf-ts1--base.tfm) \
tex(SourceCodePro-Light-tosf-ts1.tfm) \
tex(SourceCodePro-Light-tosf-ts1.vf) \
tex(SourceCodePro-LightIt-dnom-ly1--base.tfm) \
tex(SourceCodePro-LightIt-dnom-ly1.tfm) \
tex(SourceCodePro-LightIt-dnom-ly1.vf) \
tex(SourceCodePro-LightIt-dnom-ot1.tfm) \
tex(SourceCodePro-LightIt-dnom-t1--base.tfm) \
tex(SourceCodePro-LightIt-dnom-t1.tfm) \
tex(SourceCodePro-LightIt-dnom-t1.vf) \
tex(SourceCodePro-LightIt-dnom-t2a.tfm) \
tex(SourceCodePro-LightIt-numr-ly1--base.tfm) \
tex(SourceCodePro-LightIt-numr-ly1.tfm) \
tex(SourceCodePro-LightIt-numr-ly1.vf) \
tex(SourceCodePro-LightIt-numr-ot1.tfm) \
tex(SourceCodePro-LightIt-numr-t1--base.tfm) \
tex(SourceCodePro-LightIt-numr-t1.tfm) \
tex(SourceCodePro-LightIt-numr-t1.vf) \
tex(SourceCodePro-LightIt-numr-t2a.tfm) \
tex(SourceCodePro-LightIt-sup-ly1--base.tfm) \
tex(SourceCodePro-LightIt-sup-ly1.tfm) \
tex(SourceCodePro-LightIt-sup-ly1.vf) \
tex(SourceCodePro-LightIt-sup-ot1.tfm) \
tex(SourceCodePro-LightIt-sup-t1--base.tfm) \
tex(SourceCodePro-LightIt-sup-t1.tfm) \
tex(SourceCodePro-LightIt-sup-t1.vf) \
tex(SourceCodePro-LightIt-sup-t2a.tfm) \
tex(SourceCodePro-LightIt-tlf-ly1--base.tfm) \
tex(SourceCodePro-LightIt-tlf-ly1.tfm) \
tex(SourceCodePro-LightIt-tlf-ly1.vf) \
tex(SourceCodePro-LightIt-tlf-ot1.tfm) \
tex(SourceCodePro-LightIt-tlf-t1--base.tfm) \
tex(SourceCodePro-LightIt-tlf-t1.tfm) \
tex(SourceCodePro-LightIt-tlf-t1.vf) \
tex(SourceCodePro-LightIt-tlf-t2a.tfm) \
tex(SourceCodePro-LightIt-tlf-ts1--base.tfm) \
tex(SourceCodePro-LightIt-tlf-ts1.tfm) \
tex(SourceCodePro-LightIt-tlf-ts1.vf) \
tex(SourceCodePro-LightIt-tosf-ly1--base.tfm) \
tex(SourceCodePro-LightIt-tosf-ly1.tfm) \
tex(SourceCodePro-LightIt-tosf-ly1.vf) \
tex(SourceCodePro-LightIt-tosf-ot1.tfm) \
tex(SourceCodePro-LightIt-tosf-t1--base.tfm) \
tex(SourceCodePro-LightIt-tosf-t1.tfm) \
tex(SourceCodePro-LightIt-tosf-t1.vf) \
tex(SourceCodePro-LightIt-tosf-t2a.tfm) \
tex(SourceCodePro-LightIt-tosf-ts1--base.tfm) \
tex(SourceCodePro-LightIt-tosf-ts1.tfm) \
tex(SourceCodePro-LightIt-tosf-ts1.vf) \
tex(SourceCodePro-Medium-dnom-ly1--base.tfm) \
tex(SourceCodePro-Medium-dnom-ly1.tfm) \
tex(SourceCodePro-Medium-dnom-ly1.vf) \
tex(SourceCodePro-Medium-dnom-ot1.tfm) \
tex(SourceCodePro-Medium-dnom-t1--base.tfm) \
tex(SourceCodePro-Medium-dnom-t1.tfm) \
tex(SourceCodePro-Medium-dnom-t1.vf) \
tex(SourceCodePro-Medium-dnom-t2a.tfm) \
tex(SourceCodePro-Medium-numr-ly1--base.tfm) \
tex(SourceCodePro-Medium-numr-ly1.tfm) \
tex(SourceCodePro-Medium-numr-ly1.vf) \
tex(SourceCodePro-Medium-numr-ot1.tfm) \
tex(SourceCodePro-Medium-numr-t1--base.tfm) \
tex(SourceCodePro-Medium-numr-t1.tfm) \
tex(SourceCodePro-Medium-numr-t1.vf) \
tex(SourceCodePro-Medium-numr-t2a.tfm) \
tex(SourceCodePro-Medium-sup-ly1--base.tfm) \
tex(SourceCodePro-Medium-sup-ly1.tfm) \
tex(SourceCodePro-Medium-sup-ly1.vf) \
tex(SourceCodePro-Medium-sup-ot1.tfm) \
tex(SourceCodePro-Medium-sup-t1--base.tfm) \
tex(SourceCodePro-Medium-sup-t1.tfm) \
tex(SourceCodePro-Medium-sup-t1.vf) \
tex(SourceCodePro-Medium-sup-t2a.tfm) \
tex(SourceCodePro-Medium-tlf-ly1--base.tfm) \
tex(SourceCodePro-Medium-tlf-ly1.tfm) \
tex(SourceCodePro-Medium-tlf-ly1.vf) \
tex(SourceCodePro-Medium-tlf-ot1.tfm) \
tex(SourceCodePro-Medium-tlf-t1--base.tfm) \
tex(SourceCodePro-Medium-tlf-t1.tfm) \
tex(SourceCodePro-Medium-tlf-t1.vf) \
tex(SourceCodePro-Medium-tlf-t2a.tfm) \
tex(SourceCodePro-Medium-tlf-ts1--base.tfm) \
tex(SourceCodePro-Medium-tlf-ts1.tfm) \
tex(SourceCodePro-Medium-tlf-ts1.vf) \
tex(SourceCodePro-Medium-tosf-ly1--base.tfm) \
tex(SourceCodePro-Medium-tosf-ly1.tfm) \
tex(SourceCodePro-Medium-tosf-ly1.vf) \
tex(SourceCodePro-Medium-tosf-ot1.tfm) \
tex(SourceCodePro-Medium-tosf-t1--base.tfm) \
tex(SourceCodePro-Medium-tosf-t1.tfm) \
tex(SourceCodePro-Medium-tosf-t1.vf) \
tex(SourceCodePro-Medium-tosf-t2a.tfm) \
tex(SourceCodePro-Medium-tosf-ts1--base.tfm) \
tex(SourceCodePro-Medium-tosf-ts1.tfm) \
tex(SourceCodePro-Medium-tosf-ts1.vf) \
tex(SourceCodePro-MediumIt-dnom-ly1--base.tfm) \
tex(SourceCodePro-MediumIt-dnom-ly1.tfm) \
tex(SourceCodePro-MediumIt-dnom-ly1.vf) \
tex(SourceCodePro-MediumIt-dnom-ot1.tfm) \
tex(SourceCodePro-MediumIt-dnom-t1--base.tfm) \
tex(SourceCodePro-MediumIt-dnom-t1.tfm) \
tex(SourceCodePro-MediumIt-dnom-t1.vf) \
tex(SourceCodePro-MediumIt-dnom-t2a.tfm) \
tex(SourceCodePro-MediumIt-numr-ly1--base.tfm) \
tex(SourceCodePro-MediumIt-numr-ly1.tfm) \
tex(SourceCodePro-MediumIt-numr-ly1.vf) \
tex(SourceCodePro-MediumIt-numr-ot1.tfm) \
tex(SourceCodePro-MediumIt-numr-t1--base.tfm) \
tex(SourceCodePro-MediumIt-numr-t1.tfm) \
tex(SourceCodePro-MediumIt-numr-t1.vf) \
tex(SourceCodePro-MediumIt-numr-t2a.tfm) \
tex(SourceCodePro-MediumIt-sup-ly1--base.tfm) \
tex(SourceCodePro-MediumIt-sup-ly1.tfm) \
tex(SourceCodePro-MediumIt-sup-ly1.vf) \
tex(SourceCodePro-MediumIt-sup-ot1.tfm) \
tex(SourceCodePro-MediumIt-sup-t1--base.tfm) \
tex(SourceCodePro-MediumIt-sup-t1.tfm) \
tex(SourceCodePro-MediumIt-sup-t1.vf) \
tex(SourceCodePro-MediumIt-sup-t2a.tfm) \
tex(SourceCodePro-MediumIt-tlf-ly1--base.tfm) \
tex(SourceCodePro-MediumIt-tlf-ly1.tfm) \
tex(SourceCodePro-MediumIt-tlf-ly1.vf) \
tex(SourceCodePro-MediumIt-tlf-ot1.tfm) \
tex(SourceCodePro-MediumIt-tlf-t1--base.tfm) \
tex(SourceCodePro-MediumIt-tlf-t1.tfm) \
tex(SourceCodePro-MediumIt-tlf-t1.vf) \
tex(SourceCodePro-MediumIt-tlf-t2a.tfm) \
tex(SourceCodePro-MediumIt-tlf-ts1--base.tfm) \
tex(SourceCodePro-MediumIt-tlf-ts1.tfm) \
tex(SourceCodePro-MediumIt-tlf-ts1.vf) \
tex(SourceCodePro-MediumIt-tosf-ly1--base.tfm) \
tex(SourceCodePro-MediumIt-tosf-ly1.tfm) \
tex(SourceCodePro-MediumIt-tosf-ly1.vf) \
tex(SourceCodePro-MediumIt-tosf-ot1.tfm) \
tex(SourceCodePro-MediumIt-tosf-t1--base.tfm) \
tex(SourceCodePro-MediumIt-tosf-t1.tfm) \
tex(SourceCodePro-MediumIt-tosf-t1.vf) \
tex(SourceCodePro-MediumIt-tosf-t2a.tfm) \
tex(SourceCodePro-MediumIt-tosf-ts1--base.tfm) \
tex(SourceCodePro-MediumIt-tosf-ts1.tfm) \
tex(SourceCodePro-MediumIt-tosf-ts1.vf) \
tex(SourceCodePro-Regular-dnom-ly1--base.tfm) \
tex(SourceCodePro-Regular-dnom-ly1.tfm) \
tex(SourceCodePro-Regular-dnom-ly1.vf) \
tex(SourceCodePro-Regular-dnom-ot1.tfm) \
tex(SourceCodePro-Regular-dnom-t1--base.tfm) \
tex(SourceCodePro-Regular-dnom-t1.tfm) \
tex(SourceCodePro-Regular-dnom-t1.vf) \
tex(SourceCodePro-Regular-dnom-t2a.tfm) \
tex(SourceCodePro-Regular-numr-ly1--base.tfm) \
tex(SourceCodePro-Regular-numr-ly1.tfm) \
tex(SourceCodePro-Regular-numr-ly1.vf) \
tex(SourceCodePro-Regular-numr-ot1.tfm) \
tex(SourceCodePro-Regular-numr-t1--base.tfm) \
tex(SourceCodePro-Regular-numr-t1.tfm) \
tex(SourceCodePro-Regular-numr-t1.vf) \
tex(SourceCodePro-Regular-numr-t2a.tfm) \
tex(SourceCodePro-Regular-sup-ly1--base.tfm) \
tex(SourceCodePro-Regular-sup-ly1.tfm) \
tex(SourceCodePro-Regular-sup-ly1.vf) \
tex(SourceCodePro-Regular-sup-ot1.tfm) \
tex(SourceCodePro-Regular-sup-t1--base.tfm) \
tex(SourceCodePro-Regular-sup-t1.tfm) \
tex(SourceCodePro-Regular-sup-t1.vf) \
tex(SourceCodePro-Regular-sup-t2a.tfm) \
tex(SourceCodePro-Regular-tlf-ly1--base.tfm) \
tex(SourceCodePro-Regular-tlf-ly1.tfm) \
tex(SourceCodePro-Regular-tlf-ly1.vf) \
tex(SourceCodePro-Regular-tlf-ot1.tfm) \
tex(SourceCodePro-Regular-tlf-t1--base.tfm) \
tex(SourceCodePro-Regular-tlf-t1.tfm) \
tex(SourceCodePro-Regular-tlf-t1.vf) \
tex(SourceCodePro-Regular-tlf-t2a.tfm) \
tex(SourceCodePro-Regular-tlf-ts1--base.tfm) \
tex(SourceCodePro-Regular-tlf-ts1.tfm) \
tex(SourceCodePro-Regular-tlf-ts1.vf) \
tex(SourceCodePro-Regular-tosf-ly1--base.tfm) \
tex(SourceCodePro-Regular-tosf-ly1.tfm) \
tex(SourceCodePro-Regular-tosf-ly1.vf) \
tex(SourceCodePro-Regular-tosf-ot1.tfm) \
tex(SourceCodePro-Regular-tosf-t1--base.tfm) \
tex(SourceCodePro-Regular-tosf-t1.tfm) \
tex(SourceCodePro-Regular-tosf-t1.vf) \
tex(SourceCodePro-Regular-tosf-t2a.tfm) \
tex(SourceCodePro-Regular-tosf-ts1--base.tfm) \
tex(SourceCodePro-Regular-tosf-ts1.tfm) \
tex(SourceCodePro-Regular-tosf-ts1.vf) \
tex(SourceCodePro-Semibold-dnom-ly1--base.tfm) \
tex(SourceCodePro-Semibold-dnom-ly1.tfm) \
tex(SourceCodePro-Semibold-dnom-ly1.vf) \
tex(SourceCodePro-Semibold-dnom-ot1.tfm) \
tex(SourceCodePro-Semibold-dnom-t1--base.tfm) \
tex(SourceCodePro-Semibold-dnom-t1.tfm) \
tex(SourceCodePro-Semibold-dnom-t1.vf) \
tex(SourceCodePro-Semibold-dnom-t2a.tfm) \
tex(SourceCodePro-Semibold-numr-ly1--base.tfm) \
tex(SourceCodePro-Semibold-numr-ly1.tfm) \
tex(SourceCodePro-Semibold-numr-ly1.vf) \
tex(SourceCodePro-Semibold-numr-ot1.tfm) \
tex(SourceCodePro-Semibold-numr-t1--base.tfm) \
tex(SourceCodePro-Semibold-numr-t1.tfm) \
tex(SourceCodePro-Semibold-numr-t1.vf) \
tex(SourceCodePro-Semibold-numr-t2a.tfm) \
tex(SourceCodePro-Semibold-sup-ly1--base.tfm) \
tex(SourceCodePro-Semibold-sup-ly1.tfm) \
tex(SourceCodePro-Semibold-sup-ly1.vf) \
tex(SourceCodePro-Semibold-sup-ot1.tfm) \
tex(SourceCodePro-Semibold-sup-t1--base.tfm) \
tex(SourceCodePro-Semibold-sup-t1.tfm) \
tex(SourceCodePro-Semibold-sup-t1.vf) \
tex(SourceCodePro-Semibold-sup-t2a.tfm) \
tex(SourceCodePro-Semibold-tlf-ly1--base.tfm) \
tex(SourceCodePro-Semibold-tlf-ly1.tfm) \
tex(SourceCodePro-Semibold-tlf-ly1.vf) \
tex(SourceCodePro-Semibold-tlf-ot1.tfm) \
tex(SourceCodePro-Semibold-tlf-t1--base.tfm) \
tex(SourceCodePro-Semibold-tlf-t1.tfm) \
tex(SourceCodePro-Semibold-tlf-t1.vf) \
tex(SourceCodePro-Semibold-tlf-t2a.tfm) \
tex(SourceCodePro-Semibold-tlf-ts1--base.tfm) \
tex(SourceCodePro-Semibold-tlf-ts1.tfm) \
tex(SourceCodePro-Semibold-tlf-ts1.vf) \
tex(SourceCodePro-Semibold-tosf-ly1--base.tfm) \
tex(SourceCodePro-Semibold-tosf-ly1.tfm) \
tex(SourceCodePro-Semibold-tosf-ly1.vf) \
tex(SourceCodePro-Semibold-tosf-ot1.tfm) \
tex(SourceCodePro-Semibold-tosf-t1--base.tfm) \
tex(SourceCodePro-Semibold-tosf-t1.tfm) \
tex(SourceCodePro-Semibold-tosf-t1.vf) \
tex(SourceCodePro-Semibold-tosf-t2a.tfm) \
tex(SourceCodePro-Semibold-tosf-ts1--base.tfm) \
tex(SourceCodePro-Semibold-tosf-ts1.tfm) \
tex(SourceCodePro-Semibold-tosf-ts1.vf) \
tex(SourceCodePro-SemiboldIt-dnom-ly1--base.tfm) \
tex(SourceCodePro-SemiboldIt-dnom-ly1.tfm) \
tex(SourceCodePro-SemiboldIt-dnom-ly1.vf) \
tex(SourceCodePro-SemiboldIt-dnom-ot1.tfm) \
tex(SourceCodePro-SemiboldIt-dnom-t1--base.tfm) \
tex(SourceCodePro-SemiboldIt-dnom-t1.tfm) \
tex(SourceCodePro-SemiboldIt-dnom-t1.vf) \
tex(SourceCodePro-SemiboldIt-dnom-t2a.tfm) \
tex(SourceCodePro-SemiboldIt-numr-ly1--base.tfm) \
tex(SourceCodePro-SemiboldIt-numr-ly1.tfm) \
tex(SourceCodePro-SemiboldIt-numr-ly1.vf) \
tex(SourceCodePro-SemiboldIt-numr-ot1.tfm) \
tex(SourceCodePro-SemiboldIt-numr-t1--base.tfm) \
tex(SourceCodePro-SemiboldIt-numr-t1.tfm) \
tex(SourceCodePro-SemiboldIt-numr-t1.vf) \
tex(SourceCodePro-SemiboldIt-numr-t2a.tfm) \
tex(SourceCodePro-SemiboldIt-sup-ly1--base.tfm) \
tex(SourceCodePro-SemiboldIt-sup-ly1.tfm) \
tex(SourceCodePro-SemiboldIt-sup-ly1.vf) \
tex(SourceCodePro-SemiboldIt-sup-ot1.tfm) \
tex(SourceCodePro-SemiboldIt-sup-t1--base.tfm) \
tex(SourceCodePro-SemiboldIt-sup-t1.tfm) \
tex(SourceCodePro-SemiboldIt-sup-t1.vf) \
tex(SourceCodePro-SemiboldIt-sup-t2a.tfm) \
tex(SourceCodePro-SemiboldIt-tlf-ly1--base.tfm) \
tex(SourceCodePro-SemiboldIt-tlf-ly1.tfm) \
tex(SourceCodePro-SemiboldIt-tlf-ly1.vf) \
tex(SourceCodePro-SemiboldIt-tlf-ot1.tfm) \
tex(SourceCodePro-SemiboldIt-tlf-t1--base.tfm) \
tex(SourceCodePro-SemiboldIt-tlf-t1.tfm) \
tex(SourceCodePro-SemiboldIt-tlf-t1.vf) \
tex(SourceCodePro-SemiboldIt-tlf-t2a.tfm) \
tex(SourceCodePro-SemiboldIt-tlf-ts1--base.tfm) \
tex(SourceCodePro-SemiboldIt-tlf-ts1.tfm) \
tex(SourceCodePro-SemiboldIt-tlf-ts1.vf) \
tex(SourceCodePro-SemiboldIt-tosf-ly1--base.tfm) \
tex(SourceCodePro-SemiboldIt-tosf-ly1.tfm) \
tex(SourceCodePro-SemiboldIt-tosf-ly1.vf) \
tex(SourceCodePro-SemiboldIt-tosf-ot1.tfm) \
tex(SourceCodePro-SemiboldIt-tosf-t1--base.tfm) \
tex(SourceCodePro-SemiboldIt-tosf-t1.tfm) \
tex(SourceCodePro-SemiboldIt-tosf-t1.vf) \
tex(SourceCodePro-SemiboldIt-tosf-t2a.tfm) \
tex(SourceCodePro-SemiboldIt-tosf-ts1--base.tfm) \
tex(SourceCodePro-SemiboldIt-tosf-ts1.tfm) \
tex(SourceCodePro-SemiboldIt-tosf-ts1.vf) \
tex(SourceCodePro.map) \
tex(T1SourceCodePro-Dnom.fd) \
tex(T1SourceCodePro-Numr.fd) \
tex(T1SourceCodePro-Sup.fd) \
tex(T1SourceCodePro-TLF.fd) \
tex(T1SourceCodePro-TOsF.fd) \
tex(T2ASourceCodePro-Dnom.fd) \
tex(T2ASourceCodePro-Numr.fd) \
tex(T2ASourceCodePro-Sup.fd) \
tex(T2ASourceCodePro-TLF.fd) \
tex(T2ASourceCodePro-TOsF.fd) \
tex(TS1SourceCodePro-TLF.fd) \
tex(TS1SourceCodePro-TOsF.fd) \
tex(a_3iph7b.enc) \
tex(a_4bagdb.enc) \
tex(a_4jrrta.enc) \
tex(a_6samag.enc) \
tex(a_beydf2.enc) \
tex(a_bzs6pp.enc) \
tex(a_ciozbc.enc) \
tex(a_cy5ftw.enc) \
tex(a_d56bnw.enc) \
tex(a_fhxzui.enc) \
tex(a_fnt2zo.enc) \
tex(a_fy4e5k.enc) \
tex(a_gog54w.enc) \
tex(a_gufhru.enc) \
tex(a_h3vs4v.enc) \
tex(a_j24bgz.enc) \
tex(a_jjp77t.enc) \
tex(a_ljusoa.enc) \
tex(a_lutrty.enc) \
tex(a_lxssho.enc) \
tex(a_mjxvy6.enc) \
tex(a_n5gv3r.enc) \
tex(a_npftpj.enc) \
tex(a_o4vjd2.enc) \
tex(a_pyiqqv.enc) \
tex(a_snirjt.enc) \
tex(a_tadnvb.enc) \
tex(a_uio74x.enc) \
tex(a_v5qca6.enc) \
tex(a_xmlzny.enc) \
tex(a_yyete5.enc) \
tex(sourcecodepro-type1-autoinst.sty) \
tex(sourcecodepro.sty) \
texlive-sourcecodepro"
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
tex(mweights.sty) \
tex(textcomp.sty) \
tex(updmap.cfg) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-sourcecodepro-fonts"

inherit rpm
