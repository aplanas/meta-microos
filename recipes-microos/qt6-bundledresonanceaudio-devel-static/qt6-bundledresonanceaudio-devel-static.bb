SUMMARY = "Qt6 BundledResonanceAudio static library"
DESCRIPTION = "The Qt6 BundledResonanceAudio static library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-bundledresonanceaudio-devel-static-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "d2e632429034e986b49cbe74f337d3442edaeeafa53ae5675b5d3799dc025a0a054227ea5431efc01ffcacbd92c3a41d81a4df8608479fefe740c220beb816ac"

RPROVIDES:${PN} += "cmake(Qt6BundledResonanceAudio) qt6-bundledresonanceaudio-devel-static qt6-bundledresonanceaudio-devel-static(aarch-64)"
RDEPENDS:${PN} += "qt6-core-private-devel"

inherit rpm
