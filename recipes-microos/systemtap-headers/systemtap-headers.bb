SUMMARY = "SystemTap headers"
DESCRIPTION = "SystemTap is an instrumentation system for systems running Linux. \
This package contains only the headers for static system probes and \
exists only to limit build cycles.  Normally you should install \
systemtap-sdt-devel, which also contains these headers."
LICENSE = "GPL-2.0-or-later"

PV = "4.7"

RPM_NAME = "systemtap-headers-4.7-2.1.aarch64.rpm"
RPM_HASH = "d1fce73db0a64eda7cfa1bf78e1ab4c9b680a849b3b411a9b94ac83064c8926b5b45272ee7553d0ac48c63e0a34120ba85473b8bbdcece31035a704ce709b4d5"

RPROVIDES:${PN} += "systemtap-headers systemtap-headers(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
