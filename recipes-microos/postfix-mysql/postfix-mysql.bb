SUMMARY = "Postfix plugin to support MySQL maps"
DESCRIPTION = "Postfix plugin to support MySQL maps. This library will be loaded by \
starting postfix if you'll access a postmap which is stored in mysql."
LICENSE = "IPL-1.0 | EPL-2.0"

PV = "3.8.0"

RPM_NAME = "postfix-mysql-3.8.0-2.1.aarch64.rpm"
RPM_HASH = "f169f9e3bf4347416fde83c876382f77ca8b3c59a80ae461e323095f1f0c120d00a8bd94afe1ffca00594f739134d63852e43b8f4a544f637b7b7ef393b301e0"

RPROVIDES:${PN} += "config(postfix-mysql) group(vmail) postfix-mysql postfix-mysql(aarch-64) user(vmail)"
RDEPENDS:${PN} += "/bin/sh /sbin/ldconfig libc.so.6(GLIBC_2.17)(64bit) libmariadb.so.3()(64bit) libmariadb.so.3(libmysqlclient_18)(64bit) postfix sysuser-shadow"

inherit rpm
