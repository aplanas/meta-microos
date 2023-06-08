SUMMARY = "Documentation for texlive-plari"
DESCRIPTION = "This package includes the documentation for texlive-plari"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-plari-doc-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "d8ef402e2a0955f5f3486334a9349420f3c95c5636b191c8c0c33a6d1db11a853a091bef24aeee187bef5d919e00a9a18e49319e64ffc30c883769f1bcebf928"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-plari-doc"
RDEPENDS:${PN} += ""

inherit rpm
