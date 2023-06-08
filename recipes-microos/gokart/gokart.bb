SUMMARY = "Static analysis tool for securing Go code"
DESCRIPTION = "GoKart is a static analysis tool for Go that finds vulnerabilities using the \
SSA (single static assignment) form of Go source code. It is capable of tracing \
the source of variables and function arguments to determine whether input \
sources are safe, which reduces the number of false positives compared to \
other Go security scanners. For instance, a SQL query that is concatenated \
with a variable might traditionally be flagged as SQL injection; however, \
GoKart can figure out if the variable is actually a constant or constant \
equivalent, in which case there is no vulnerability."
LICENSE = "Apache-2.0"

PV = "0.5.1"

RPM_NAME = "gokart-0.5.1-1.3.aarch64.rpm"
RPM_HASH = "e1d414ef789f2e606b8c6a71c579d73c4452cbb4016ab047d62255bb6250628587a638a7fe278e877ac6319268003cc02bc3a028c4f1798fb0598a797312ac95"

RPROVIDES:${PN} += "gokart gokart(aarch-64)"
RDEPENDS:${PN} += "go libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
