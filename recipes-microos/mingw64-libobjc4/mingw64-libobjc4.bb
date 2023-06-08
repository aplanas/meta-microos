SUMMARY = "MinGW Windows compiler for Objective-C and Objective-C++ shared libraries"
DESCRIPTION = "MinGW Windows compiler for Objective-C and Objective-C++ shared libraries"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw64-libobjc4-12.2.0-2.1.aarch64.rpm"
RPM_HASH = "5807023d2d80033c7e99c5e2c09058a6af384420626da43e13b02e319b235c0e6f7ce659988c37e4d95bf66f5352e2829c1184a532e0729296c3871e9b6e5255"

RPROVIDES:${PN} += "mingw64(libobjc-4.dll) mingw64-libobjc mingw64-libobjc4 mingw64-libobjc4(aarch-64)"
RDEPENDS:${PN} += "mingw64(libgcc_s_seh-1.dll) mingw64(libwinpthread-1.dll)"

inherit rpm
