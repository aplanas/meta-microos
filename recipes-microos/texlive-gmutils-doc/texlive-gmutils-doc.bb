SUMMARY = "Documentation for texlive-gmutils"
DESCRIPTION = "This package includes the documentation for texlive-gmutils"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.996svn24287"

RPM_NAME = "texlive-gmutils-doc-2023.201.0.0.996svn24287-53.1.noarch.rpm"
RPM_HASH = "41f3fd3e927a8b0e1d44d96fadcdf7b78f57309ce7614100e20e5221a2d97738255097f2d8b38107d22d980850df5e066cf3b653818e77dda8a2d891dcef0bed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gmutils-doc"
RDEPENDS:${PN} += ""

inherit rpm
