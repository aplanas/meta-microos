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

RPM_NAME = "python311-PyECLib-1.6.1-1.7.aarch64.rpm"
RPM_HASH = "9aa63765d9a3c49817216fbe4b8f06bd617fa38c54ff1632c9c72e9892428ac74da8fd3b632758c3b30d48893e2d02055e7b94e626e79109bf3a77b7ff504c31"

RPROVIDES:${PN} += "python3.11dist(pyeclib) python311-PyECLib python311-PyECLib(aarch-64) python3dist(pyeclib)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) liberasurecode.so.1()(64bit) python(abi)"

inherit rpm
