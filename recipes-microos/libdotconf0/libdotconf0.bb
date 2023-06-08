SUMMARY = "Configuration file parser library"
DESCRIPTION = "dotconf is a configuration-file parser \
library written in C. The configuration files created for dotconf look \
similar to those used by the Apache web server. Even \
container directives known from httpd.conf can be used in the \
same manner as for Apache modules. It supports various types of \
arguments, dynamically loadable modules that create their own \
configuration options on-the-fly, a here-documents feature to pass \
long ARG_STR data to programs, and on-the-fly inclusion of additional \
config files."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3"

RPM_NAME = "libdotconf0-1.3-16.8.aarch64.rpm"
RPM_HASH = "43cb409cb32f38ddf85c803d2c2d6b0db7cb79012ba6f33a842bbf4f515fdee781eecb090772e726f9a7a0ad7ecf93f1174439a971ccb4dd170d533c44671971"

RPROVIDES:${PN} += "libdotconf-1_0-0 libdotconf.so.0()(64bit) libdotconf0 libdotconf0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
