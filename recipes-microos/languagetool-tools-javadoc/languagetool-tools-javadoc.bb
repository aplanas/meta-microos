SUMMARY = "Javadoc for languagetool-tools"
DESCRIPTION = "This package contains javadoc for languagetool-tools."
LICENSE = "LGPL-2.1-or-later"

PV = "4.8"

RPM_NAME = "languagetool-tools-javadoc-4.8-3.1.noarch.rpm"
RPM_HASH = "6d260edb7512cdf8f46002fe1e75c92571db98b6aa0c03391eb560c8508a4e835149525f75f789026e3816044819917bb5c720d6557f2d098f5a6d29760d136f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "languagetool-tools-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
