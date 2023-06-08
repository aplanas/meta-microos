SUMMARY = "LIRC client library"
DESCRIPTION = "The LIRC client library. To actually use LIRC the lircd daemon from \
the 'lirc' package has to be configured and started."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.1"

RPM_NAME = "liblirc_client0-0.10.1-9.3.aarch64.rpm"
RPM_HASH = "8ea5d09b5280607ba011544132a406d483147efb6a7696d909962b368c4f630104633ad2157b249f33a97c943cb92e5aeb45ecf4c67ba1fd9163695106b98ea1"

RPROVIDES:${PN} += "liblirc_client.so.0()(64bit) liblirc_client0 liblirc_client0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
