SUMMARY = "Documentation for texlive-geometry"
DESCRIPTION = "This package includes the documentation for texlive-geometry"
LICENSE = "LPPL-1.0"

PV = "2023.201.5.9svn61719"

RPM_NAME = "texlive-geometry-doc-2023.201.5.9svn61719-52.1.noarch.rpm"
RPM_HASH = "65e51d43d01aaf8ae14b400e919ecb9c58a7caf5fcbdedf5d44bad3065da0904d35ccca355343d4d7c3a36f6bf2e4f040b13d47b4355df5104a3bda4fa3f93ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-geometry-doc:de;en) texlive-geometry-doc"
RDEPENDS:${PN} += ""

inherit rpm
