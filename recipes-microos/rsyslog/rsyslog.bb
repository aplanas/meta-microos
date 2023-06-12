SUMMARY = "The enhanced syslogd for Linux and Unix"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslogd supporting, among others, \
MySQL, syslog/tcp, RFC 3195, permitted sender lists, filtering on any \
message part, and fine grain output format control. It is quite \
compatible to stock sysklogd and can be used as a drop-in replacement. \
Its advanced features make it suitable for enterprise-class, encryption \
protected syslog relay chains while at the same time being very easy to \
setup for the novice user."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2212.0"

RPM_NAME = "rsyslog-8.2212.0-2.4.aarch64.rpm"
RPM_HASH = "72560eca70d67c927fab5e89a87e62c63f7af373fea3baa8e4d6ad96d6a9ae17972c132e9b527a58ef174bc84151dc3386017b0f97cecfa326abdc2d70674018"

RPROVIDES:${PN} += "config(rsyslog) \
rsyslog \
rsyslog(aarch-64) \
syslog \
sysvinit(syslog)"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libcurl.so.4()(64bit) \
libestr.so.0()(64bit) \
libfastjson.so.4()(64bit) \
liblogging-rfc3195.so.0()(64bit) \
liblognorm.so.5()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
librdkafka1 \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libsystemd.so.0(LIBSYSTEMD_246)(64bit) \
libuuid.so.1()(64bit) \
libuuid.so.1(UUID_1.0)(64bit) \
libz.so.1()(64bit) \
syslog-service"

inherit rpm
