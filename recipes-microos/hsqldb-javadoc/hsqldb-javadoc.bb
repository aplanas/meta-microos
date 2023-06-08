SUMMARY = "Javadoc for hsqldb"
DESCRIPTION = "Javadoc for hsqldb."
LICENSE = "BSD-3-Clause"

PV = "2.7.1"

RPM_NAME = "hsqldb-javadoc-2.7.1-1.2.noarch.rpm"
RPM_HASH = "85eb3e7419e698a0bc1b21cc3dae0c3750a4ce6365c6d6671b7e76fc6cee3148057d5d1cee5b112597c04e08b854587ffab59a6ad032936fa252821412fa55cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hsqldb-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
