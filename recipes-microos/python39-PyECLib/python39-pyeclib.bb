SUMMARY = "Simple interface for implementing erasure codes"
DESCRIPTION = "This library makes use of Jesasure for Reed-Solomon as implemented by the \
liberasurecode library and provides its' own flat XOR-based erasure code \
encoder and decoder.  Currently, it implements a specific class of HD \
Combination Codes (see 'Flat XOR-based erasure codes in storage systems: \
Constructions, efficient recovery, and tradeoffs' in IEEE MSST 2010).  These \
codes are well-suited to archival use-cases, have a simple construction and \
require a minimum number of participating disks during single-disk \
reconstruction (think XOR-based LRC code)."
LICENSE = "BSD-3-Clause"

PV = "1.6.1"

RPM_NAME = "python39-PyECLib-1.6.1-1.7.aarch64.rpm"
RPM_HASH = "9b52d99e3b78f6250493c3a652ccc7785b04b5763a848cff6471c76848a6f5dbb858a1a8236f406e3450a949264d601e91f3a88a2abc35b828346b1160ae2bc8"

RPROVIDES:${PN} += "python3.9dist(pyeclib) python39-PyECLib python39-PyECLib(aarch-64) python3dist(pyeclib)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) liberasurecode.so.1()(64bit) python(abi)"

inherit rpm
