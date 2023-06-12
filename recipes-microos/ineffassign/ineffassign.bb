SUMMARY = "Tool to detect ineffectual assignments in Go code"
DESCRIPTION = "This tool misses some cases because does not consider any type information in \
its analysis. (For example, assignments to struct fields are never marked as \
ineffectual.) It should, however, never give any false positives."
LICENSE = "MIT"

PV = "0.0.0+git20210225.2e10b26"

RPM_NAME = "ineffassign-0.0.0+git20210225.2e10b26-1.12.aarch64.rpm"
RPM_HASH = "143202241d7268a3573cf47eec153e911c4508d30efd405dfbb3941fc2fdac355a5034fb5246ee40d37c5ce9d6dabede5738ec3763bf71eab6e55a7ad060d4b2"

RPROVIDES:${PN} += "ineffassign ineffassign(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
