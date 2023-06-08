SUMMARY = "Library and Include Files of the PCI utilities"
DESCRIPTION = "This package contains the files that are necessary for software \
development using the PCI utilities."
LICENSE = "GPL-2.0-or-later"

PV = "3.9.0"

RPM_NAME = "pciutils-devel-3.9.0-2.3.aarch64.rpm"
RPM_HASH = "cb538bebc70fcbabe75e87ff8543a382d2dc4be0a810b3b823b08c1cbf4676393d646b9a5a8764d63de67325d4d9a956a5eccfb6d4060c875aea3a4a0fa54a4e"

RPROVIDES:${PN} += "pciutils-devel pciutils-devel(aarch-64) pkgconfig(libpci)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libpci3"

inherit rpm
