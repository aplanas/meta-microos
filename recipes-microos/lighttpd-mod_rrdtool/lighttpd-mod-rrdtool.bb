SUMMARY = "Lighttpd module to feed rrdtool databases"
DESCRIPTION = "RRD_tool is a system to store and display time-series data (i.e. \
network bandwidth, machine-room temperature, server load average). \
 \
This module feeds an rrdtool database with the traffic stats from \
lighttpd."
LICENSE = "BSD-3-Clause"

PV = "1.4.69"

RPM_NAME = "lighttpd-mod_rrdtool-1.4.69-1.3.aarch64.rpm"
RPM_HASH = "a19d1e87d3c829aa0fd989f10ae9c27faeac9ff3590de14e197ca4e64e4d8a87434d51489e07ae20d9df3cd1a8aeb6365f8a3afd09734fa5adae57a6318428f0"

RPROVIDES:${PN} += "config(lighttpd-mod_rrdtool) lighttpd-mod_rrdtool lighttpd-mod_rrdtool(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.33)(64bit) lighttpd rrdtool"

inherit rpm
