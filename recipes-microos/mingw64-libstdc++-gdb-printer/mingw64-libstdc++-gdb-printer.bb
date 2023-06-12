SUMMARY = "MinGW Windows compiler for C++ gdb pretty printer for libstdc++"
DESCRIPTION = "MinGW Windows compiler for C++ gdb pretty printer for libstdc++"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw64-libstdc++-gdb-printer-12.2.0-2.1.aarch64.rpm"
RPM_HASH = "4fd71db0b8e0b864bc8a102c01e7b6a5f1c97339bc4d0782405afb676fbc391f6686158bac660c4edfdc15bdb1cca2e4e5781eeaf1c23a4c15be8ffd3c6bc15d"

RPROVIDES:${PN} += "mingw64-libstdc++-gdb-printer \
mingw64-libstdc++-gdb-printer(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
