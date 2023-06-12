SUMMARY = "Enhanced system logging daemon"
DESCRIPTION = "syslog-ng is an enhanced log daemon, supporting a wide range of input and \
output methods: syslog, unstructured text, message queues, databases (SQL \
and NoSQL alike) and more. \
 \
Key features: \
 \
 * receive and send RFC3164 and RFC5424 style syslog messages \
 * work with any kind of unstructured data \
 * receive and send JSON formatted messages \
 * classify and structure logs with builtin parsers (csv-parser(), \
   db-parser(), ...) \
 * normalize, crunch and process logs as they flow through the system \
 * hand on messages for further processing using message queues (like \
   AMQP), files or databases (like PostgreSQL or MongoDB)."
LICENSE = "GPL-2.0-only"

PV = "4.2.0"

RPM_NAME = "syslog-ng-4.2.0-1.1.aarch64.rpm"
RPM_HASH = "be81a611304770c2fb61803193d3842aeab4c582d8dd5fa2a90f4a03388e088d7c3d494ef2a96dda7dbbb8d468dfc7c6fc125c4455dbe60b859d3bc8bdb83339"

RPROVIDES:${PN} += "config(syslog-ng) libloggen_helper-4.2.so.0()(64bit) libloggen_plugin-4.2.so.0()(64bit) libsecret-storage.so.0()(64bit) libsyslog-ng-4.2.so.0()(64bit) syslog syslog-ng syslog-ng(aarch-64) sysvinit(syslog)"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/awk /usr/bin/mkdir /usr/bin/touch fillup ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcap.so.2()(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libevtlog-4.2.so.0()(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libjson-c.so.5()(64bit) libjson-c.so.5(JSONC_0.14)(64bit) libnet.so.9()(64bit) libpcre.so.1()(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit) libsystemd.so.0(LIBSYSTEMD_245)(64bit) libwrap.so.0()(64bit) syslog-service"

inherit rpm
