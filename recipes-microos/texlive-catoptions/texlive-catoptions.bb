SUMMARY = "Preserving and recalling standard catcodes"
DESCRIPTION = "The package changes package loading internals so that all \
subsequently loaded packages can rely on normal/standard \
catcodes of all ASCII characters. The package defines canonical \
control sequences to represent all the visible ASCII \
characters. It also provides robust option parsing mechanisms \
(XDeclareOption, XExecuteOptions and XProcessOptions, which \
will be used by \\documentclass if the package has already been \
loaded). The package also provides a range of other TeX \
programming tools."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2.7hsvn35069"

RPM_NAME = "texlive-catoptions-2023.201.0.0.2.7hsvn35069-52.1.noarch.rpm"
RPM_HASH = "ad3e186e1cdc445600a616ec81d07277c65d2063b43e08a6a63b3cb4a2b83f9b719afe9fa0d79b91767418e1fd887c222d9a2abc6eebc6c26272bab2936557bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(catoptions-guide.cfg) tex(catoptions.sty) texlive-catoptions"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(pdftexcmds.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
