SUMMARY = "Test the uptime of the system"
DESCRIPTION = "This plugin tests the uptime on the system using /proc/uptime"
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-uptime-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "9b806deab3b6f4e9807814002b1aa670a054d5b520da912da6eea97045c6b02ccc01d0482fd185728240e894511f8a488798eeff058e555e18aef3714f614190"

RPROVIDES:${PN} += "monitoring-plugins-uptime monitoring-plugins-uptime(aarch-64) nagios-plugins-ups"
RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
