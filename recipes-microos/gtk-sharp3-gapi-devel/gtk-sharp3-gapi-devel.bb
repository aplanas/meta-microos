SUMMARY = ".NET/C-Sharp Bindings for GIO"
DESCRIPTION = "Files for developing programs that use gapi-sharp3."
LICENSE = "LGPL-2.1-only"

PV = "2.99.4"

RPM_NAME = "gtk-sharp3-gapi-devel-2.99.4-6.11.aarch64.rpm"
RPM_HASH = "11938c75074abfc321f57a35b0cb196d08665977f80c8cb164ff4019f8aa79b5be56b64bad967b23bcd4a0a044eb3dc30bebf60f659605593f41d19c8d566d18"

RPROVIDES:${PN} += "gtk-sharp3-gapi-devel gtk-sharp3-gapi-devel(aarch-64) pkgconfig(gapi-3.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config gtk-sharp3-gapi"

inherit rpm
