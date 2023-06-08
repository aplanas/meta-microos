SUMMARY = "Documentation for texlive-tocdata"
DESCRIPTION = "This package includes the documentation for texlive-tocdata"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.05svn65451"

RPM_NAME = "texlive-tocdata-doc-2023.201.2.05svn65451-52.1.noarch.rpm"
RPM_HASH = "65739cca3cae9d4d820f65d54d1c79a4f5ce24353bb5d0bce96ebe5ab4d0ecd180560b9e436f84cc5b6c13aa9598e9aaab08325811762d721325868ab4b6e7c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tocdata-doc"
RDEPENDS:${PN} += ""

inherit rpm
