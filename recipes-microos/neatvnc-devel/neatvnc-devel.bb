SUMMARY = "Development files for neatvnc"
DESCRIPTION = "Development files and headers for neatvnc."
LICENSE = "ISC"

PV = "0.6.0"

RPM_NAME = "neatvnc-devel-0.6.0-1.4.aarch64.rpm"
RPM_HASH = "5129944017e2e8439dac453e8cf5a158bb2492f6c96464dcfb8907512b0e1283590ebbefaf309642e0779be9b6bdfab706a047bc8349ed5d6c0e07f7a1faef36"

RPROVIDES:${PN} += "neatvnc-devel neatvnc-devel(aarch-64) pkgconfig(neatvnc)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libneatvnc0 pkgconfig(aml) pkgconfig(gbm) pkgconfig(gnutls) pkgconfig(libavcodec) pkgconfig(libavfilter) pkgconfig(libavutil) pkgconfig(libdrm) pkgconfig(libturbojpeg) pkgconfig(pixman-1) pkgconfig(zlib)"

inherit rpm
