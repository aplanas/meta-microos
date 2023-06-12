SUMMARY = "MinGW Windows compiler for C shared libraries"
DESCRIPTION = "MinGW Windows compiler for C shared libraries"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw32-libssp0-12.2.0-2.1.aarch64.rpm"
RPM_HASH = "efbc0d1ecfe9489da886b54ce79fab30590b7c56a563298d7d67157c597f7deac12561e849aabbb901d82c74db180cfacb7fbcb27e06b7e8a850f10f9690a4e8"

RPROVIDES:${PN} += "mingw32(libssp-0.dll) \
mingw32-libssp \
mingw32-libssp0 \
mingw32-libssp0(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
