SUMMARY = "A tiny but valid init for containers"
DESCRIPTION = "Tini is a trivial implementation for an 'init' program. \
 \
All Tini does is spawn a single child (Tini is meant to be run in a container), \
and wait for it to exit, all the while reaping zombies and performing signal forwarding. \
 \
libc will be needed inside the container."
LICENSE = "MIT"

PV = "0.19.0"

RPM_NAME = "tini-0.19.0-2.1.aarch64.rpm"
RPM_HASH = "6cc509ac0f1f574342a4d18c61fb4b54fcbdf2816cd008b138876ae0d088f53689ca2608f2ac7ba311e7204f85a2ba78a767eddf6a6816e89a0b339bb2aec3c3"

RPROVIDES:${PN} += "tini tini(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
