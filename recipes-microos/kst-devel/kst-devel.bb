SUMMARY = "Development files for kst"
DESCRIPTION = "Development libraries and headers needed to build software \
making use of kst"
LICENSE = "GPL-2.0-or-later"

PV = "2.0.8"

RPM_NAME = "kst-devel-2.0.8-14.4.aarch64.rpm"
RPM_HASH = "26a5bde6927b49fccd9d1bafe57a29f8707bf6f37dab8cb9fd6ffa208f3d65b6f3067a69a251fe08311f30733b04224a1e59e86eea3f1a481bd6956e78e1c506"

RPROVIDES:${PN} += "kst-devel kst-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt5Concurrent) cmake(Qt5Core) cmake(Qt5Network) cmake(Qt5PrintSupport) cmake(Qt5Widgets) cmake(Qt5Xml) kst"

inherit rpm
