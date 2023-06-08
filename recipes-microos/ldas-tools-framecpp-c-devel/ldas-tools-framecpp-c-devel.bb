SUMMARY = "Headers and source files for developing with ldas-tools-framecpp's in C"
DESCRIPTION = "This package provides the headers and sources needed for developing programs \
with ldas-tools-framecpp in C."
LICENSE = "GPL-2.0-or-later"

PV = "2.7.0"

RPM_NAME = "ldas-tools-framecpp-c-devel-2.7.0-2.12.aarch64.rpm"
RPM_HASH = "42c36ca3fe2899c80d90759aefa7fc860f5a351b9c1ccdf09c70478a682464b1130a7a478765cf932d1064625f33e8f33d7d713aa6c1f407bcb079ff7417aebf"

RPROVIDES:${PN} += "ldas-tools-framecpp-c-devel ldas-tools-framecpp-c-devel(aarch-64) pkgconfig(framecppc)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libframecppc3"

inherit rpm
