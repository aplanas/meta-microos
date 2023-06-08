SUMMARY = "Documentation for texlive-gfdl"
DESCRIPTION = "This package includes the documentation for texlive-gfdl"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.1svn65415"

RPM_NAME = "texlive-gfdl-doc-2023.201.0.0.1svn65415-52.1.noarch.rpm"
RPM_HASH = "430fd08d5f7a98797216d137482a53378e60400f248eed925c3dd31e7f5df8b0c85140791cd570dea5956c7f98aafd0b7cc2369017c4b781578d77e39dcb8219"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gfdl-doc"
RDEPENDS:${PN} += ""

inherit rpm
