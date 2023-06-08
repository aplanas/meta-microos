SUMMARY = "ElasticSearch output module for syslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This module provides support to output to an ElasticSearch database."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2212.0"

RPM_NAME = "rsyslog-module-elasticsearch-8.2212.0-2.4.aarch64.rpm"
RPM_HASH = "bc72f57ce24eb8354e95b17079dfb5f439faedeea4f96517e7580717bc7ec033f474d837e96000554be1ab4b8f31c9abbbaa31566026b597abada3f621c08854"

RPROVIDES:${PN} += "rsyslog-module-elasticsearch rsyslog-module-elasticsearch(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcurl.so.4()(64bit) rsyslog"

inherit rpm
