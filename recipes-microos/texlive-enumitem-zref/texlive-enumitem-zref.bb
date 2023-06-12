SUMMARY = "Extended references to items for enumitem package"
DESCRIPTION = "The package is a companion for the enumitem package; it makes \
it possible to reference any item in lists formatted by \
enumitem lists, viz., enumerated, itemize and description \
lists, and any list defined (or customised) with \\newlist or \
\\setlist. References may be typeset differently with \
options/properties and even arbitrary text. With hyperref, \
anchors are added for each item to enable hyperlinks within the \
document or even to external documents. Three schemes are \
provided to make reference names (including the standard \\label \
command)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.8svn21472"

RPM_NAME = "texlive-enumitem-zref-2023.201.1.8svn21472-53.1.noarch.rpm"
RPM_HASH = "5d0f22b332792dc1ed46fb22bb6bd59eb89b90eec50ddfb1d6e6309e1b8eec1bcad87397f56dc7ff0e165a39a0649d752892aeace0ae4fef5aa7cd8779179c9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(enumitem-zref.sty) \
texlive-enumitem-zref"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(alphalph.sty) \
tex(engrec.sty) \
tex(enumitem.sty) \
tex(etoolbox.sty) \
tex(gettitlestring.sty) \
tex(greekctr.sty) \
tex(kvoptions.sty) \
tex(ltxcmds.sty) \
tex(zref-counter.sty) \
tex(zref-user.sty) \
tex(zref.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
