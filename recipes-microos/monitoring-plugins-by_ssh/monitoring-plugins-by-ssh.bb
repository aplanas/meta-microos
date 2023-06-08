SUMMARY = "Execute checks via SSH"
DESCRIPTION = "This plugin uses SSH to execute commands on a remote host. \
 \
The most common mode of use is to refer to a local identity file with \
the '-i' option. In this mode, the identity pair should have a null \
passphrase and the public key should be listed in the authorized_keys \
file of the remote host. Usually the key will be restricted to running \
only one command on the remote server. If the remote SSH server tracks \
invocation arguments, the one remote program may be an agent that can \
execute additional commands as proxy."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-by_ssh-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "79935279cdfd8d7858f5cb9de36b875fb89866712f734fa033ab9ca97f182a410dc354041dedf2aa302affd07f984181854df58effe30db4b735ac4e7a44f71a"

RPROVIDES:${PN} += "monitoring-plugins-by_ssh monitoring-plugins-by_ssh(aarch-64) nagios-plugins-by_ssh"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) openssh"

inherit rpm
