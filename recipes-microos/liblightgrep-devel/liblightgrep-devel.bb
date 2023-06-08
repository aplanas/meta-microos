SUMMARY = "Development files for liblightgrep"
DESCRIPTION = "Development files for liblightgrep, a regex engine designed for digital forensics. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of liblightgrep."
LICENSE = "LGPL-3.0-or-later"

PV = "1.4"

RPM_NAME = "liblightgrep-devel-1.4-5.33.aarch64.rpm"
RPM_HASH = "ee57303f0a3aec6d27614619db8fc849e3dd64e87019286c0a447f2302aa13f0e00b6e3867d49dacd36cfc80fb070b67aa93b26fd7ed17adcd934e5998a4ed0b"

RPROVIDES:${PN} += "liblightgrep-devel liblightgrep-devel(aarch-64) pkgconfig(lightgrep)"
RDEPENDS:${PN} += "/usr/bin/pkg-config liblightgrep0 pkgconfig(icu-uc)"

inherit rpm
