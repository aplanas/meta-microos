SUMMARY = "Hypertext cross referencing"
DESCRIPTION = "Redefines LaTeX cross-referencing commands to insert \\special \
commands for HyperTeX dvi viewers, such as recent versions of \
xdvi. The package is now largely superseded by hyperref."
LICENSE = "LPPL-1.0"

PV = "2023.201.4.2dsvn17357"

RPM_NAME = "texlive-hyper-2023.201.4.2dsvn17357-52.1.noarch.rpm"
RPM_HASH = "07ea132a967a35c6776b4a1632f39cc7d870a9d2374c759febbbd965e52633020ec57a634542e610e5508b6903ec0a8246c1ebf67955b6fb6313cc90cd18927d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hxt-bc.sty) \
tex(hyper.sty) \
texlive-hyper"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(color.sty) \
tex(defpattern.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
