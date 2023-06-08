SUMMARY = "Perl interface for libapparmor functions"
DESCRIPTION = "This package provides the perl interface to AppArmor. It is used for perl \
applications interfacing with AppArmor."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "3.1.3"

RPM_NAME = "perl-apparmor-3.1.3-2.1.aarch64.rpm"
RPM_HASH = "0ddcbc7a81690ff78e3ab321d2a6ed67d69f96aab1676257f806f9cc60ea3c4c44e80a377e993f57627025576a1f430e919e5a1afbf7886fb0fc4a8c50e1d0bf"

RPROVIDES:${PN} += "perl(LibAppArmor) perl(LibAppArmor::aa_log_record) perl(LibAppArmorc) perl-apparmor perl-apparmor(aarch-64) perl-libapparmor"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libapparmor.so.1()(64bit) libapparmor.so.1(APPARMOR_1.0)(64bit) libapparmor.so.1(APPARMOR_1.1)(64bit) libapparmor.so.1(APPARMOR_2.10)(64bit) libapparmor.so.1(APPARMOR_2.11)(64bit) libapparmor.so.1(APPARMOR_2.9)(64bit) libapparmor.so.1(PRIVATE)(64bit) libapparmor1 libc.so.6(GLIBC_2.17)(64bit) perl"

inherit rpm
