SUMMARY = "Documentation for texlive-bxjscls"
DESCRIPTION = "This package includes the documentation for texlive-bxjscls"
LICENSE = "BSD-3-Clause"

PV = "2023.201.2.7asvn63011"

RPM_NAME = "texlive-bxjscls-doc-2023.201.2.7asvn63011-52.1.noarch.rpm"
RPM_HASH = "6820fc28f696cec9ff843c16273eac43d8f69033ffc804ee5f92d473d53eacc0e3853bec0fe190a978ca0513ce10cefc96b7c4999e7e89dddf462c91b9e344bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-bxjscls-doc:ja) \
texlive-bxjscls-doc"
RDEPENDS:${PN} += ""

inherit rpm
