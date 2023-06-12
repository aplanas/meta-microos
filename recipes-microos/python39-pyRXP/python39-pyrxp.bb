SUMMARY = "Python RXP interface - fast validating XML parser"
DESCRIPTION = "PyRXP is a Python language wrapper around the excellent RXP parser, a \
validating, namespace-aware XML parser written in C."
LICENSE = "BSD-3-Clause"

PV = "3.0.1"

RPM_NAME = "python39-pyRXP-3.0.1-2.9.aarch64.rpm"
RPM_HASH = "febd030f264d0e8f953b52e3f4e4d72a764ca9aa7c4218df7095f7e4ceacdb8c31bf6d68343dcffb02f0a8dd1f02f431f5a25cdbf3acfc01a1c407cedb0cc099"

RPROVIDES:${PN} += "python3.9dist(pyrxp) \
python39-pyRXP \
python39-pyRXP(aarch-64) \
python3dist(pyrxp)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
