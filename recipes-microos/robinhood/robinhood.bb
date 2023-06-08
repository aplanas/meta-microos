SUMMARY = "Policy engine and reporting tool for large filesystems"
DESCRIPTION = "The Robinhood Policy Engine is a tool to manage contents of large \
file systems. It maintains a replicate of filesystem medatada in a \
database that can be queried at will. It makes it possible to \
schedule mass action on filesystem entries by defining \
attribute-based policies, provides fast 'find' and 'du' enhanced \
clones, gives to administrators an overall view of filesystem \
contents through its web UI and command line tools. \
 \
It supports any POSIX filesystem and implements advanced features for \
Lustre filesystems (list/purge files per OST or pool, read MDT \
changelogs...)"
LICENSE = "CECILL-C"

PV = "3.1.7"

RPM_NAME = "robinhood-3.1.7-2.1.aarch64.rpm"
RPM_HASH = "ba85582d731beb5d418baf9a7a1d06039dd91af267f5764aa67589c421155ce434cd8b4db2cc7ac9ed72f8f62d1e742b95d78d883d06d899f4c7de72eb86f34d"

RPROVIDES:${PN} += "librbh_mod_alerter.so()(64bit) librbh_mod_basic.so()(64bit) librbh_mod_checker.so()(64bit) librbh_mod_common.so()(64bit) librbh_mod_modeguard.so()(64bit) librbh_mod_test.so()(64bit) robinhood robinhood(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/mkdir /usr/bin/touch fillup ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libglib-2.0.so.0()(64bit) libjemalloc.so.2()(64bit) libmariadb.so.3()(64bit) libmariadb.so.3(libmysqlclient_18)(64bit) libz.so.1()(64bit) systemd which"

inherit rpm
