SUMMARY = "Documentation for texlive-aguplus"
DESCRIPTION = "This package includes the documentation for texlive-aguplus"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6bsvn17156"

RPM_NAME = "texlive-aguplus-doc-2023.201.1.6bsvn17156-54.1.noarch.rpm"
RPM_HASH = "eb0f2f025d63545cb3edb604f4b1103b6c4fd8998c8d9c3722c87e77b87c9aa471733ebe2bb583e8ab9b4bdbc9c04ff6aa3a1ed8e5be6213f4982c95ec76f56d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-aguplus-doc"
RDEPENDS:${PN} += ""

inherit rpm
