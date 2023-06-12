SUMMARY = "Base Package for Integrated Development Environments: Build Environment"
DESCRIPTION = "This package contains the development files for building integrated \
developments environments based on the KDevelop framework."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kdevplatform-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "1447cd14a4d66e47e1000f88339ddfae179e448b47424912269546a1f2052b82392cdc85f75ec930a95e67586d9a2ed1183415a21ec0276d4c17ca346998d7dd"

RPROVIDES:${PN} += "cmake(KDevPlatform) \
kdevplatform-devel \
kdevplatform-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5TextEditor) \
cmake(KF5ThreadWeaver) \
libkdevplatform511"

inherit rpm
