SUMMARY = "Code coverage measurement for Python"
DESCRIPTION = "Coverage.py measures code coverage, typically during test execution. It uses \
the code analysis tools and tracing hooks provided in the Python standard \
library to determine which lines are executable, and which have been executed."
LICENSE = "Apache-2.0"

PV = "7.2.2"

RPM_NAME = "python310-coverage-7.2.2-2.1.aarch64.rpm"
RPM_HASH = "1a22882e541934b8e9ba930c85005b28171ff24b993193107743db8334fe5ac51097d73d64d02645240d50d579009612d46709a05b2bbafb31213ea18a57c606"

RPROVIDES:${PN} += "python3-coverage python3.10dist(coverage) python310-coverage python310-coverage(aarch-64) python3dist(coverage)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python310 update-alternatives"

inherit rpm
