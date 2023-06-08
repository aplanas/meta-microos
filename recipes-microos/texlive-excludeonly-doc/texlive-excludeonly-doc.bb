SUMMARY = "Documentation for texlive-excludeonly"
DESCRIPTION = "This package includes the documentation for texlive-excludeonly"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.0svn17262"

RPM_NAME = "texlive-excludeonly-doc-2023.201.1.0svn17262-52.1.noarch.rpm"
RPM_HASH = "ea093b4907b573c177e82a02cff05d6499aa3c678d0385cac59289578f01f0615206e7d24a62fce06d70f20d7326c344b2fc3d976d12516479d60173fd60edda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-excludeonly-doc"
RDEPENDS:${PN} += ""

inherit rpm
