SUMMARY = "Support Utilities for NFS"
DESCRIPTION = "This package contains common NFS utilities which are needed for client \
and kernel based server."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.3"

RPM_NAME = "nfs-client-2.6.3-39.1.aarch64.rpm"
RPM_HASH = "e033a304f0ddf509a1236b808db1764e8cf77d35b9e89b4b0cbbd6a669bc5ec85ff04ba1862ba6a450ca54cc5d73c3be807a8d85bfee5187c22371f3a4132033"

RPROVIDES:${PN} += "config(nfs-client) group(statd) nfs-client nfs-client(aarch-64) user(statd)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch fillup keyutils ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcom_err.so.2()(64bit) libdevmapper.so.1.03()(64bit) libdevmapper.so.1.03(Base)(64bit) libdevmapper.so.1.03(DM_1_02_97)(64bit) libevent_core-2.1.so.7()(64bit) libgssapi_krb5.so.2()(64bit) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) libkeyutils.so.1()(64bit) libkeyutils.so.1(KEYUTILS_0.3)(64bit) libkeyutils.so.1(KEYUTILS_1.0)(64bit) libkeyutils.so.1(KEYUTILS_1.5)(64bit) libkrb5.so.3()(64bit) libkrb5.so.3(krb5_3_MIT)(64bit) libmount.so.1()(64bit) libmount.so.1(MOUNT_2.19)(64bit) libmount.so.1(MOUNT_2.22)(64bit) libnfsidmap.so.1()(64bit) libnss_usrfiles2 libsqlite3.so.0()(64bit) libtirpc.so.3()(64bit) libtirpc.so.3(TIRPC_0.3.0)(64bit) libtirpc.so.3(TIRPC_PRIVATE)(64bit) netcfg permissions rpcbind sysuser-shadow"

inherit rpm
