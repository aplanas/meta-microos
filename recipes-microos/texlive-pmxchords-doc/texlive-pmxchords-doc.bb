SUMMARY = "Documentation for texlive-pmxchords"
DESCRIPTION = "This package includes the documentation for texlive-pmxchords"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.0.2svn39249"

RPM_NAME = "texlive-pmxchords-doc-2023.201.2.0.2svn39249-52.1.noarch.rpm"
RPM_HASH = "1bfb67eb97b23be9c3c813337af443459f1582fed8fe2e3bdab100393be2c8227eea6bbff4875631f41fba26df7a774f60a1bfceab924ab3c7866c1367291f96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-pmxchords-doc:en;cs) man(pmxchords.1) texlive-pmxchords-doc"
RDEPENDS:${PN} += ""

inherit rpm
