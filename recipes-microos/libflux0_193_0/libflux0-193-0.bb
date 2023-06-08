SUMMARY = "Influx data language"
DESCRIPTION = "Flux is a lightweight scripting language for querying databases (like InfluxDB) \
and working with data. It is part of InfluxDB 1.7 and 2.0, but can be run \
independently of those. This repository contains the language definition and an \
implementation of the language core."
LICENSE = "MIT"

PV = "0.193.0"

RPM_NAME = "libflux0_193_0-0.193.0-1.1.aarch64.rpm"
RPM_HASH = "0c7b0aa87a296aa727b347d8defcf82f2d0dbfd82046f2ce1c9bace60bd0e8a4aacb73e53283d1e0cf56ed763e0eb5ce1236d2c563677c1a6392585f89e27ff6"

RPROVIDES:${PN} += "libflux libflux.so.0.193.0()(64bit) libflux0_193_0 libflux0_193_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit)"

inherit rpm
