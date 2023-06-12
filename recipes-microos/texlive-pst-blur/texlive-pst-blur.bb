SUMMARY = "PSTricks package for 'blurred' shadows"
DESCRIPTION = "Pst-blur is a package built for use with PSTricks. It provides \
macros that apply blurring to the normal shadow function of \
PSTricks."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn15878"

RPM_NAME = "texlive-pst-blur-2023.201.2.0svn15878-52.1.noarch.rpm"
RPM_HASH = "6532868436a5a1bbf580e9037e0cab1f96c92a3043e1b4fc5b2f1a2651124622d8e1d46a0ba8a5b5d198aebf865363ee94976c3e2a354c90466740d5a99620d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-blur.sty) \
tex(pst-blur.tex) \
texlive-pst-blur"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(pstricks.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
