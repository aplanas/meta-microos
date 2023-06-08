SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.18"

RPM_NAME = "scim-devel-1.4.18-5.10.aarch64.rpm"
RPM_HASH = "6bd3bb0a59661c87793cb71214206f71c17764f7b9f983fd32f70d4a483b5fcd9045fcd375266672b5324ad2496619a3955098514c300d8167dbd53c1976fdc0"

RPROVIDES:${PN} += "pkgconfig(scim) pkgconfig(scim-gtkutils) pkgconfig(scim-x11utils) scim-devel scim-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config pkgconfig(gtk+-3.0) pkgconfig(scim) scim"

inherit rpm
