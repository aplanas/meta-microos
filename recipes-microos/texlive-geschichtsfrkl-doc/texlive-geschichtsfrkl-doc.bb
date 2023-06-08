SUMMARY = "Documentation for texlive-geschichtsfrkl"
DESCRIPTION = "This package includes the documentation for texlive-geschichtsfrkl"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn42121"

RPM_NAME = "texlive-geschichtsfrkl-doc-2023.201.1.4svn42121-52.1.noarch.rpm"
RPM_HASH = "cd5d2adb8baa30f6567a7ac476096f0fe7e1e26f759ff96978abfcba15fe5a4c4166fe772f996d230fddb7dbcf02908134a2eb2fd552809d5679bdaaf82859e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-geschichtsfrkl-doc:de) texlive-geschichtsfrkl-doc"
RDEPENDS:${PN} += ""

inherit rpm
