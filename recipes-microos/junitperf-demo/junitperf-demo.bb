SUMMARY = "JUnit extension for performance and scalability testing"
DESCRIPTION = "JUnitPerf is a collection of JUnit test decorators used to measure the \
performance and scalability of functionality contained within existing \
JUnit tests."
LICENSE = "BSD-3-Clause"

PV = "1.9.1"

RPM_NAME = "junitperf-demo-1.9.1-26.6.noarch.rpm"
RPM_HASH = "88b8138d94b7efe5f3a1445cb58f9b57c6b2f146dd0d5c2f2c5c29cc06897e45509e9de87be2d405181a15dad48f282670240faaac5a9145decb01f106376e77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "junitperf-demo"
RDEPENDS:${PN} += "junitperf"

inherit rpm
