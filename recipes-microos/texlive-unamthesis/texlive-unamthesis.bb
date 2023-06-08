SUMMARY = "Style for Universidad Nacional Autonoma de Mexico theses"
DESCRIPTION = "The package provides a customisable format to typeset Theses \
according to the Universidad Nacional Autonoma de Mexico \
guidelines. Support for use in Scientific Workplace (SWP) 3.x \
is also provided. The bundle also includes an appropriate \
bibliographic style which enables the use of author-year \
schemes using the natbib package."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn43639"

RPM_NAME = "texlive-unamthesis-2023.201.2.1svn43639-53.1.noarch.rpm"
RPM_HASH = "c0ddc2403e7211bc70ce41c1091683574236257bd6ba1d35fb2df26bfc2181898191cd64951839ddd801e305ce6f723b7c65f49b6a0fc1b04eb8081c07cb200a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(UNAMThesis.sty) texlive-unamthesis"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(graphicx.sty) tex(setspace.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
