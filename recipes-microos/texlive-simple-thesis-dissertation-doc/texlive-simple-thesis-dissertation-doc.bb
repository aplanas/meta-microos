SUMMARY = "Documentation for texlive-simple-thesis-dissertation"
DESCRIPTION = "This package includes the documentation for texlive-simple-thesis-dissertation"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn43058"

RPM_NAME = "texlive-simple-thesis-dissertation-doc-2023.201.svn43058-53.1.noarch.rpm"
RPM_HASH = "27f45f4a0142077d15ee7e9cba8c2fe8fd297c8761ec21ff3f42caa7dd91ad9d8222eeaa2b471a0d71e07ae5c248bd14f10a636594fd205ad1438cfb97527d0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-simple-thesis-dissertation-doc"
RDEPENDS:${PN} += ""

inherit rpm
