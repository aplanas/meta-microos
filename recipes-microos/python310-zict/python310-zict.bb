SUMMARY = "Mutable mapping tools"
DESCRIPTION = "Mutable Mapping interfaces for python."
LICENSE = "BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "python310-zict-2.2.0-1.3.noarch.rpm"
RPM_HASH = "fe1e89f7647fb9948813aa4a9dc21f2b1fef997874b49dc033774b7585032d946d165b679490a30632970e2f1397afee90a65c3f000e1278be372222b0c74835"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zict python3.10dist(zict) python310-zict python3dist(zict)"
RDEPENDS:${PN} += "python(abi) python310-HeapDict"

inherit rpm
