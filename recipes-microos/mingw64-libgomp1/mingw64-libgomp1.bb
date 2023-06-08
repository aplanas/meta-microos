SUMMARY = "MinGW Windows compiler for C shared libraries"
DESCRIPTION = "MinGW Windows compiler for C shared libraries"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw64-libgomp1-12.2.0-2.1.aarch64.rpm"
RPM_HASH = "c223ad5d526970219094729e444a215c92e7bfee31a5965dcd9ee50215d2bb8905ea4d54cc16c171454d958b864ba82db6e6b448fc5e3b02a3f5e700be6cacd6"

RPROVIDES:${PN} += "mingw64(libgomp-1.dll) mingw64-libgomp mingw64-libgomp1 mingw64-libgomp1(aarch-64)"
RDEPENDS:${PN} += "mingw64(libgcc_s_seh-1.dll) mingw64(libwinpthread-1.dll)"

inherit rpm
