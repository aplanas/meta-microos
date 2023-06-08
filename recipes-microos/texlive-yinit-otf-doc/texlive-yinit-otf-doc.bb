SUMMARY = "Documentation for texlive-yinit-otf"
DESCRIPTION = "This package includes the documentation for texlive-yinit-otf"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.0svn40207"

RPM_NAME = "texlive-yinit-otf-doc-2023.201.1.0svn40207-52.1.noarch.rpm"
RPM_HASH = "f3f4bae70a9647e77b4a6d167b3233cf4fc21ea4d561f3a1b139d6e76665b252af75fd4c25f4fa3ca3237673c3926aec8628070bb8c5e47111e799505155dd44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yinit-otf-doc"
RDEPENDS:${PN} += ""

inherit rpm
