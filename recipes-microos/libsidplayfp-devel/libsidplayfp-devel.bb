SUMMARY = "Development files for libsidplayfp"
DESCRIPTION = "This package contains headers and libraries required to build applications that \
use libsidplayfp."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.2"

RPM_NAME = "libsidplayfp-devel-2.4.2-2.1.aarch64.rpm"
RPM_HASH = "253ac199e002fb3ccd958add9ccaeb75e783752d72ca4a16b4c8d8780bcc8087f223092cb5d63642b1b6cf686ab7a13160da4d7385b228e29e92e6aaff43121c"

RPROVIDES:${PN} += "libsidplayfp-devel libsidplayfp-devel(aarch-64) pkgconfig(libsidplayfp)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libsidplayfp6"

inherit rpm
