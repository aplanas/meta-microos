SUMMARY = "Sar and Iostat Commands for Linux"
DESCRIPTION = "Sar and Iostat commands for Linux. The sar command collects and reports \
system activity information. The iostat command reports CPU statistics \
and I/O statistics for TTY devices and disks.  The information \
collected by sar and iostat can be saved in a binary file for future \
inspection. Both commands now support SMP machines when displaying CPU \
utilization."
LICENSE = "GPL-2.0-or-later"

PV = "12.6.2"

RPM_NAME = "sysstat-12.6.2-1.1.aarch64.rpm"
RPM_HASH = "83fc72bdd7096af05027250fab5da93415bf11344cda8cf316df490cbfdb9a039387bd8b14025e17b71fb37f27d5edabe9ead7bf549a004487236ad627421bb2"

RPROVIDES:${PN} += "config(sysstat) sysstat sysstat(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libpcp.so.3()(64bit) libpcp.so.3(PCP_3.22)(64bit) libpcp_import.so.1()(64bit) libpcp_import.so.1(PCP_IMPORT_1.0)(64bit) libsensors.so.4()(64bit) procmail xz"

inherit rpm
