SUMMARY = "Default branding for pw3270"
DESCRIPTION = "GTK-based IBM 3270 terminal emulator with many advanced features. It can be used to communicate with any IBM host that supports 3270-style connections over TELNET. \
 \
This package contains the default branding for pw3270."
LICENSE = "GPL-2.0-only"

PV = "5.4"

RPM_NAME = "pw3270-branding-5.4-2.1.noarch.rpm"
RPM_HASH = "a5c9238e4388dee1caed8c3a1e44c1119ae7dd1efb8a0bebc173fccc04f5b83769e9d3ecd34f9728532c1c73030bab8a2b0d4e33ad8c820e1b67d468d1cf2c34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pw3270-branding"
RDEPENDS:${PN} += "desktop-file-utils \
pw3270"

inherit rpm
