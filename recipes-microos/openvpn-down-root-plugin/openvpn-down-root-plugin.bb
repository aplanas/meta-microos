SUMMARY = "OpenVPN down-root plugin"
DESCRIPTION = "The OpenVPN down-root plugin allows an OpenVPN configuration to call a \
down script with root privileges, even when privileges have been \
dropped using --user/--group/--chroot. \
 \
This module uses a split privilege execution model which will fork() \
before OpenVPN drops root privileges, at the point where the --up \
script is usually called.  The plugin will then remain in a wait state \
until it receives a message from OpenVPN via pipe to execute the down \
script.  Thus, the down script will be run in the same execution \
environment as the up script."
LICENSE = "GPL-2.0-only-WITH-openvpn-openssl-exception"

PV = "2.6.3"

RPM_NAME = "openvpn-down-root-plugin-2.6.3-1.1.aarch64.rpm"
RPM_HASH = "3eeba7e57ad7d003cdb76a78add305cc6d8edbdab00020d2fef08758ce27ca2877c622d326773af06b471530b29e6cee8d88cfaa086437b50f81daf7c99a9c13"

RPROVIDES:${PN} += "openvpn-down-root-plugin openvpn-down-root-plugin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) openvpn"

inherit rpm
