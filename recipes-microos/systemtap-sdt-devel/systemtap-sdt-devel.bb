SUMMARY = "Static probe support tools"
DESCRIPTION = "SystemTap is an instrumentation system for systems running Linux. \
This package contains the support tools for static probes."
LICENSE = "GPL-2.0-or-later"

PV = "4.7"

RPM_NAME = "systemtap-sdt-devel-4.7-2.1.aarch64.rpm"
RPM_HASH = "8f476e8bfad819129db64e836f16c7dd8fc09825b3ba589e2da981687bd981e008136c4841847cc9290d96d98fd828ae6c4e29538603fe920a5f0a08cd9bd74d"

RPROVIDES:${PN} += "systemtap-sdt-devel systemtap-sdt-devel(aarch-64)"
RDEPENDS:${PN} += "systemtap"

inherit rpm
