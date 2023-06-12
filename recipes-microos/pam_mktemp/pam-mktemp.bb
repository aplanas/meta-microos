SUMMARY = "PAM Module to Provide Per-User Private Directories Under /tmp"
DESCRIPTION = "PAM (Pluggable Authentication Modules) is a system security tool that \
allows system administrators to set authentication policies without \
having to recompile programs that do authentication. \
 \
pam_mktemp is a PAM module which may be used with a PAM-aware login \
service to provide per-user private directories under /tmp as a part of \
PAM session or account management."
LICENSE = "SUSE-Permissive"

PV = "1.1.1"

RPM_NAME = "pam_mktemp-1.1.1-10.7.aarch64.rpm"
RPM_HASH = "1727ad845d721ef2e6e64e7b10f9bfa3ef0ed6362bf5296e7ae45761419960eee2094546088d8fe6223c434d21bb864b9fdae62be8250da186078ff3c6826d4b"

RPROVIDES:${PN} += "pam-modules:/usr/lib64/security/pam_mktemp.so \
pam_mktemp \
pam_mktemp(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libpam.so.0()(64bit) \
libpam.so.0(LIBPAM_1.0)(64bit) \
pam"

inherit rpm
