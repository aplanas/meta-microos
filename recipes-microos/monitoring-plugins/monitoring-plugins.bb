SUMMARY = "The Monitoring Plug-Ins"
DESCRIPTION = "The actual service checks on current monitoring solutions like Icinga, \
Nagios or Shinken (just to name a few) are performed by separate \
'plugin' programs which return the status of the checks to the \
running daemon. \
 \
This package contains those plugins."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "d7dcc7655b795aa5e0400e309ac43b0c1bd205b91fe9429bb861268b5e3923624766ff38a43d1a3bc8eb05d0648d3c68ae9d734b4db3a83870b5e321cc582041"

RPROVIDES:${PN} += "monitoring-plugins monitoring-plugins(aarch-64) nagios-plugins"
RDEPENDS:${PN} += "permissions"

inherit rpm
