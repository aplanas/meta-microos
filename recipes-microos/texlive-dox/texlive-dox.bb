SUMMARY = "Extend the doc package"
DESCRIPTION = "The doc package provides LaTeX developers with means to \
describe the usage and the definition of new macros and \
environments. However, there is no simple way to extend this \
functionality to other items (options or counters, for \
instance). The DoX package is designed to circumvent this \
limitation."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.4svn46011"

RPM_NAME = "texlive-dox-2023.201.2.4svn46011-52.1.noarch.rpm"
RPM_HASH = "705a8357a86b5c41ecce248939ae53073b4210f8e0c30f6a55d77adfe14505db1caacb70e532a49134ef8bfe844339399cf93647718260aae2430d24bb6b8854"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(dox.sty) texlive-dox"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(kvoptions.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
