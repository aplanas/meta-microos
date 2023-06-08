SUMMARY = "Documentation for texlive-piano"
DESCRIPTION = "This package includes the documentation for texlive-piano"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn21574"

RPM_NAME = "texlive-piano-doc-2023.201.1.0svn21574-51.1.noarch.rpm"
RPM_HASH = "fcf166b24ae5c722a0cbfbff8908ba8619e86e616d992f2c3f68bfed864da4bd33540b027477345be9b09ad0fc0871d6bbbc00e803f921101c391da6985b6838"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-piano-doc"
RDEPENDS:${PN} += ""

inherit rpm
