SUMMARY = "Documentation for texlive-mparrows"
DESCRIPTION = "This package includes the documentation for texlive-mparrows"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.0.0.1svn39729"

RPM_NAME = "texlive-mparrows-doc-2023.201.0.0.1svn39729-54.1.noarch.rpm"
RPM_HASH = "0c90e52c06d0893fe5de65aae2278b59b94f7a28e129e283b3d0119aa2dc54ec937153cfa543ee8f24c778f4039eb29b44464df9acd8febd948c32b0b8a5b03c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mparrows-doc"
RDEPENDS:${PN} += ""

inherit rpm
