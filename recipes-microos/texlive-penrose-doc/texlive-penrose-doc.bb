SUMMARY = "Documentation for texlive-penrose"
DESCRIPTION = "This package includes the documentation for texlive-penrose"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn57508"

RPM_NAME = "texlive-penrose-doc-2023.201.1.4svn57508-51.1.noarch.rpm"
RPM_HASH = "549c62895dd6865b436824a0ba3c1faad895e78bfa99e4bd24ee725d05023c3f68ce1077b571d4fda3d1b9a95f92de23349b0f5162ea88a095d3c096d3895a3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-penrose-doc"
RDEPENDS:${PN} += ""

inherit rpm
