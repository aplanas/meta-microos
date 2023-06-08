SUMMARY = "Python RXP interface - fast validating XML parser"
DESCRIPTION = "PyRXP is a Python language wrapper around the excellent RXP parser, a \
validating, namespace-aware XML parser written in C."
LICENSE = "BSD-3-Clause"

PV = "3.0.1"

RPM_NAME = "python311-pyRXP-3.0.1-2.9.aarch64.rpm"
RPM_HASH = "f82607a182f43129d3d7eb4c61838c40d265aee9ff40a6ccd8c86eacc77bea814a55f3801a2988bcc5db3b38e613481ff5b2af54830219d32196e113198dca90"

RPROVIDES:${PN} += "python3.11dist(pyrxp) python311-pyRXP python311-pyRXP(aarch-64) python3dist(pyrxp)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi)"

inherit rpm
