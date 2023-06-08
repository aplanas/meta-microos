SUMMARY = "Documentation for texlive-path"
DESCRIPTION = "This package includes the documentation for texlive-path"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.05svn22045"

RPM_NAME = "texlive-path-doc-2023.201.3.05svn22045-51.1.noarch.rpm"
RPM_HASH = "47a5f2186904b632912385b1c71b0b64e4d567c47ca0922c08a5510437e19d7445c0e21aa3b5d3980f4c5321293264cbecd6bcd64a724bea4997dcb6d86e9872"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-path-doc"
RDEPENDS:${PN} += ""

inherit rpm
