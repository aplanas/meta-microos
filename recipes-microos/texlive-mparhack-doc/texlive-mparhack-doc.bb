SUMMARY = "Documentation for texlive-mparhack"
DESCRIPTION = "This package includes the documentation for texlive-mparhack"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.5svn59066"

RPM_NAME = "texlive-mparhack-doc-2023.201.1.5svn59066-54.1.noarch.rpm"
RPM_HASH = "074ff595000eee8a3d7ee5c4aa88c077cebebc0f725be92480f2ab3c5df5c6a3c76e0f990dfb1d6c097672919f905cd124fc3e26894e394b3b5944718e24cb08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mparhack-doc"
RDEPENDS:${PN} += ""

inherit rpm
