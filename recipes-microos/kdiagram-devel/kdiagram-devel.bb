SUMMARY = "Development package for the KDiagram libraries"
DESCRIPTION = "Development package for the KDiagram libraries"
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "kdiagram-devel-2.8.0-1.14.aarch64.rpm"
RPM_HASH = "f14a3f00fdc723d9516fb922ef0deeca1416d611cacbce3045e1ba82fa949cd2ad557464b7aec488e4e47da2b633dacded8159ab9c22eb31f86605ff017d3917"

RPROVIDES:${PN} += "cmake(KChart) cmake(KGantt) kdiagram-devel kdiagram-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt5Core) cmake(Qt5PrintSupport) cmake(Qt5Svg) cmake(Qt5Widgets) libKChart2 libKGantt2"

inherit rpm
