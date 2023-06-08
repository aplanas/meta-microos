SUMMARY = "Development files for libprelude"
DESCRIPTION = "Libprelude is a library that guarantees secure connections between all sensors \
and the Prelude Manager. Libprelude provides an Application Programming Interface \
(API) for the communication with Prelude sub-systems, it supplies the necessary \
functionality for generating and emitting IDMEF events with Prelude and automates \
the saving and re-transmission of data in times of temporary interruption of one \
of the components of the system."
LICENSE = "LGPL-2.1-only & LGPL-2.1-or-later"

PV = "5.2.0"

RPM_NAME = "libprelude-devel-5.2.0-2.14.aarch64.rpm"
RPM_HASH = "008efad05a5bf6e15906c6c147a401f7c8f76c78a7b66f21957e5b57454df43ed9f7619b1321d19b2117ce4793193e5b5bbca4ed0be5d3943bec03a2cb73479b"

RPROVIDES:${PN} += "libprelude-devel libprelude-devel(aarch-64) pkgconfig(libprelude)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/pkg-config libgcrypt-devel libgpg-error-devel libprelude28 libpreludecpp12 pkgconfig(gnutls) pkgconfig(libpcre)"

inherit rpm
