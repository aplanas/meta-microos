SUMMARY = "Client library for interacting with the Zeitgeist daemon -- Development Files"
DESCRIPTION = "Libzeitgeist is a client library for interacting with the Zeitgeist \
daemon."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.18"

RPM_NAME = "libzeitgeist-devel-0.3.18-12.3.aarch64.rpm"
RPM_HASH = "272824472a1186103a8b98e288fbe8501bc4c800703f5aad1efe62471e58a249bdd5f5023523d0f4dd28f2d7ba2e65152d66d60cd6fbb664248573df62f4d88f"

RPROVIDES:${PN} += "libzeitgeist-devel libzeitgeist-devel(aarch-64) pkgconfig(zeitgeist-1.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libzeitgeist-1_0-1 pkgconfig(glib-2.0) pkgconfig(gobject-2.0)"

inherit rpm
