SUMMARY = "Virtual Host Metrics Daemon (vhostmd)"
DESCRIPTION = "vhostmd provides a 'metrics communication channel' between a host and \
its hosted virtual machines, allowing limited introspection of host \
resource usage from within virtual machines."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1"

RPM_NAME = "vm-dump-metrics-1.1-5.6.aarch64.rpm"
RPM_HASH = "b9d079cd8168c0fd5e3ec23a3daf7797f879a58ecd1133bf9b5e4be049d64d130da10990d1e3bc05627de64b14a2614ff14d7a10e94fa2fbcf86052f44b7a56c"

RPROVIDES:${PN} += "vm-dump-metrics vm-dump-metrics(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit)"

inherit rpm
