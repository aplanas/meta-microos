SUMMARY = "Code coverage measurement for Python"
DESCRIPTION = "Coverage.py measures code coverage, typically during test execution. It uses \
the code analysis tools and tracing hooks provided in the Python standard \
library to determine which lines are executable, and which have been executed."
LICENSE = "Apache-2.0"

PV = "7.2.2"

RPM_NAME = "python311-coverage-7.2.2-2.1.aarch64.rpm"
RPM_HASH = "28298ee52cd9c9f05e6b998f6a0ca36d2c6e275104b774fa84727b7f1461e384e6449360c664d5253e9b4fa65af635cf287a62942a13e84c19fb85fa2ea0a384"

RPROVIDES:${PN} += "python3.11dist(coverage) python311-coverage python311-coverage(aarch-64) python3dist(coverage)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python311 update-alternatives"

inherit rpm
