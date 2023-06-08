SUMMARY = "MinGW Windows compiler for Objective-C and Objective-C++"
DESCRIPTION = "MinGW Windows compiler for Objective-C and Objective-C++"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw64-gcc-objc-12.2.0-2.1.aarch64.rpm"
RPM_HASH = "9b0b943f03421257e4b09e53c0752fa43ddeea542a066cb26424df69e8ea8d3dd45a592eb7413c0beab217a90b4cb0850f5b16e206fb600ebc44be3d8048282a"

RPROVIDES:${PN} += "mingw64(lib:objc) mingw64-gcc-objc mingw64-gcc-objc(aarch-64)"
RDEPENDS:${PN} += "mingw64(libgmp-10.dll) mingw64(libmpc-3.dll) mingw64(libmpfr-4.dll) mingw64(libwinpthread-1.dll) mingw64(libz.dll)"

inherit rpm
