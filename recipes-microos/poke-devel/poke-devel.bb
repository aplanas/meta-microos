SUMMARY = "Devel package for poke"
DESCRIPTION = "Development package for poke."
LICENSE = "GPL-3.0-or-later"

PV = "3.1"

RPM_NAME = "poke-devel-3.1-1.1.aarch64.rpm"
RPM_HASH = "a64d19cd40bd0dd8faf736fbf7f0221c935f80d05e22a7322a74cf5c4f5b211e4d756e00451a5c56e49488ff359b0bcadb848bfeeb15a641a3441b25363faec8"

RPROVIDES:${PN} += "pkgconfig(poke) poke-devel poke-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libpoke0"

inherit rpm
