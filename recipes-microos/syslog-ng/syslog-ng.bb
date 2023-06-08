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

PV = "4.0.1"

RPM_NAME = "syslog-ng-4.0.1-1.4.aarch64.rpm"
RPM_HASH = "0cc0404e7e737bbad4270973820f951589e94536bb1909316e6a7c2e99f3981bb82b0e33cd839fec2ededfd61f63be0b600f4d5c898676f5d511b7a815f5f319"

RPROVIDES:${PN} += "config(syslog-ng) libadd-contextual-data.so()(64bit) libaffile.so()(64bit) libafprog.so()(64bit) libafsocket.so()(64bit) libafstomp.so()(64bit) libafuser.so()(64bit) libappmodel.so()(64bit) libazure-auth-header.so()(64bit) libbasicfuncs.so()(64bit) libcef.so()(64bit) libconfgen.so()(64bit) libcryptofuncs.so()(64bit) libcsvparser.so()(64bit) libdbparser.so()(64bit) libdisk-buffer.so()(64bit) libexamples.so()(64bit) libgraphite.so()(64bit) libhook-commands.so()(64bit) libjson-plugin.so()(64bit) libkvformat.so()(64bit) liblinux-kmsg-format.so()(64bit) libloggen_helper-4.0.so.0()(64bit) libloggen_plugin-4.0.so.0()(64bit) libloggen_socket_plugin.so()(64bit) libloggen_ssl_plugin.so()(64bit) libmap-value-pairs.so()(64bit) libpseudofile.so()(64bit) librate-limit-filter.so()(64bit) libregexp-parser.so()(64bit) libsdjournal.so()(64bit) libsecret-storage.so.0()(64bit) libsecure-logging.so()(64bit) libstardate.so()(64bit) libsyslog-ng-4.0.so.0()(64bit) libsyslogformat.so()(64bit) libsystem-source.so()(64bit) libtags-parser.so()(64bit) libtfgetent.so()(64bit) libtimestamp.so()(64bit) libxml.so()(64bit) syslog syslog-ng syslog-ng(aarch-64) sysvinit(syslog)"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/awk /usr/bin/mkdir /usr/bin/touch fillup ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcap.so.2()(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libevtlog-4.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libjson-c.so.5()(64bit) libjson-c.so.5(JSONC_0.14)(64bit) libnet.so.9()(64bit) libpcre.so.1()(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit) libsystemd.so.0(LIBSYSTEMD_245)(64bit) libwrap.so.0()(64bit) syslog-service"

inherit rpm
