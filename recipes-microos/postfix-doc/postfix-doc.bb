SUMMARY = "Documentations for the postfix package"
DESCRIPTION = "Postfix aims to be an alternative to the widely-used sendmail program. \
This package contains the documentation for postfix"
LICENSE = "IPL-1.0 | EPL-2.0"

PV = "3.8.0"

RPM_NAME = "postfix-doc-3.8.0-2.2.noarch.rpm"
RPM_HASH = "86271a7533aea50e200b35d9c7f11eb04e88191eddbf828a2375de1f682fe0559e9c6085306cc2dd0b6f07267119ea73923ba34a6578184c95de64b43a744c60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postfix-doc"
RDEPENDS:${PN} += ""

inherit rpm
