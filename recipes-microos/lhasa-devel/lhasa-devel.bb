SUMMARY = "Development files for liblhasa, a LHARC decompression library"
DESCRIPTION = "liblhasa is the backend to the Lhasa tool, offering decompressing for \
'.lzh' (LHA/LHarc) and '.lzs' (LArc) archives. \
 \
This package contains the development headers for the library found \
in liblhasa0."
LICENSE = "ISC"

PV = "0.3.1"

RPM_NAME = "lhasa-devel-0.3.1-1.24.aarch64.rpm"
RPM_HASH = "4096e0b63f49cd1d2c3f33adf1895059182a12c6c23b5dacd349b8577f0031a82838bbe00edc0a148a83ea90f2de577023e32a2774b2ccb8b12c47250394bb3a"

RPROVIDES:${PN} += "lhasa-devel lhasa-devel(aarch-64) pkgconfig(liblhasa)"
RDEPENDS:${PN} += "/usr/bin/pkg-config liblhasa0"

inherit rpm
