SUMMARY = "Framework for downloading and sharing additional application data"
DESCRIPTION = "The KNewStuff library implements collaborative data sharing for \
applications. It uses libattica to support the Open Collaboration Services \
specification. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "knewstuff-quick-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "f56ead5a10cb7139811192ca9d33611fcd73d3ac0c123cea9de276d2096bc15ea021263f0ff78f351c6067f24e60f32f5e66d996c527fae2b79510306a702c49"

RPROVIDES:${PN} += "cmake(KF5NewStuffQuick) knewstuff-quick-devel knewstuff-quick-devel(aarch-64)"
RDEPENDS:${PN} += "extra-cmake-modules knewstuff-core-devel knewstuff-imports"

inherit rpm
