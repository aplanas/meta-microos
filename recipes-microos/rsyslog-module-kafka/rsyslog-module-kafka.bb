SUMMARY = "Kafka support module for syslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This module provides support for Kafka."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2212.0"

RPM_NAME = "rsyslog-module-kafka-8.2212.0-2.4.aarch64.rpm"
RPM_HASH = "b31ae8d4ab53c4150f02aabe2d0453c6a9ce1b5e112f3f0d178a13029023d10770b8d33fa65b51d6f1d35c970d1ca4ad4639909886af6cb209c86d71232dd9db"

RPROVIDES:${PN} += "rsyslog-module-kafka rsyslog-module-kafka(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) librdkafka.so.1()(64bit) rsyslog"

inherit rpm
