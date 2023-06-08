SUMMARY = "Test UPS service on the specified host"
DESCRIPTION = "This plugin tests the UPS service on the specified host. \
 \
Network UPS Tools from www.networkupstools.org must be running for this plugin \
to work."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-ups-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "25874871dc253394f0f014b1003d4a0e1a21734a02ec77e94c2715b76dbc1fbb620a1962b9b4ba19957feb16d2eb03ec27d3a706b46afda0f8f05457fce990d0"

RPROVIDES:${PN} += "config(monitoring-plugins-ups) monitoring-plugins-ups monitoring-plugins-ups(aarch-64) nagios-plugins-ups"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
