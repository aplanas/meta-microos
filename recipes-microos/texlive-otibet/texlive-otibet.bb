SUMMARY = "Support for Tibetan using Omega"
DESCRIPTION = "The otibet package"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn45777"

RPM_NAME = "texlive-otibet-2023.201.svn45777-54.1.noarch.rpm"
RPM_HASH = "7266b7d0d3cd9dc2fdd2dad1ba951d373212114ab8a9bc58426e4ab488441cf244587db82a4a5071f97de8277c7628b04e90dc838123f8b76873af5381ebb8a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ot1tib.fd) tex(otibet.sty) tex(otibet.tex) tex(t1tib.fd) tex(tibetan.tfm) texlive-otibet"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
