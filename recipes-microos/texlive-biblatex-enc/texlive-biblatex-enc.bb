SUMMARY = "BibLaTeX style for the Ecole nationale des chartes (Paris)"
DESCRIPTION = "This package provides a citation and bibliography style for use \
with BibLaTeX. It conforms to the bibliographic standards used \
at the Ecole nationale des chartes (Paris), and may be suitable \
for a more general use in historical and philological works. \
The package was initially derived from historische-zeitschrift, \
with the necessary modifications."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn44627"

RPM_NAME = "texlive-biblatex-enc-2023.201.1.0svn44627-53.1.noarch.rpm"
RPM_HASH = "0f20668b24d6fed4f2d689df55accc3f474f5c2d732409e6282ef1628f427c1887a32cc6b68af11db07829bea23981e855277ec9814c5ce6c0c64fd3cc89aa68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(enc.bbx) \
tex(enc.cbx) \
texlive-biblatex-enc"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
