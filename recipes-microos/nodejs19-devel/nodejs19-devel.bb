SUMMARY = "Development headers for NodeJS 19.x"
DESCRIPTION = "This package provides development headers for Node.js needed for creation \
of binary modules."
LICENSE = "MIT"

PV = "19.9.0"

RPM_NAME = "nodejs19-devel-19.9.0-1.1.aarch64.rpm"
RPM_HASH = "d4af254d90dc6cd5a45a6d08f3f7e1fe6c536bf8927637cc7af697e5345e92a14807221c98c7247c6001652ba559ce27fcfb4a30fdef0ca0e7460f4fe30c12f1"

RPROVIDES:${PN} += "nodejs-devel nodejs19-devel nodejs19-devel(aarch-64)"
RDEPENDS:${PN} += "nodejs19 npm19"

inherit rpm
