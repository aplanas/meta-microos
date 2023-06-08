SUMMARY = "Documentation for texlive-listingsutf8"
DESCRIPTION = "This package includes the documentation for texlive-listingsutf8"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn53097"

RPM_NAME = "texlive-listingsutf8-doc-2023.201.1.5svn53097-54.1.noarch.rpm"
RPM_HASH = "25c10c7013b468114242f5dbdaf8822b633ca10119c000eb2d95be8f9ae7f8f0eb7985cb6b6342e86ca8fe965895c714ec328a9904dd285c4e3d81f58e458fcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-listingsutf8-doc:en) texlive-listingsutf8-doc"
RDEPENDS:${PN} += ""

inherit rpm
