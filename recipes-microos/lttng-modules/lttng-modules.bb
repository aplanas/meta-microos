SUMMARY = "Licensing information for package lttng-modules"
DESCRIPTION = "This package provides licensing documentation for the lttng kmp packages."
LICENSE = "GPL-2.0-only & LGPL-2.1-only & MIT"

PV = "2.13.8"

RPM_NAME = "lttng-modules-2.13.8-1.16.aarch64.rpm"
RPM_HASH = "6684b0a9d3a27dbb2bcbf5259ab8027e5500650e0f5e9d482398df6b719c0bdb5b7fcf1291eec0ba0be1f2069c6d52ef61050e57c9092744c0cda87f0c13b6ba"

RPROVIDES:${PN} += "lttng-modules lttng-modules(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
