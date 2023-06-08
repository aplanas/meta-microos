SUMMARY = "PAM module to manage NTLM credentials in kernel keyring"
DESCRIPTION = "The pam_cifscreds PAM module is a tool for automatically adding \
credentials (username and password) for the purpose of establishing \
sessions in multiuser mounts. \
 \
When a cifs filesystem is mounted with the 'multiuser' option, and does \
not use krb5 authentication, it needs to be able to get the credentials \
for each user from somewhere. The pam_cifscreds module can be used to \
provide these credentials to the kernel automatically at login."
LICENSE = "GPL-3.0-or-later"

PV = "7.0"

RPM_NAME = "pam_cifscreds-7.0-2.3.aarch64.rpm"
RPM_HASH = "ade3152b7f1086941977976684847681486e5160e57a3d529fd5d5e82f81bf6925a7dbe80e9d287559cba6b57ba36ea331eb57432e8bcce44690c3da542e0f77"

RPROVIDES:${PN} += "pam_cifscreds pam_cifscreds(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libkeyutils.so.1()(64bit) libkeyutils.so.1(KEYUTILS_0.3)(64bit) libpam.so.0()(64bit) libpam.so.0(LIBPAM_1.0)(64bit) libpam.so.0(LIBPAM_EXTENSION_1.0)(64bit)"

inherit rpm
