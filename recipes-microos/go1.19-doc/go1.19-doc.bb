SUMMARY = "Go documentation"
DESCRIPTION = "Go examples and documentation."
LICENSE = "BSD-3-Clause"

PV = "1.19.9"

RPM_NAME = "go1.19-doc-1.19.9-1.1.aarch64.rpm"
RPM_HASH = "6376b3e216768f4c02164d90ce9af6c46bec5328c5c7c03bba70726545b825b592bd174e994782fe1e60457272a70015263ceb53358f356c7afcca0a036b5c62"

RPROVIDES:${PN} += "go-doc go1.19-doc go1.19-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
