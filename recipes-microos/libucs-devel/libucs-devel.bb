SUMMARY = "Development files for Unified Communication Services (UC-S)"
DESCRIPTION = "This framework provides infrastructure for component based \
programming, memory management, and system utilities."
LICENSE = "BSD-3-Clause"

PV = "1.14.0"

RPM_NAME = "libucs-devel-1.14.0-1.1.aarch64.rpm"
RPM_HASH = "14f748d03e5ce19454fee7f45c6affbb0a60b1723fb74129957164aa97735f28ea6bca8b2bece71a21a8d7e735aee13b17607702456ff2e1e7a6161746612151"

RPROVIDES:${PN} += "libucs-devel libucs-devel(aarch-64) pkgconfig(ucx-ucs)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libucs0"

inherit rpm
