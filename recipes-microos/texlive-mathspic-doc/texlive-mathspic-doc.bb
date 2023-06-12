SUMMARY = "Documentation for texlive-mathspic"
DESCRIPTION = "This package includes the documentation for texlive-mathspic"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.13svn31957"

RPM_NAME = "texlive-mathspic-doc-2023.201.1.13svn31957-52.1.noarch.rpm"
RPM_HASH = "4b56e0e69bf3813974c9dcd33d3f2c2bdb3884994222dc9ee95977e9ede6becc5e8c281fd12c4e9346b9442620292c23ca413dd0f60af3a06ead19085a7fb30a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(mathspic.1) \
texlive-mathspic-doc"
RDEPENDS:${PN} += ""

inherit rpm
