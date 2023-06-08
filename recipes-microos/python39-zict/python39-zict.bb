SUMMARY = "Mutable mapping tools"
DESCRIPTION = "Mutable Mapping interfaces for python."
LICENSE = "BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "python39-zict-2.2.0-1.3.noarch.rpm"
RPM_HASH = "0a9d426195eddddb01b4154c46450a9cc385a6239b56f780952c9ba9bde4c225ad66733aa024a4f9b8eefad855c0be4a5ac78943aeeaeaf928f3e2bf2de53ce9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(zict) python39-zict python3dist(zict)"
RDEPENDS:${PN} += "python(abi) python39-HeapDict"

inherit rpm
