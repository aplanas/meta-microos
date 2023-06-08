SUMMARY = "Documentation for the libe-book API"
DESCRIPTION = "This package contains documentation for the libe-book API."
LICENSE = "MPL-2.0"

PV = "0.1.3"

RPM_NAME = "libe-book-devel-doc-0.1.3-2.20.noarch.rpm"
RPM_HASH = "a7457bc3aededdde6009c527f4157fc4104b1411944ca88b3ba9820f481f53fd3fde3937ab6f58c6869a58bc94946644d2413407be2abee5d9c815ba164a4dc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libe-book-devel-doc"
RDEPENDS:${PN} += ""

inherit rpm
