SUMMARY = "Development files for liballegro_main"
DESCRIPTION = "Development files needed to build applications which use liballegro_main."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.8.0"

RPM_NAME = "liballegro_main5_2-devel-5.2.8.0-1.3.aarch64.rpm"
RPM_HASH = "ad96bdd77aa76cedab17a24a8d6986e8df3070519d309f939b71793922dda5467e15f0358b2c0d2a08944a88e4c08893fa5e4a0d22e72e3567a91a47b90d9ee4"

RPROVIDES:${PN} += "liballegro_main5_2-devel liballegro_main5_2-devel(aarch-64) pkgconfig(allegro_main-5)"
RDEPENDS:${PN} += "/usr/bin/pkg-config liballegro_main5_2 pkgconfig(allegro-5)"

inherit rpm
