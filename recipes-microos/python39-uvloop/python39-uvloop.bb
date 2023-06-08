SUMMARY = "An asyncio event loop on top of libuv"
DESCRIPTION = "uvloop is a drop-in replacement of the built-in asyncio \
event loop. uvloop is implemented in Cython and uses libuv \
under the hood."
LICENSE = "Apache-2.0 & MIT"

PV = "0.17.0"

RPM_NAME = "python39-uvloop-0.17.0-1.5.aarch64.rpm"
RPM_HASH = "358c123b67c9d087cc79b7d5597e03a1c53c0ec461cf949d8c118ddff685a1060dca6ccc95bd4e9848a052410ecac6f1b1d7ceddea7e09dc1701a3ae71816860"

RPROVIDES:${PN} += "python3.9dist(uvloop) python39-uvloop python39-uvloop(aarch-64) python3dist(uvloop)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libuv.so.1()(64bit) python(abi)"

inherit rpm
