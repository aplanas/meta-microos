SUMMARY = "The GNU Compiler Atomic Operations Runtime Library"
DESCRIPTION = "The runtime library for atomic operations of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw64-libatomic1-12.2.0-2.1.aarch64.rpm"
RPM_HASH = "6c43f7f433b830d3052a16a6f326962538d4d0758ff2cbff712b8aa37e68ac49e49c6be5adbb5513712e4e337d92c7fbb4fbfcb74e87ca60ddf2a45b17615704"

RPROVIDES:${PN} += "mingw64(libatomic-1.dll) mingw64-libatomic1 mingw64-libatomic1(aarch-64)"
RDEPENDS:${PN} += "mingw64(libwinpthread-1.dll)"

inherit rpm
