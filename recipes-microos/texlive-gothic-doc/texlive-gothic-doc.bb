SUMMARY = "Documentation for texlive-gothic"
DESCRIPTION = "This package includes the documentation for texlive-gothic"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn49869"

RPM_NAME = "texlive-gothic-doc-2023.201.svn49869-53.1.noarch.rpm"
RPM_HASH = "0513049854de146caf1b24a9e352e4b0983334c3d6f02986c5a816f03c49e03d89c4057e0d2bd5754a3e12fd583ce18070cf23cf1bf7e8bb7a89181a039a4fe0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gothic-doc"
RDEPENDS:${PN} += ""

inherit rpm
