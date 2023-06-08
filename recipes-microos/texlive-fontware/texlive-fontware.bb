SUMMARY = "Tools for virtual font metrics"
DESCRIPTION = "Virtual font metrics are usually created in a textual form, the \
Virtual Property List, but programs that use them need to use \
binary files (the Virtual Font and the TeX Font Metric). The \
present two programs translate between the two forms: - vptovf \
takes a VPL file and generates a VF file and a TFM file; - \
vftovp takes a VF file and a TFM file and generates a VPL file. \
The programs are to be found in every distribution of TeX."
LICENSE = "SUSE-TeX"

PV = "2023.201.svn66186"

RPM_NAME = "texlive-fontware-2023.201.svn66186-52.1.noarch.rpm"
RPM_HASH = "edbb8ba593c5bb3e286cdc17ffa874debfe95a6ca811ee9919f1c0fbad00500abef54b97a26f4928eb8065e79c1c93280ed655700ba9fd08f78561598833fb36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(pltotf.1) man(tftopl.1) man(vftovp.1) man(vptovf.1) texlive-fontware"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-fontware-bin texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
