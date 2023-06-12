SUMMARY = "Fast ping check"
DESCRIPTION = "This plugin will use the fping command to ping the specified host for \
a fast check. Note that it is necessary to set the suid flag on fping."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-fping-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "1f4c09662a17056051305c69bb5c86527b836a9461638a2b2df6bea81610855ed70b4fc081a6a053768cb7d027ba76b14e2a0c726aea371d2ebac3a4c97b4066"

RPROVIDES:${PN} += "monitoring-plugins-fping \
monitoring-plugins-fping(aarch-64) \
nagios-plugins-fping"
RDEPENDS:${PN} += "fping \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
