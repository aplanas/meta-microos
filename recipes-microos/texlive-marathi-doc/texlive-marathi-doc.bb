SUMMARY = "Documentation for texlive-marathi"
DESCRIPTION = "This package includes the documentation for texlive-marathi"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.7svn61719"

RPM_NAME = "texlive-marathi-doc-2023.201.1.7svn61719-52.1.noarch.rpm"
RPM_HASH = "2ccd832ad340042623209c9370cd0dd7a37b1af0871d77d4c4f3749175ecb8cad306cca188bf319113819e3f431e186ac8b8400e055ab9c577c8e34639f4271d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-marathi-doc:mr) texlive-marathi-doc"
RDEPENDS:${PN} += ""

inherit rpm
