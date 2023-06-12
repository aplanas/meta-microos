SUMMARY = "The RPM Package Manager"
DESCRIPTION = "RPM Package Manager is the main tool for managing the software packages \
of the SUSE Linux distribution. \
 \
RPM can be used to install and remove software packages. With rpm, it \
is easy to update packages.  RPM keeps track of all these manipulations \
in a central database.	This way it is possible to get an overview of \
all installed packages.  RPM also supports database queries."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.0"

RPM_NAME = "rpm-4.18.0-5.1.aarch64.rpm"
RPM_HASH = "24c92681aba96e26d928097e3cc66f85c758060aae5b5a35548a74eee1ec18fa6956daf2998165878c674e3c503e75d31e74eab63187377284eee8ebbdc14b40"

RPROVIDES:${PN} += "librpm.so.9()(64bit) librpmio.so.9()(64bit) librpmsign.so.9()(64bit) rpm rpm(aarch-64) rpminst"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/awk /usr/bin/mkdir /usr/bin/touch fillup ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libacl.so.1()(64bit) libacl.so.1(ACL_1.0)(64bit) libbz2.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcap.so.2()(64bit) libgcrypt.so.20()(64bit) libgcrypt.so.20(GCRYPT_1.6)(64bit) liblua5.4.so.5()(64bit) liblzma.so.5()(64bit) liblzma.so.5(XZ_5.0)(64bit) liblzma.so.5(XZ_5.2)(64bit) libpopt.so.0()(64bit) libpopt.so.0(LIBPOPT_0)(64bit) libselinux.so.1()(64bit) libselinux.so.1(LIBSELINUX_1.0)(64bit) libz.so.1()(64bit) libzstd.so.1()(64bit) rpm-config-SUSE"

inherit rpm
