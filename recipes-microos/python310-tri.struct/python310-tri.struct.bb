SUMMARY = "Python dictionaries with attribute access"
DESCRIPTION = "tri.struct supplies classes that can be used like dictionaries and as \
objects with attribute access at the same time."
LICENSE = "BSD-3-Clause"

PV = "4.1.0"

RPM_NAME = "python310-tri.struct-4.1.0-1.4.aarch64.rpm"
RPM_HASH = "c62ae28575e350029fc7376ae2c19729656a3c8ca68a6a6d937882ee48523c742335d21e11ad93c9f25d23b69328ddda9fc77d0712f8167c0b16e7d2fc176170"

RPROVIDES:${PN} += "python3-tri.struct python3.10dist(tri.struct) python310-tri.struct python310-tri.struct(aarch-64) python3dist(tri.struct)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi)"

inherit rpm
