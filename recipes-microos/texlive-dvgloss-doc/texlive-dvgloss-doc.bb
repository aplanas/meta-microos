SUMMARY = "Documentation for texlive-dvgloss"
DESCRIPTION = "This package includes the documentation for texlive-dvgloss"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn29103"

RPM_NAME = "texlive-dvgloss-doc-2023.201.0.0.1svn29103-53.1.noarch.rpm"
RPM_HASH = "2a3e29b75e8621d68e6f8b99a67fb81bfa43b830421f98b7a312a52fd97eae939cc705b32babe851fb64290c3b34464e3986371fc0ef954596e0b4c58e3f60c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dvgloss-doc"
RDEPENDS:${PN} += ""

inherit rpm
