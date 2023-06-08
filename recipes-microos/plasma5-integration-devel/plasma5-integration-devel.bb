SUMMARY = "plasma5-integration development headers"
DESCRIPTION = "This package provides development headers for plasma5-integration. They \
are not meant to be used standalone, but are required for building other \
Plasma components."
LICENSE = "GPL-2.0+"

PV = "5.27.4"

RPM_NAME = "plasma5-integration-devel-5.27.4-1.2.aarch64.rpm"
RPM_HASH = "e407e208e394146ef4e8e0ea62c5ee1edabcaf257f0600f36c2eb5370800e25908a9f1ab534c129dd272cbaea1bee6fdc4061e77eeec0fe4b48258d533a3e4aa"

RPROVIDES:${PN} += "pkgconfig(plasma-key-data) plasma5-integration-devel plasma5-integration-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config plasma5-integration-plugin"

inherit rpm
