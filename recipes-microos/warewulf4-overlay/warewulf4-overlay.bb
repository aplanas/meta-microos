SUMMARY = "Default overlay for warewulf"
DESCRIPTION = "Includes the default overlays so that they can be updated seprately."
LICENSE = "BSD-3-Clause"

PV = "4.4.0"

RPM_NAME = "warewulf4-overlay-4.4.0-6.3.aarch64.rpm"
RPM_HASH = "5e3d809c801a8d891b995f21e21c3b97aa48db0a0848c1a0f368bba269f7f08ff9d4e90f9d42011236989e999743ed5fba479f17bb19db9b5c6ec7079bba48a1"

RPROVIDES:${PN} += "config(warewulf4-overlay) warewulf4-overlay warewulf4-overlay(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh warewulf4"

inherit rpm
