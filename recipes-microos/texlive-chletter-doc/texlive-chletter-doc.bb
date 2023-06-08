SUMMARY = "Documentation for texlive-chletter"
DESCRIPTION = "This package includes the documentation for texlive-chletter"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn20060"

RPM_NAME = "texlive-chletter-doc-2023.201.2.0svn20060-53.1.noarch.rpm"
RPM_HASH = "90387be5ccf999664b626c77abb504a89cbbc6612c27b581833f6671646233f98bd5417ff932d08bda84c525c6324ab21e844f0a92dc4cf81e776388588146d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-chletter-doc:en) texlive-chletter-doc"
RDEPENDS:${PN} += ""

inherit rpm
