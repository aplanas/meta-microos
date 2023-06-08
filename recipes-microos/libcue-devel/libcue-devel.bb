SUMMARY = "Development files for libcue, a CUE sheet parsing library"
DESCRIPTION = "libcue parses so-called cue sheets from a char string or a FILE \
pointer. \
 \
This package contains the development library symlink and header \
files."
LICENSE = "GPL-2.0-only"

PV = "2.2.1"

RPM_NAME = "libcue-devel-2.2.1-1.15.aarch64.rpm"
RPM_HASH = "52bcef857bef09ded542747539e71931f284150ccfd243b02ae3ad944979dca9c7f31d5c8517123cf3ee66fea68594057666c104671bd91bc5b79a57291a1812"

RPROVIDES:${PN} += "libcue-devel libcue-devel(aarch-64) pkgconfig(libcue)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libcue2"

inherit rpm
