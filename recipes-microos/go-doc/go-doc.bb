SUMMARY = "Go documentation"
DESCRIPTION = "Go examples and documentation."
LICENSE = "BSD-3-Clause"

PV = "1.20"

RPM_NAME = "go-doc-1.20-1.1.aarch64.rpm"
RPM_HASH = "5d53ed3c4a458e68183955221a510e15f3d655e21639ab60f615e6b7a3231e2b1ab47f61a23a33fbf902f59863747ed69a0b515c96a9e560b142f907e76f8753"

RPROVIDES:${PN} += "go-doc \
go-doc(aarch-64) \
golang-docs"
RDEPENDS:${PN} += "go \
go1.20-doc"

inherit rpm
