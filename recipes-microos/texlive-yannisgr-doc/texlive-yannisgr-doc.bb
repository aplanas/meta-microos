SUMMARY = "Documentation for texlive-yannisgr"
DESCRIPTION = "This package includes the documentation for texlive-yannisgr"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn22613"

RPM_NAME = "texlive-yannisgr-doc-2023.201.svn22613-52.1.noarch.rpm"
RPM_HASH = "a06a3d73b35b892f208974b842e838419d9da21b5a0d694146c09ede21aa7096abc5d3dc56625f24045263d8113d9962506f648fd30b61e653907a08958cc4cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yannisgr-doc"
RDEPENDS:${PN} += ""

inherit rpm
