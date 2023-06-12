SUMMARY = "Support for CJK documents in XeLaTeX"
DESCRIPTION = "A LaTeX package for typesetting CJK documents in the way users \
have become used to, in the CJK package. The package requires a \
current version of xtemplate (and hence of the current LaTeX3 \
development environment)."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.9.1svn64059"

RPM_NAME = "texlive-xecjk-2023.201.3.9.1svn64059-52.1.noarch.rpm"
RPM_HASH = "3a63ad0091519eba627001ace82325b48e7fdadd0ab943a8f38959a43ce0b212a43963202ffc77184c03582ffafd27e1aed56b64cc48a7e74405aa08272f98ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(full-stop.map) \
tex(fullwidth-stop.map) \
tex(han-simp.map) \
tex(han-trad.map) \
tex(xeCJK-listings.sty) \
tex(xeCJK.cfg) \
tex(xeCJK.sty) \
tex(xeCJKfntef.sty) \
tex(xunicode-addon.sty) \
tex(xunicode-extra.def) \
texlive-xecjk"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ctexhook.sty) \
tex(expl3.sty) \
tex(fontspec.sty) \
tex(l3keys2e.sty) \
tex(listings.sty) \
tex(ulem.sty) \
tex(xparse.sty) \
tex(xtemplate.sty) \
tex(xunicode.sty) \
texlive \
texlive-ctex \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
