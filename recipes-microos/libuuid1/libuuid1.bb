SUMMARY = "Library to generate UUIDs"
DESCRIPTION = "A library to generate universally unique IDs (UUIDs)."
LICENSE = "BSD-3-Clause"

PV = "2.38.1"

RPM_NAME = "libuuid1-2.38.1-12.1.aarch64.rpm"
RPM_HASH = "33e693ff98f79bf8809940259fba0c81da8be4fe75cab3b92f9bebc471293a8e66fa3e162c14d6f178301004d8c2896c6d365e024d8f73cd040c5d8a9cc559ee"

RPROVIDES:${PN} += "libuuid.so.1()(64bit) libuuid.so.1(UUIDD_PRIVATE)(64bit) libuuid.so.1(UUID_1.0)(64bit) libuuid.so.1(UUID_2.20)(64bit) libuuid.so.1(UUID_2.31)(64bit) libuuid.so.1(UUID_2.36)(64bit) libuuid1 libuuid1(aarch-64) libuuid__uuid_generate_time_cont"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.25)(64bit)"

inherit rpm
