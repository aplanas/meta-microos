SUMMARY = "Documentation for kaddressbook"
DESCRIPTION = "This package includes the user guide for KAddressbook in HTML format."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kaddressbook-doc-23.04.0-1.1.noarch.rpm"
RPM_HASH = "c81109af31383d0e46e49bc94a4c31388db78774854b54cf54e867d55121f5ac54a1293ca07135c643ee7204871fd21169cae139ff949c7a3910f575c78e1260"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kaddressbook-doc"
RDEPENDS:${PN} += ""

inherit rpm
