SUMMARY = "Single Sign On Framework - Documentation"
DESCRIPTION = "This package contains the documentation for signond."
LICENSE = "LGPL-2.0-only"

PV = "8.60"

RPM_NAME = "signond-docs-8.60-2.18.noarch.rpm"
RPM_HASH = "3eef6f5ef7992344734b471bc2129cd4473c74347c08e7dcc50c4dc7d901fbff618506fc4d3fefe8f1f6a908218c83b5c0058acb56bbc6deb37c72d289a461af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "signond-docs"
RDEPENDS:${PN} += ""

inherit rpm
