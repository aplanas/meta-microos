SUMMARY = "Check SSH service"
DESCRIPTION = "Try to connect to an SSH server at specified server and port."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-ssh-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "a22eb8981f27e4a02ac89d1804694c4b8cfd61e650a2e1aa43a59a5bc619e64ac8af1b935f72778219e0cf0a248646f50ad5473bdf64bb428cd07d5022c41919"

RPROVIDES:${PN} += "config(monitoring-plugins-ssh) monitoring-plugins-ssh monitoring-plugins-ssh(aarch-64) nagios-plugins-ssh"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
