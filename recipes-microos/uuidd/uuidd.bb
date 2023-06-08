SUMMARY = "Helper daemon to guarantee uniqueness of time-based UUIDs"
DESCRIPTION = "The uuidd package contains a userspace daemon (uuidd) which guarantees \
uniqueness of time-based UUID generation even at very high rates on \
SMP systems."
LICENSE = "GPL-2.0-or-later"

PV = "2.38.1"

RPM_NAME = "uuidd-2.38.1-12.1.aarch64.rpm"
RPM_HASH = "d9f9e2e994706dde312c1e257ea6142fcacc836ece6105f434dfe996a8b6e68adacae3cfa0b93051c821e69cb1a14d4cb05cdc1c4a96047291e494fe22b01796"

RPROVIDES:${PN} += "uuid-runtime uuidd uuidd(aarch-64)"
RDEPENDS:${PN} += "/bin/sh group(uuidd) ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit) libuuid.so.1()(64bit) libuuid.so.1(UUIDD_PRIVATE)(64bit) libuuid.so.1(UUID_1.0)(64bit) libuuid__uuid_generate_time_cont systemd user(uuidd)"

inherit rpm
