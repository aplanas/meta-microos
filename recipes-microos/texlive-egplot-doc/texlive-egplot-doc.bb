SUMMARY = "Documentation for texlive-egplot"
DESCRIPTION = "This package includes the documentation for texlive-egplot"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.02asvn20617"

RPM_NAME = "texlive-egplot-doc-2023.201.1.02asvn20617-53.1.noarch.rpm"
RPM_HASH = "aa056d4c16a5eb86c1879b975ea8e0e9e49ce5a97eedd5ab9488bec42c2b6f170ff916190102eb2470876c04f9084f1239e4eacddca03daa2ebd0dbd78a496e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-egplot-doc"
RDEPENDS:${PN} += ""

inherit rpm
