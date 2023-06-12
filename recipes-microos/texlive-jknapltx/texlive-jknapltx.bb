SUMMARY = "Miscellaneous packages by Joerg Knappen"
DESCRIPTION = "Miscellaneous macros by Jorg Knappen, including: represent \
counters in greek; Maxwell's non-commutative division; \
latin1jk, latin2jk and latin3jk, which are their inputenc \
definition files that allow verbatim input in the respective \
ISO Latin codes; blackboard bold fonts in maths; use of RSFS \
fonts in maths; extra alignments for \\parboxes; swap Roman and \
Sans fonts; transliterate semitic languages; patches to make \
(La)TeX formulae embeddable in SGML; use maths 'minus' in text \
as appropriate; simple Young tableaux."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn19440"

RPM_NAME = "texlive-jknapltx-2023.201.svn19440-55.1.noarch.rpm"
RPM_HASH = "3eb94c6742fb4f38c31a46e9c9ce58650e8ff8e7be7ae6dd3b46feefb09b4c9ca5731aa625f18b2ae56c303a280f3563cc46f33edaf34bd97824723198192142"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(greekctr.sty) \
tex(holtpolt.sty) \
tex(latin1jk.def) \
tex(latin2jk.def) \
tex(latin3jk.def) \
tex(mathbbol.sty) \
tex(mathrsfs.sty) \
tex(parboxx.sty) \
tex(sans.sty) \
tex(semtrans.sty) \
tex(sgmlcmpt.sty) \
tex(smartmn.sty) \
tex(tccompat.sty) \
tex(ursfs.fd) \
tex(ustmary.fd) \
tex(young.sty) \
texlive-jknapltx"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(graphicx.sty) \
tex(inputenc.sty) \
tex(textcomp.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
