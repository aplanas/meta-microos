SUMMARY = "Development files for kpipewire"
DESCRIPTION = "KPipeWire provides PipeWire integration for the Plasma desktop and mobile shells. \
This package provides the development files needed to build applications \
which use KPipeWire."
LICENSE = "LGPL-2.0-only & LGPL-3.0-only"

PV = "5.27.4"

RPM_NAME = "kpipewire-devel-5.27.4-1.2.aarch64.rpm"
RPM_HASH = "681632b36e9821b9bf94977651a2bc32cc1ea31af8f1047fde211e5f549864a1d70b58baf4fb09a68b8c56bcbbf5b59e48651eb348d51cfc95c7b7c4cbbcefac"

RPROVIDES:${PN} += "cmake(KPipeWire) kpipewire-devel kpipewire-devel(aarch-64)"
RDEPENDS:${PN} += "kpipewire-imports libKPipeWire5 libKPipeWireDmaBuf5 libKPipeWireRecord5 pkgconfig(libpipewire-0.3)"

inherit rpm
