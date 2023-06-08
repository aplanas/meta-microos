SUMMARY = "Monitoring Tool for KVM guests"
DESCRIPTION = "This package provides a userspace tool 'kvm_stat', which displays KVM vm exit \
information as a means of monitoring vm behavior. The data is taken from the \
KVM debugfs files or the vm tracepoints and outputs them as a curses ui or \
simple text."
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "kvm_stat-6.3.1-22.19.noarch.rpm"
RPM_HASH = "2c6ed86f5abf94e4c0c93cbcbdd3eb05b681985fbe6ec50ac26c413ad879a512bd281991856dbacc7db1bab6e57e293f3987e168861b540c23d0b56654996034"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kvm_stat"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3 python3-curses"

inherit rpm
