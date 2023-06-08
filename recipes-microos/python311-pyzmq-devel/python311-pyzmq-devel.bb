SUMMARY = "Development files for python311-pyzmq"
DESCRIPTION = "Development libraries and headers needed to build software using python311-pyzmq."
LICENSE = "BSD-3-Clause & LGPL-3.0-or-later"

PV = "24.0.1"

RPM_NAME = "python311-pyzmq-devel-24.0.1-3.5.aarch64.rpm"
RPM_HASH = "173801ada7e5a83805e174dced3243ac71223e1e68f1b5ad83268312b37e5c95b9ee4b2e4e26ae87b555999886c08114514ccde0607fd6efbe1d7ba37be49aa6"

RPROVIDES:${PN} += "python311-pyzmq-devel python311-pyzmq-devel(aarch-64)"
RDEPENDS:${PN} += "python(abi) python311-devel python311-pyzmq zeromq-devel"

inherit rpm
