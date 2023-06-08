SUMMARY = "A thesis template package for Northwest A&F University, China"
DESCRIPTION = "This template supports doctoral and master dissertations and \
undergraduate theses in Chinese. With the help of modern LaTeX3 \
technology, nwafuthesis aims to create a simple interface, a \
normative format, as well as a hackable class for the users. At \
present, nwafuthesis only supports XeTeX and LuaTeX engines. \
nwafuthesis only allows UTF-8 encoding. nwafuthesis is based on \
the fduthesis template."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.15svn63438"

RPM_NAME = "texlive-nwafuthesis-2023.201.1.15svn63438-54.1.noarch.rpm"
RPM_HASH = "748adcd672339e0edd1a5e75c3db4a3b15430c65436ae3af6922355550129a361cc47fe73dd9b019bedc4b68212956f689bd927834334a2e34b6798cac2d8035"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(nwafuthesis.cls) texlive-nwafuthesis"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(biblatex.sty) tex(expl3.sty) tex(hyperref.sty) tex(l3keys2e.sty) tex(pifont.sty) tex(xtemplate.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
