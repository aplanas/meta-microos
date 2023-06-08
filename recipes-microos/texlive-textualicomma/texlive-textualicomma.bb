SUMMARY = "Use the textual comma character as decimal separator in math mode"
DESCRIPTION = "The package is based on the icomma package, and intended as a \
solution for situations where the text comma character discerns \
from the math comma character, e. g. when fonts whithout math \
support are involved. Escaping to text mode every time a comma \
is used in math mode may slow down the compilation process."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn48474"

RPM_NAME = "texlive-textualicomma-2023.201.1.1svn48474-54.1.noarch.rpm"
RPM_HASH = "a35ae36f69e8235b5d6473023be0c9f07c688c9db4db01da822ae60c7a4d98ba2edaca46e59b895d1e8a6fc6fd0793c4b73dae47025cf61a99103374d70096fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(textualicomma.sty) texlive-textualicomma"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(amstext.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
