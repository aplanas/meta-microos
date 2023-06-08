SUMMARY = "Tool to detect ineffectual assignments in Go code"
DESCRIPTION = "This tool misses some cases because does not consider any type information in \
its analysis. (For example, assignments to struct fields are never marked as \
ineffectual.) It should, however, never give any false positives."
LICENSE = "MIT"

PV = "0.0.0+git20210225.2e10b26"

RPM_NAME = "ineffassign-0.0.0+git20210225.2e10b26-1.11.aarch64.rpm"
RPM_HASH = "75249e123732323735f8107174a526226c67b1e8d7feabb88611eb5432f2198ae9ca7ee5f77e807ecefe1bc7dd49af0a56687c1f12c8249b8310a3b54ea8cd99"

RPROVIDES:${PN} += "ineffassign ineffassign(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
