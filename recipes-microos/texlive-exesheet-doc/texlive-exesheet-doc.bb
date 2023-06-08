SUMMARY = "Documentation for texlive-exesheet"
DESCRIPTION = "This package includes the documentation for texlive-exesheet"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn65577"

RPM_NAME = "texlive-exesheet-doc-2023.201.2.0svn65577-52.1.noarch.rpm"
RPM_HASH = "3ae0739cce052aa4f2872cd47bf1b959ba075e09ddc22aa4b6e13ae07617cdf7c40cf874fd1abd72cf397b70a4ec25eb53116b92e1df55e1709512869f204a5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-exesheet-doc"
RDEPENDS:${PN} += ""

inherit rpm
