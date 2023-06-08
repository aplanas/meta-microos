SUMMARY = "Documentation for texlive-alkalami"
DESCRIPTION = "This package includes the documentation for texlive-alkalami"
LICENSE = "OFL-1.1"

PV = "2023.201.1.000svn44497"

RPM_NAME = "texlive-alkalami-doc-2023.201.1.000svn44497-54.1.noarch.rpm"
RPM_HASH = "cb8a9243e773d252b01d31927663a66468f1e115335d3340df5bbdd458b87e914ce90b57271a21ebe0cfa0b8c811e9935635dac6e75e9207152019145090916e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-alkalami-doc"
RDEPENDS:${PN} += ""

inherit rpm
