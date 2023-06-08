SUMMARY = "Documentation for texlive-mecaso"
DESCRIPTION = "This package includes the documentation for texlive-mecaso"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0svn60346"

RPM_NAME = "texlive-mecaso-doc-2023.201.1.0svn60346-52.1.noarch.rpm"
RPM_HASH = "57309b3a6ea3758bf561c9ace0eb13f1631d21a83db624b3cd094577d19a752b86b9f2a678c23f8a1699ceae18d62e5e670a793bb2ccbf2c99627bed5a02b3e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-mecaso-doc:fr) texlive-mecaso-doc"
RDEPENDS:${PN} += ""

inherit rpm
