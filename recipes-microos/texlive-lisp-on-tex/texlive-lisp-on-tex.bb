SUMMARY = "Execute LISP code in a LaTeX document"
DESCRIPTION = "The package provides a LISP interpreter written using TeX \
macros; it is provided as a LaTeX package. The interpreter \
static scoping, dynamic typing, and eager evaluation."
LICENSE = "BSD-3-Clause"

PV = "2023.201.2.0svn38722"

RPM_NAME = "texlive-lisp-on-tex-2023.201.2.0svn38722-54.1.noarch.rpm"
RPM_HASH = "f8d110b92132ed857ea9b1e595f70523b22fae27a2ee58f484c0402a8c5fa2787fae12deb55355198e4e939056afcd60280adb6cd22039b80169a2d4a6ba6cdb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(lisp-arith.sty) tex(lisp-gc.sty) tex(lisp-latexutil.sty) tex(lisp-mod-fpnum.sty) tex(lisp-mod-l3regex.sty) tex(lisp-on-tex.sty) tex(lisp-prim.sty) tex(lisp-read.sty) tex(lisp-simple-alloc.sty) tex(lisp-string.sty) tex(lisp-util.sty) texlive-lisp-on-tex"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(xkeyval.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
