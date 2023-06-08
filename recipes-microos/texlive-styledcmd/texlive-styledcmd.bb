SUMMARY = "Handling multiple versions of user-defined macros"
DESCRIPTION = "This package allows creating and maintaining different versions \
of the same command, in order to choose the best option for \
every document. This includes expandable and protected \
commands."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.0svn65262"

RPM_NAME = "texlive-styledcmd-2023.201.2.0svn65262-57.1.noarch.rpm"
RPM_HASH = "669a8a8f3ed7f9585ec7ad5bcc61c2c803dbab0ebd34a0d9400556f180971427b30c0bc28943a0bc97dd614260230b359aad9a965646908830232744a9ab35bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(styledcmd.sty) texlive-styledcmd"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(expl3.sty) tex(lt3rawobjects.sty) tex(xparse.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
