SUMMARY = "System user and group 'velociraptor'"
DESCRIPTION = "This package provides a shared system user for all velociraptor components"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "system-user-velociraptor-1.0.0-2.1.aarch64.rpm"
RPM_HASH = "c98223f428107cde655eb30f970907f03d805e9c0b0c300c93895c65a0e4219b13dc8e7ccce9eaf3ab1689c6a0ad0022b5e354cb2f7dd81ff5399afbdcb5ae26"

RPROVIDES:${PN} += "group(velociraptor) system-user-velociraptor system-user-velociraptor(aarch-64) user(velociraptor)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
