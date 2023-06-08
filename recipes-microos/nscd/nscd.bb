SUMMARY = "Name Service Caching Daemon"
DESCRIPTION = "Nscd caches name service lookups and can dramatically improve \
performance with NIS, NIS+, and LDAP."
LICENSE = "GPL-2.0-or-later"

PV = "2.37"

RPM_NAME = "nscd-2.37-3.1.aarch64.rpm"
RPM_HASH = "9a4750abc86955e2cded99c45daed37cb8944ae4dc19f0c236f79b9b4bae00253ac01318a637fb47ee4ca4cb0b6093b2cdcbbf5a841ff92a7eeb18c5fabef7f4"

RPROVIDES:${PN} += "config(nscd) glibc:/usr/sbin/nscd group(nscd) nscd nscd(aarch-64) user(nscd)"
RDEPENDS:${PN} += "/bin/sh glibc ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libaudit.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcap.so.2()(64bit) libselinux.so.1()(64bit) libselinux.so.1(LIBSELINUX_1.0)(64bit) systemd sysuser-shadow"

inherit rpm
