SUMMARY = "Documentation for texlive-rec-thy"
DESCRIPTION = "This package includes the documentation for texlive-rec-thy"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.3.8.2svn63982"

RPM_NAME = "texlive-rec-thy-doc-2023.201.3.8.2svn63982-53.1.noarch.rpm"
RPM_HASH = "1c85348a49727126bd56f081dc3de12a6f4fec6efadd2bb9761fbf454252630609de73d4893c8f5245bbeb259212f0e86934caedc5f51d951261901406aa121e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rec-thy-doc"
RDEPENDS:${PN} += ""

inherit rpm
