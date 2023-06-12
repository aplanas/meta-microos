SUMMARY = "Development files for OpenFST"
DESCRIPTION = "OpenFST is a library for constructing, combining, optimizing and \
searching weighted finite-state transducers (FSTs)."
LICENSE = "Apache-2.0"

PV = "1.8.2"

RPM_NAME = "openfst-devel-1.8.2-1.1.aarch64.rpm"
RPM_HASH = "a73bd7e1ee85f52732640062fa1de5f607fadbe1bc60664453b53950010f336b95fd627803de256cd2451b306dfbad8a6cc9edde73ba003702a4f519ac304f0d"

RPROVIDES:${PN} += "openfst-devel \
openfst-devel(aarch-64)"
RDEPENDS:${PN} += "libfst25"

inherit rpm
