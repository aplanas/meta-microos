SUMMARY = "Macros for introductory physics and astronomy"
DESCRIPTION = "The package contains commands for students and teachers of \
introductory physics. Commands for physical quantities \
intelligently handle SI units so the user need not do so. There \
are other features that should make LaTeX easy for introductory \
physics students."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.1.0svn61764"

RPM_NAME = "texlive-mandi-2023.201.3.1.0svn61764-52.1.noarch.rpm"
RPM_HASH = "1fbedf9bd75e7367dd2c7ec4cba4a352ec882e7b06a84d807c7fbc586ec4d1a622dc6d4103c1145dba525db7fc70f22b2c2c13ce716f841e7d146a4f1c8b5ef9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(mandi.sty) \
tex(mandiexp.sty) \
tex(mandistudent.sty) \
texlive-mandi"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsmath.sty) \
tex(array.sty) \
tex(enumitem.sty) \
tex(eso-pic.sty) \
tex(esvect.sty) \
tex(hyperref.sty) \
tex(iftex.sty) \
tex(makebox.sty) \
tex(mathtools.sty) \
tex(nicematrix.sty) \
tex(pgfopts.sty) \
tex(qrcode.sty) \
tex(tcolorbox.sty) \
tex(tensor.sty) \
tex(tikz.sty) \
tex(unicode-math.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
