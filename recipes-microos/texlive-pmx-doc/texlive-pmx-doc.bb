SUMMARY = "Documentation for texlive-pmx"
DESCRIPTION = "This package includes the documentation for texlive-pmx"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.3.00svn65926"

RPM_NAME = "texlive-pmx-doc-2023.201.3.00svn65926-52.1.noarch.rpm"
RPM_HASH = "ca56a40c7962b797138d633e22269111c49c0a225a2824cd3ae43a6c0f059b32430e854b64ee2201e9dce54abffaefc67799f47bd19fac1854888fe32ab9d9a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(pmxab.1) \
man(scor2prt.1) \
texlive-pmx-doc"
RDEPENDS:${PN} += ""

inherit rpm
