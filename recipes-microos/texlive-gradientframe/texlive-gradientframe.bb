SUMMARY = "Simple gradient frames around objects"
DESCRIPTION = "The package provides a means of drawing graded frames around \
objects. The gradients of the frames are drawn using the color \
package."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn21387"

RPM_NAME = "texlive-gradientframe-2023.201.0.0.2svn21387-53.1.noarch.rpm"
RPM_HASH = "809c00aca97974c32f30b63d0373a245f83cc1fa8c155d0a9bf6e777bdfb3319685f5664d400a97b55431a7dbd5fa73a5e680e88f64a7c624a2a42eb8d92ce95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(gradientframe.sty) texlive-gradientframe"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(color.sty) tex(keyval.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
