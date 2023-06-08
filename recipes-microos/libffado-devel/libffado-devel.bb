SUMMARY = "Development files for ffado"
DESCRIPTION = "This package supplys the files necessary to develop \
applications that use the FFADO libraries and api."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.3"

RPM_NAME = "libffado-devel-2.4.3-3.1.aarch64.rpm"
RPM_HASH = "be5e56f4f27bdfcd9cec4c9311e0de265443c6d43969c549c17ca27748b47f139a7a530658ed6d5d16b2cc709a368c352561a573be6ec23a21473c18cfc745da"

RPROVIDES:${PN} += "libffado-devel libffado-devel(aarch-64) pkgconfig(libffado)"
RDEPENDS:${PN} += "/usr/bin/pkg-config glibc-devel libconfig-devel libdbus-c++-devel libffado2"

inherit rpm
