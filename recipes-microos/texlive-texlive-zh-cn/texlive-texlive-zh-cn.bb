SUMMARY = "TeX Live manual (Chinese)"
DESCRIPTION = "The texlive-zh-cn package"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54490"

RPM_NAME = "texlive-texlive-zh-cn-2023.201.svn54490-54.1.noarch.rpm"
RPM_HASH = "643240ac13731991ea7574c5747fb47f952db30673db6bcdeebc93d3206b9261f9f0064ec23a814aa62dea9a7fa7d048477369e678addccef6cc30960076e7e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texlive-zh-cn"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
