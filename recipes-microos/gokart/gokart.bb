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

RPM_NAME = "gokart-0.5.1-1.4.aarch64.rpm"
RPM_HASH = "c24159ed14e17ebc15e1e0bae256178d8ab0cb2b9bd26302dc4818fc204feb1879f9f38517fe4e1397a1e700cf4cde8f0015f3e4ef4c01b3a76d8e0b50590c9c"

RPROVIDES:${PN} += "gokart gokart(aarch-64)"
RDEPENDS:${PN} += "go libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
