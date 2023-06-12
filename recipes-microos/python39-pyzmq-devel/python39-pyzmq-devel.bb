SUMMARY = "Development files for python39-pyzmq"
DESCRIPTION = "Development libraries and headers needed to build software using python39-pyzmq."
LICENSE = "BSD-3-Clause & LGPL-3.0-or-later"

PV = "25.0.2"

RPM_NAME = "python39-pyzmq-devel-25.0.2-1.1.aarch64.rpm"
RPM_HASH = "6be67d856051b691bd3ad73345c19a35720ca1386e0936e9ecad9b57e2282f3e6f8daf35f611002b182cda99d90af5ea034378b9eafd7b0fafd92d3b9dc043aa"

RPROVIDES:${PN} += "python39-pyzmq-devel python39-pyzmq-devel(aarch-64)"
RDEPENDS:${PN} += "python(abi) python39-devel python39-pyzmq zeromq-devel"

inherit rpm
