SUMMARY = "Visualise the vocal tract using LaTeX and PSTricks"
DESCRIPTION = "The package enables the user to visualise the vocal tract. The \
vocal tract (in the package) is manipulated by a vector of \
articulation parameters according to the S. Maeda model. \
Animation may be achieved by providing a sequence of vectors \
over time (e.g., from Matlab). A sequence of vectors for \
certain German phonemes is embedded in the package, which \
allows for animation when no other vector is available. The \
package's graphics are produced using pstricks."
LICENSE = "LPPL-1.0"

PV = "2023.201.1svn25629"

RPM_NAME = "texlive-vocaltract-2023.201.1svn25629-53.1.noarch.rpm"
RPM_HASH = "a2ca7f6e321ea58551a660a108d689f2739ad4dae9cd0a92f86c7262e7997b3d05d0944ddb3bcbe5af74a79fe7f7045a94d229e6c25393e9f035ab9fec232cb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(VocalTract.sty) texlive-vocaltract"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(animate.sty) tex(arrayjob.sty) tex(color.sty) tex(fltpoint.sty) tex(fp.sty) tex(ifthen.sty) tex(multido.sty) tex(multimedia.sty) tex(pst-coil.sty) tex(pstricks.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
