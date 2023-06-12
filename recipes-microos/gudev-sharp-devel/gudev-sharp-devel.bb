SUMMARY = ".NET/C# Bindings for GUDev"
DESCRIPTION = "Files for developing programs that use gudev-sharp"
LICENSE = "LGPL-2.1"

PV = "0.2"

RPM_NAME = "gudev-sharp-devel-0.2-21.11.aarch64.rpm"
RPM_HASH = "a394b82834356feb08bbeab198e4bedfb2596f77886a044ef0d29f080f12b22a517c211589ba0dd0f1c873f85ced417f2e3d057738279be6a3724d66eaef19dc"

RPROVIDES:${PN} += "gudev-sharp-devel \
gudev-sharp-devel(aarch-64) \
pkgconfig(gudev-sharp-1.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
gudev-sharp \
pkgconfig(glib-sharp-2.0)"

inherit rpm
