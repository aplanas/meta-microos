SUMMARY = "A summary of PicTeX commands"
DESCRIPTION = "The document summarises the commands of PicTeX. While it is no \
substitute for the PicTeX manual itself (available from \
Personal TeX inc.), the document is a useful aide-memoire for \
those who have read the manual."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn24965"

RPM_NAME = "texlive-pictexsum-2023.201.svn24965-51.1.noarch.rpm"
RPM_HASH = "fc534a5f480f3e4fd065c75a72ee69f2ae2b93e53a8e33233e3bc825ede04b78d16a4dad73d0da9338ed946bfb91be7943e895456b5ed59a9035bc8c0012ada5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pictexsum"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
