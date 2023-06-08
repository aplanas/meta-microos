SUMMARY = "A 2D Physics Engine for Games"
DESCRIPTION = "Box2D is an open source C++ engine for simulating rigid bodies in 2D."
LICENSE = "MIT"

PV = "2.4.1"

RPM_NAME = "libbox2d-devel-2.4.1-2.8.aarch64.rpm"
RPM_HASH = "004a3e3e56e6ee20fc815e3184b24be22052e42671618546d328c9da06b367ca5f6981b5e5c9c0d5e6c7577ea6ddb1902156fc9aaa9fd5b39ca15a46c4ec6aa6"

RPROVIDES:${PN} += "cmake(box2d) libbox2d-devel libbox2d-devel(aarch-64)"
RDEPENDS:${PN} += "libbox2d2"

inherit rpm
