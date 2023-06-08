SUMMARY = "TN3270 Access library development files"
DESCRIPTION = "Header files for the TN3270 access library."
LICENSE = "LGPL-3.0-only"

PV = "5.4"

RPM_NAME = "lib3270-devel-5.4-1.10.aarch64.rpm"
RPM_HASH = "eff5a62ed130b83179f2d0b95b4e54a0d349a67c64233b6748da5f015843830bb876b4e89d7fe1148195ac8c18c84b04ea163716994f5ecc22eac0bb45d9de7b"

RPROVIDES:${PN} += "lib3270-devel lib3270-devel(aarch-64) pkgconfig(lib3270)"
RDEPENDS:${PN} += "/usr/bin/pkg-config lib3270-5_4"

inherit rpm
