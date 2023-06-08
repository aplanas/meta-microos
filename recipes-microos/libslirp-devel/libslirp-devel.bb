SUMMARY = "Development files for libslirp"
DESCRIPTION = "The libslirp-devel package contains libraries and header files for \
developing applications that use libslirp."
LICENSE = "MIT"

PV = "4.7.0+44"

RPM_NAME = "libslirp-devel-4.7.0+44-3.3.aarch64.rpm"
RPM_HASH = "35d4c515fe1738144c102e3587c09cd57402524631a155a5bb7e170845fda2e1d861f292c3edd2dbd8514d1d638d155ca04754010304585c626dc589c2208e95"

RPROVIDES:${PN} += "libslirp-devel libslirp-devel(aarch-64) pkgconfig(slirp)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libslirp0 pkgconfig(glib-2.0)"

inherit rpm
