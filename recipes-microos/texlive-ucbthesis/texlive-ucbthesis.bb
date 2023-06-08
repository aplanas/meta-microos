SUMMARY = "Thesis and dissertation class supporting UCB requirements"
DESCRIPTION = "The class provides the necessary framework for electronic \
submission of Masters theses and Ph.D. dissertations at the \
University of California, Berkeley. It is based on the memoir \
class."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.6svn51690"

RPM_NAME = "texlive-ucbthesis-2023.201.3.6svn51690-52.1.noarch.rpm"
RPM_HASH = "4c89b584f30f761be0a5c718b5da88ac7d34c539d305494a3e68ddd7c082f643e5eabd63e07d6d18a66fe0cd0372f42c0bb74b312c6617610f64750dffa4e3db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ucbthesis.cls) texlive-ucbthesis"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(memoir.cls) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
