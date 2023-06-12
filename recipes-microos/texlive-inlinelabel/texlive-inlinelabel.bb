SUMMARY = "Assign equation numbers to inline equations"
DESCRIPTION = "This package can assign equation numbers to inline equations. \
When Japanese is supported, you can switch to circled equation \
numbers."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2.1svn63853"

RPM_NAME = "texlive-inlinelabel-2023.201.1.2.1svn63853-52.1.noarch.rpm"
RPM_HASH = "8951dd15fd4622284e0f27634a1770f5bf1ba07a7c0c341d05b60791e52a7f20610c5c2308b51526d09b1c08447af8bfea5a11283a9632404a9bd9426db3ac3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(inlinelabel.sty) \
texlive-inlinelabel"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsmath.sty) \
tex(luatexja-otf.sty) \
tex(otf.sty) \
tex(refcount.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
