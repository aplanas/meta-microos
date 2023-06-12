SUMMARY = "Run kubectl commands in all/some contexts in parallel"
DESCRIPTION = "Run a kubectl command in one or more contexts (clusters) in parallel (similar to GNU parallel/xargs)."
LICENSE = "Apache-2.0"

PV = "0.2.1"

RPM_NAME = "kubectl-foreach-0.2.1-1.4.aarch64.rpm"
RPM_HASH = "1bdf283af55479dbf9aa122931386a1ba804e6a80895d5f1a5067e2fe9a98c2b35229f937b8fe72b65fff999243b5dc801d53fdfa7f989fc71d1dbc4102f43bf"

RPROVIDES:${PN} += "kubectl-foreach kubectl-foreach(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
