SUMMARY = "Git credential backend using libsecret to access keyring"
DESCRIPTION = "A Git credential backend which uses libsecret API to acces keyrings such as \
kwallet or GNOME keyring."
LICENSE = "GPL-2.0-only"

PV = "2.40.1"

RPM_NAME = "git-credential-libsecret-2.40.1-1.1.aarch64.rpm"
RPM_HASH = "c626c3093ed03945416dca2897318a5a6d3827b2642f46bce8ffbd403ee008810c2725cc11cc530e089d50ba4634241a65a3880e6e28258a9e0b136d4cd43de1"

RPROVIDES:${PN} += "git-credential-libsecret \
git-credential-libsecret(aarch-64)"
RDEPENDS:${PN} += "git-core \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libsecret-1.so.0()(64bit)"

inherit rpm
