SUMMARY = "Linux Studio Plugins (Common files)"
DESCRIPTION = "Common files for lsp-plugins."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.6"

RPM_NAME = "lsp-plugins-common-1.2.6-2.1.aarch64.rpm"
RPM_HASH = "878e0b5acd68a6f508389d338713c90177f694e1603259667fadf930d203e8a3dc861157415395dab6ffea1c60b5f19f379be54ad9cd551c771480f12d91e181"

RPROVIDES:${PN} += "liblsp-r3d-glx-lib-1.0.9.so()(64bit) lsp-plugins-common lsp-plugins-common(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGL.so.1()(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
