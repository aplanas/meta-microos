SUMMARY = "Documentation for texlive-thesis-gwu"
DESCRIPTION = "This package includes the documentation for texlive-thesis-gwu"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.7.0svn54287"

RPM_NAME = "texlive-thesis-gwu-doc-2023.201.1.7.0svn54287-54.1.noarch.rpm"
RPM_HASH = "d3972452510dea37453557d4736095d5966db2a529b3cc1eb8aa8c419d3fa1f2871b6e7d37c70fa038e836601e8bb715f7644a686e81974f38df3326f776300f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-thesis-gwu-doc"
RDEPENDS:${PN} += ""

inherit rpm
