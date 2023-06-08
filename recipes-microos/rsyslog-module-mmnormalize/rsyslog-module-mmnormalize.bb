SUMMARY = "Contains the mmnormalize support module for syslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This module provides log normalizing support."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2212.0"

RPM_NAME = "rsyslog-module-mmnormalize-8.2212.0-2.4.aarch64.rpm"
RPM_HASH = "c3ecbd1343662ffadaf6bd6acbb92c8fa32417ddee59e04919f46cf89f541d210751c529a75ed0b5defb97c73d6ea10269ceb1dd1558c35cb8bddf660b1cf6de"

RPROVIDES:${PN} += "rsyslog-module-mmnormalize rsyslog-module-mmnormalize(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libfastjson.so.4()(64bit) liblognorm.so.5()(64bit) rsyslog"

inherit rpm
