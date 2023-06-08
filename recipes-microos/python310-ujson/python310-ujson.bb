SUMMARY = "JSON encoder and decoder for Python"
DESCRIPTION = "An ultrafast JSON encoder and decoder written in pure C with \
bindings for Python 2.7 and 3.5+"
LICENSE = "BSD-3-Clause"

PV = "5.7.0"

RPM_NAME = "python310-ujson-5.7.0-1.2.aarch64.rpm"
RPM_HASH = "4b6227938adb7737e5bf17cc0a79dc155730ebc986fdf823596f3d9b98caa63721dd82a6e92f39796107ffe9365108a98e8ff3d4477145adcdf5397abd97dbc0"

RPROVIDES:${PN} += "python3-ujson python3.10dist(ujson) python310-ujson python310-ujson(aarch-64) python3dist(ujson)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libdouble-conversion.so.3()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) python(abi)"

inherit rpm
