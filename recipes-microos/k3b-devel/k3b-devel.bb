SUMMARY = "Development files for k3b"
DESCRIPTION = "This package contain files needed for development with k3b."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "k3b-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "c4f53e86cf638520066f4a5e60b98aab244479f11d7d9cdfb1978f91b3c210d266513935d0123499cb18de34ae87efaed31959448e0013cc7a0c5bd6248e9fe0"

RPROVIDES:${PN} += "k3b-devel k3b-devel(aarch-64)"
RDEPENDS:${PN} += "k3b"

inherit rpm
