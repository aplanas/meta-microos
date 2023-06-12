SUMMARY = "Documentation for kaddressbook"
DESCRIPTION = "This package includes the user guide for KAddressbook in HTML format."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kaddressbook-doc-23.04.1-1.1.noarch.rpm"
RPM_HASH = "78c79507890ebdb99fdb77fc1db4662d07ea9d35edb54029b560b730acf19578ecfbfe6dd9581f566ad62487ee6b8b1cc94e18f7b47b2fe9341356f4eba0909c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kaddressbook-doc"
RDEPENDS:${PN} += ""

inherit rpm
