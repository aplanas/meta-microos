SUMMARY = "Tools to access the EDB format"
DESCRIPTION = "Tools to access the Extensible Storage Engine (ESE) Database File (EDB) format. \
ESEDB is used in may different applications like Windows Search, Windows Mail, \
Exchange, Active Directory, etc."
LICENSE = "LGPL-3.0-or-later"

PV = "20230318"

RPM_NAME = "libesedb-tools-20230318-1.2.aarch64.rpm"
RPM_HASH = "c0ee7906a1737d725022087d5acb6f8772d70470c87dd222f20653bd91e74d7be78cde1c45e65bb440e4716cbde32fcf91103b367ee4eba01aa8965bf5104d0c"

RPROVIDES:${PN} += "libesedb-tools libesedb-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcdata.so.1()(64bit) libcdata.so.1(V_20230108)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libcfile.so.1()(64bit) libcfile.so.1(V_20220106)(64bit) libclocale.so.1()(64bit) libclocale.so.1(V_20221218)(64bit) libcnotify.so.1()(64bit) libcnotify.so.1(V_20220108)(64bit) libcpath.so.1()(64bit) libcpath.so.1(V_20220108)(64bit) libesedb.so.1()(64bit) libesedb.so.1(V_20230318)(64bit) libfdatetime.so.1()(64bit) libfdatetime.so.1(V_20220112)(64bit) libfguid.so.1()(64bit) libfguid.so.1(V_20220113)(64bit) libfwnt.so.1()(64bit) libfwnt.so.1(V_20220922)(64bit) libuna.so.1()(64bit) libuna.so.1(V_20220611)(64bit)"

inherit rpm
