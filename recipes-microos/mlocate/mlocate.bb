SUMMARY = "A utility for finding files by name"
DESCRIPTION = "A new locate implementation. The m character \
stands for merging, because updatedb reuses the \
existing database to avoid re-reading most of the \
file system."
LICENSE = "GPL-2.0-only"

PV = "0.26"

RPM_NAME = "mlocate-0.26-33.1.aarch64.rpm"
RPM_HASH = "ad2e4c0918e10dd754276b78c685438086bbf0a6f65a5d1fa5baf75bddfd29be27aa88bb5a0674b2a1272b7c7280300cd39289f02d0b582339ba26456917bdd0"

RPROVIDES:${PN} += "config(mlocate) \
findutils-locate \
findutils:/usr/bin/locate \
mlocate \
mlocate(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
apparmor-abstractions \
fillup \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
user(nobody)"

inherit rpm
