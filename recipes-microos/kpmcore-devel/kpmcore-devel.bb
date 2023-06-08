SUMMARY = "Development package for KDE Partition Manager core library"
DESCRIPTION = "Library for managing partitions. Common code for KDE Partition Manager and \
other projects. \
 \
Development package for kpmcore."
LICENSE = "GPL-3.0-only"

PV = "23.04.0"

RPM_NAME = "kpmcore-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "a34b4d5578bc466318d33d774d1acb402c03d56988cac0c1d564c09380a6d4031a3961013ab2560d673111d2713227c615f97ef71af9d94dab92de00ece77b8c"

RPROVIDES:${PN} += "cmake(KPMcore) kpmcore-devel kpmcore-devel(aarch-64)"
RDEPENDS:${PN} += "libkpmcore12"

inherit rpm
