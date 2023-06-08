SUMMARY = "Probes disks on the system for installed operating systems"
DESCRIPTION = "This package detects other OSes available on a system and outputs the results \
in a generic machine-readable format. Support for new OSes and Linux \
distributions can be added easily."
LICENSE = "GPL-2.0-or-later"

PV = "1.81"

RPM_NAME = "os-prober-1.81-2.1.aarch64.rpm"
RPM_HASH = "e9c60e7d2852ce5860050c597a57b603e26ff97a8b00cee37eb1d412a4a839b2ebeed9858e05b4765f35a8337620cc7030827067e498c2f2ee26724e482915d7"

RPROVIDES:${PN} += "os-prober os-prober(aarch-64)"
RDEPENDS:${PN} += "/bin/grep /bin/sed /bin/sh /sbin/modprobe coreutils libc.so.6(GLIBC_2.34)(64bit) udev util-linux util-linux-systemd"

inherit rpm
