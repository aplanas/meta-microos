SUMMARY = "Include files and static libraries for developing sword applications"
DESCRIPTION = "Include files and static libraries for developing sword applications. This package \
is required to compile Sword frontends, too."
LICENSE = "GPL-2.0-only & Apache-2.0"

PV = "1.8.1"

RPM_NAME = "sword-devel-1.8.1-1.33.aarch64.rpm"
RPM_HASH = "733a79a9f9f9aca6e15bb1bd5aa6044a5679762bf8a3d12c30bbbcb3c3aac4119a9d00cdd9b338423bbe83647a19fdfda829b449a925710d42630a2e4a5c9ddb"

RPROVIDES:${PN} += "pkgconfig(sword) sword-devel sword-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libsword-1_8_1 pkgconfig(libcurl)"

inherit rpm
