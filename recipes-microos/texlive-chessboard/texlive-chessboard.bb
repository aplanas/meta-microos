SUMMARY = "Print chess boards"
DESCRIPTION = "This package offers commands to print chessboards. It can print \
partial boards, hide pieces and fields, color the boards and \
put various marks on the board. It has a lot of options to \
place pieces on the board. Using exotic pieces (e.g., for fairy \
chess) is possible. The documentation includes an example of an \
animated chessboard, for those whose PDF viewer can display \
animations."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.9svn56833"

RPM_NAME = "texlive-chessboard-2023.201.1.9svn56833-53.1.noarch.rpm"
RPM_HASH = "c162a9acb927cdfe03854898998425f1ae0951298eac4e3d796abec87db924b62db24dbcd567a1c8e92f838507c6dae8580be9b0fd300e55dc6af77faaa5a9ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(UF-chessboard-documentation.sty) \
tex(chessboard-keys-main.sty) \
tex(chessboard-keys-pgf.sty) \
tex(chessboard-pgf.sty) \
tex(chessboard.sty) \
texlive-chessboard"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(animate.sty) \
tex(array.sty) \
tex(babel.sty) \
tex(booktabs.sty) \
tex(caption.sty) \
tex(chessfss.sty) \
tex(csquotes.sty) \
tex(doc.sty) \
tex(etoolbox.sty) \
tex(fancyhdr.sty) \
tex(fourier.sty) \
tex(helvet.sty) \
tex(ifluatex.sty) \
tex(ifpdf.sty) \
tex(makeidx.sty) \
tex(microtype.sty) \
tex(pst-node.sty) \
tex(showexpl.sty) \
tex(tikz.sty) \
tex(xcolor.sty) \
tex(xifthen.sty) \
tex(xkeyval.sty) \
tex(xspace.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
