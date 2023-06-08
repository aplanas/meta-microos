SUMMARY = "Library to read and write syspref's capture format"
DESCRIPTION = "This static library allows external tooling to read and write the \
syspref's capture format."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "3.48.0"

RPM_NAME = "sysprof-capture-devel-static-3.48.0-1.1.aarch64.rpm"
RPM_HASH = "095e6262d0db644b35c5948b94cb288733cba4e5cb45cfacc2e9ead122cf53bfe6bb375ee6f89c00fe882513d6ac862e7035ad2f0717fc34b7751549f7e3b222"

RPROVIDES:${PN} += "pkgconfig(sysprof-capture-4) sysprof-capture-devel-static sysprof-capture-devel-static(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
