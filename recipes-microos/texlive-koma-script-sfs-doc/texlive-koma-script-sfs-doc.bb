SUMMARY = "Documentation for texlive-koma-script-sfs"
DESCRIPTION = "This package includes the documentation for texlive-koma-script-sfs"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn26137"

RPM_NAME = "texlive-koma-script-sfs-doc-2023.201.1.0svn26137-55.1.noarch.rpm"
RPM_HASH = "32cec66f96432679d6533b2bff9cd9f2b23388c434b5025fd4c566a74b11f1a558d905c92c939c49f0355cc09ad879f188754e5f684e37032075d27f95ffd8c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-koma-script-sfs-doc:fi) texlive-koma-script-sfs-doc"
RDEPENDS:${PN} += ""

inherit rpm
