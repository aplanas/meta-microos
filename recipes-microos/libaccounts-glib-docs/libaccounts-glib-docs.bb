SUMMARY = "Documentation for libaccounts-glib"
DESCRIPTION = "This package contains the documentation for the accounts-glib \
library."
LICENSE = "LGPL-2.1-only"

PV = "1.26"

RPM_NAME = "libaccounts-glib-docs-1.26-1.3.noarch.rpm"
RPM_HASH = "fdefb7d4a990ea2b3e110b9568cab7f74acf51930fbd0c1797a2592fd8405deffbf7c3734cd7bf4be7a5299359885a9a4b265dcc52ae08be6498cc3067e81b78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libaccounts-glib-docs"
RDEPENDS:${PN} += ""

inherit rpm
