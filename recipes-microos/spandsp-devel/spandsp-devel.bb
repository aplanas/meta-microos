SUMMARY = "Development files for the SpanDSP library"
DESCRIPTION = "This package contains files that are needed for developing or compiling \
software that uses the spandsp library."
LICENSE = "LGPL-2.1-only"

PV = "3.0.0.g15"

RPM_NAME = "spandsp-devel-3.0.0.g15-3.1.aarch64.rpm"
RPM_HASH = "548d7fb195cd54a05abec4f09aa9fb3395ca920ca41bc68a56014771a6affe88237820622cadd260cde290f564aa7efbd6eb10d404556f643aa57f01562596e3"

RPROVIDES:${PN} += "pkgconfig(spandsp) spandsp-devel spandsp-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libjpeg-devel libspandsp3 libtiff-devel"

inherit rpm
