SUMMARY = "Check health of an NTP server"
DESCRIPTION = "Use this plugin to check the health of an NTP server. It supports \
checking the offset with the sync peer, the jitter and stratum. \
 \
This plugin will not check the clock offset between the local host and NTP \
server; please use check_ntp_time for that purpose."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-ntp_peer-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "13c2c830646cf699a9510b5a0266497f3c55dae4a7a3992e3c8a8b2e3f57d6ffceab613723a6e558b7f1ef7614ab1183b22d469f1c06b3e61dfe3c4c11ce23f6"

RPROVIDES:${PN} += "monitoring-plugins-ntp_peer monitoring-plugins-ntp_peer(aarch-64) nagios-plugins-ntp_peer"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
