SUMMARY = "Documentation for texlive-isomath"
DESCRIPTION = "This package includes the documentation for texlive-isomath"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.6.1svn27654"

RPM_NAME = "texlive-isomath-doc-2023.201.0.0.6.1svn27654-55.1.noarch.rpm"
RPM_HASH = "8b546eb81e6f9634732a4981526e0f4fd5cfc06a5941fac7cba3eb25ac822b65fa4a1d8647af5a86caaa87383816c7c04d3c2d5c9092dd47538467a2811efd19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-isomath-doc"
RDEPENDS:${PN} += ""

inherit rpm
