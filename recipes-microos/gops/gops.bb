SUMMARY = "A tool to list and diagnose Go processes currently running on your system"
DESCRIPTION = "gops is a command to list and diagnose Go processes currently running on your \
system. For processes that starts the diagnostics agent, gops can report \
additional information such as the current stack trace, Go version, memory stats, \
etc. It is possible to use gops tool both in local and remote mode."
LICENSE = "BSD-3-Clause-Clear"

PV = "0.3.25"

RPM_NAME = "gops-0.3.25-1.5.aarch64.rpm"
RPM_HASH = "d368d77f4668c49cfa0bc715d3ab000662f5691d2c332fa8a2f1a43d367ca8be261050cea584749ff282bd895b2d96b7a8774d7e88d555e63bfd2bae2df6f8d1"

RPROVIDES:${PN} += "gops gops(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
