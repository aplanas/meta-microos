SUMMARY = "HDFS via HTTP output module for syslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This module provides support to output to HDFS via HTTP."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2212.0"

RPM_NAME = "rsyslog-module-omhttpfs-8.2212.0-2.4.aarch64.rpm"
RPM_HASH = "170bcdf04065442d3d52f49262a457953fafc093f93653c2cbb3fe1b51da65af7359f45b180fc482f7ad20525cdf477399da74a6e202a8c52e48db0c9042a469"

RPROVIDES:${PN} += "rsyslog-module-omhttpfs rsyslog-module-omhttpfs(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcurl.so.4()(64bit) libfastjson.so.4()(64bit) rsyslog"

inherit rpm
