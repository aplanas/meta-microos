SUMMARY = "Documentation for texlive-forloop"
DESCRIPTION = "This package includes the documentation for texlive-forloop"
LICENSE = "LGPL-2.1-or-later"

PV = "2023.201.3.0svn15878"

RPM_NAME = "texlive-forloop-doc-2023.201.3.0svn15878-52.1.noarch.rpm"
RPM_HASH = "c3a83c5b60a431fdbe9bc7f4d5ec05f9a079253172422f0069a2494fd3c1600e4139bc70e5191cc428d5792a84ae27fe83987f6a978550d3e00bc2c73bbf53e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-forloop-doc"
RDEPENDS:${PN} += ""

inherit rpm
