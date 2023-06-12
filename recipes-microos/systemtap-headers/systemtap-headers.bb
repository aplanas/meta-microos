SUMMARY = "SystemTap headers"
DESCRIPTION = "SystemTap is an instrumentation system for systems running Linux. \
This package contains only the headers for static system probes and \
exists only to limit build cycles.  Normally you should install \
systemtap-sdt-devel, which also contains these headers."
LICENSE = "GPL-2.0-or-later"

PV = "4.9"

RPM_NAME = "systemtap-headers-4.9-1.1.aarch64.rpm"
RPM_HASH = "8301c043ed12ed6b1eb3e8f0ae15e31a57b9748446db73cf209cc4651e727380ae93dc7b18c2beac3722406063a1bedb4e1ec984f68ae5ddb312817bdcb4fdd4"

RPROVIDES:${PN} += "systemtap-headers \
systemtap-headers(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
