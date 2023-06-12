SUMMARY = "SCAP content"
DESCRIPTION = "SCAP content for Fedora delivered by Open-SCAP project."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.7"

RPM_NAME = "openscap-content-1.3.7-1.1.aarch64.rpm"
RPM_HASH = "43eeb2eb519e5bc958c0c69c7a4b19ed8fbb2c2482542fec4c6c52d6f7671519e24d290fa162b8fe0a235989da61df258e5bbcaaec5c8005ab6d2ace87d5625a"

RPROVIDES:${PN} += "openscap-content \
openscap-content(aarch-64)"
RDEPENDS:${PN} += "libopenscap25 \
openscap"

inherit rpm
