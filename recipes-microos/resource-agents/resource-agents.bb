SUMMARY = "HA Reusable Cluster Resource Scripts"
DESCRIPTION = "A set of scripts to interface with several services to operate in a \
High Availability environment for both Pacemaker and rgmanager \
service managers."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "4.12.0+git30.7fd7c8fa"

RPM_NAME = "resource-agents-4.12.0+git30.7fd7c8fa-1.1.aarch64.rpm"
RPM_HASH = "0531cebd60d807d00adeaa2bee9320d9fc4339ce7a3a1f12e3301c63d5adcf179d103061c8e28225cb6e955ebfaa52cd8879a692e8fcbd569aef8b555d5a90e4"

RPROVIDES:${PN} += "aws-vpc-move-ip config(resource-agents) heartbeat-resources pkgconfig(resource-agents) resource-agents resource-agents(aarch-64) resource-agents-devel"
RDEPENDS:${PN} += "/bin/sh /usr/bin/bash /usr/bin/logger /usr/bin/pkg-config /usr/bin/python3 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libplumb.so.2()(64bit)"

inherit rpm
