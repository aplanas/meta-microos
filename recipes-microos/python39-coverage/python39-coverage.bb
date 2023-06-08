SUMMARY = "Code coverage measurement for Python"
DESCRIPTION = "Coverage.py measures code coverage, typically during test execution. It uses \
the code analysis tools and tracing hooks provided in the Python standard \
library to determine which lines are executable, and which have been executed."
LICENSE = "Apache-2.0"

PV = "7.2.2"

RPM_NAME = "python39-coverage-7.2.2-2.1.aarch64.rpm"
RPM_HASH = "81bb3019181cf7c15d3d5a3b2bcca1912a6ee423ce6cbf09f5b5c980b531c226251fdac7761b21c49640995e5b4196eda650cf11755371e87e9a2afc35ed7042"

RPROVIDES:${PN} += "python3.9dist(coverage) python39-coverage python39-coverage(aarch-64) python3dist(coverage)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python39 update-alternatives"

inherit rpm
