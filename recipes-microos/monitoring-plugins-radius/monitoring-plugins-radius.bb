SUMMARY = "Test RADIUS server"
DESCRIPTION = "This plugin tests a RADIUS server to see if it is accepting connections.  The \
server to test must be specified in the invocation, as well as a user name and \
password. A configuration file may also be present. The format of the \
configuration file is described in the radiusclient library sources.  The \
password option presents a substantial security issue because the password can \
possibly be determined by careful watching of the command line in a process \
listing. This risk is exacerbated because nagios will run the plugin at regular \
predictable intervals. Please be sure that the password used does not allow \
access to sensitive system resources."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-radius-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "f6b8611af5fb7f630e0f37dd9828ee9aff6eaabd13c85346d145fecd4141aea875882f4e4ccacd02affffd01433f9bbb3a1f8cb155635b0e90b6a9a2be7e4b36"

RPROVIDES:${PN} += "monitoring-plugins-radius \
monitoring-plugins-radius(aarch-64) \
nagios-plugins-radius"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfreeradius-client.so.2()(64bit)"

inherit rpm
