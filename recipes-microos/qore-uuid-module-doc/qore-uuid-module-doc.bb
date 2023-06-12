SUMMARY = "Documentation and examples for the Qore UUID module"
DESCRIPTION = "This package contains the HTML documentation and example programs for the Qore \
uuid module."
LICENSE = "LGPL-2.1-or-later | MIT"

PV = "1.4.1"

RPM_NAME = "qore-uuid-module-doc-1.4.1-1.2.aarch64.rpm"
RPM_HASH = "2531d3664c4b99c0efaba93bf5b9516d629c3fecdfef31bad2bcd9374adb7672614b6ecdbb47bb0f0a7632363fe2b5a34735e7ab87d08e44f007c0ed31a8e8b4"

RPROVIDES:${PN} += "qore-uuid-module-doc \
qore-uuid-module-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
