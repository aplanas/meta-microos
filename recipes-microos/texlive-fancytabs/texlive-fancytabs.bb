SUMMARY = "Fancy page border tabs"
DESCRIPTION = "The package can typeset tabs on the side of a page. It requires \
TikZ from the pgf bundle."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.9svn41549"

RPM_NAME = "texlive-fancytabs-2023.201.1.9svn41549-52.1.noarch.rpm"
RPM_HASH = "9da1a40f0e1ed20d64bb2c72599d732d8ff865bf87e94d6882a3f27d60ffcd13208e68cc76e1eee54db9c008a92c243bac0f0e62c8f4bfee1f66772b82587aad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(fancytabs.sty) texlive-fancytabs"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(etoolbox.sty) tex(tikz.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
