SUMMARY = "Prevent paragraph indentation after environments or macros"
DESCRIPTION = "The package, as the name suggests, supplies tools to \
automatically suppress indentations in following paragraphs, \
specifically those following a particular macro or environment."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.00svn59195"

RPM_NAME = "texlive-noindentafter-2023.201.1.00svn59195-54.1.noarch.rpm"
RPM_HASH = "947a422cf5a511240a3c711c164541760855f2ade38b4603bc88fe4b975c6e0417a2a3cfbef056b3a3b8ee686ae393be08c754f22999752625d61c02e15c6f8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(noindentafter.sty) texlive-noindentafter"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(etoolbox.sty) tex(xpatch.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
