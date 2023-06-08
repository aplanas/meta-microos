SUMMARY = "Documentation for texlive-gfsbaskerville"
DESCRIPTION = "This package includes the documentation for texlive-gfsbaskerville"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn19440"

RPM_NAME = "texlive-gfsbaskerville-doc-2023.201.1.0svn19440-52.1.noarch.rpm"
RPM_HASH = "7dc35c9738cc709ca72147eca99d866ab576eaf741c4631eedc66e09f1e92f0dfcdfad51143f4c6b7f88cd7e88f1e7226da110190aefe99d2c4ee8d0e688bb3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gfsbaskerville-doc"
RDEPENDS:${PN} += ""

inherit rpm
