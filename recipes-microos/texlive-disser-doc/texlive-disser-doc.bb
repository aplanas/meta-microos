SUMMARY = "Documentation for texlive-disser"
DESCRIPTION = "This package includes the documentation for texlive-disser"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5.0svn43417"

RPM_NAME = "texlive-disser-doc-2023.201.1.5.0svn43417-52.1.noarch.rpm"
RPM_HASH = "e10930b472cd62957ae5b355184c59bfc5a5276b63946c6dfe8daca45ee5f0236a78b1f3c884e42e77f241aacde3a52817aaaa2bb8f1be575fc2d6c68e9f0497"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-disser-doc:ru;en) texlive-disser-doc"
RDEPENDS:${PN} += ""

inherit rpm
