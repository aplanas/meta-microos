SUMMARY = "Utility to compile XKB keyboard description -- Development Files"
DESCRIPTION = "The xkbcomp keymap compiler converts a description of an XKB keymap \
into one of several output formats."
LICENSE = "MIT"

PV = "1.4.6"

RPM_NAME = "xkbcomp-devel-1.4.6-1.2.aarch64.rpm"
RPM_HASH = "263838e446c69a965757b69db89fd800b2aeab9e51c432c9613768f68a23d3633d1588b4fcbdeff858842846bc5edf1e28dc9bee149759643ae8e966bd0f41b7"

RPROVIDES:${PN} += "pkgconfig(xkbcomp) xkbcomp-devel xkbcomp-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config xkbcomp"

inherit rpm
