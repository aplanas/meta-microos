SUMMARY = "Macros for IEEE conference proceedings"
DESCRIPTION = "The IEEEconf class implements the formatting dictated by the \
IEEE Computer Society Press for conference proceedings."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn59665"

RPM_NAME = "texlive-ieeeconf-2023.201.1.4svn59665-52.1.noarch.rpm"
RPM_HASH = "9c56d1efa0c659b82bb789d61195d61e5d1f02b7067d1a0f6d23b3aa12b38fce4a449b862e9b597c755d117531bee8bb64676dca9b3e95095c92d2066733d5f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(IEEEconf.cls) texlive-ieeeconf"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(array.sty) tex(article.cls) tex(courier.sty) tex(helvet.sty) tex(mathptmx.sty) tex(titlesec.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
