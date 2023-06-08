SUMMARY = "Development Files for the Breeze Qt Quick Controls 2 Style"
DESCRIPTION = "This file contains cmake files to be used by projects that depend on \
qqc2-breeze-style. \
Usually not needed as it is only a runtime dependency."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "5.27.4"

RPM_NAME = "qqc2-breeze-style-devel-5.27.4-1.1.aarch64.rpm"
RPM_HASH = "d24f183db5e0805291fdefdd831b1220a83464d98b6ce41f132e21394a9d3663f5474cb708a7c8886b5e766960e58134af267ac1a257db26f11857838f189d87"

RPROVIDES:${PN} += "cmake(KF5QQC2BreezeStyle) qqc2-breeze-style-devel qqc2-breeze-style-devel(aarch-64)"
RDEPENDS:${PN} += "extra-cmake-modules qqc2-breeze-style"

inherit rpm
