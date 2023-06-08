SUMMARY = "Development files for python39-pyzmq"
DESCRIPTION = "Development libraries and headers needed to build software using python39-pyzmq."
LICENSE = "BSD-3-Clause & LGPL-3.0-or-later"

PV = "24.0.1"

RPM_NAME = "python39-pyzmq-devel-24.0.1-3.5.aarch64.rpm"
RPM_HASH = "2f2199c50c639eaaa646008a4d52ac56a750be18d252540a2a20e5d23426465e364ff1a2e504df8f76154326e897684251b3d07c3244e27e0934cfcc87df29e1"

RPROVIDES:${PN} += "python39-pyzmq-devel python39-pyzmq-devel(aarch-64)"
RDEPENDS:${PN} += "python(abi) python39-devel python39-pyzmq zeromq-devel"

inherit rpm
