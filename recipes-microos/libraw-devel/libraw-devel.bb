SUMMARY = "Development files for libraw"
DESCRIPTION = "LibRaw is a library for reading RAW files obtained from digital photo \
cameras (CRW/CR2, NEF, RAF, DNG, and others). \
 \
LibRaw is based on the source codes of the dcraw utility, where part of \
drawbacks have already been eliminated and part will be fixed in future."
LICENSE = "CDDL-1.0 | LGPL-2.1-only"

PV = "0.21.1"

RPM_NAME = "libraw-devel-0.21.1-2.1.aarch64.rpm"
RPM_HASH = "3b7cb01be98cb6a5018cfeff18eefaf89390bf8a9a646bb7c036877b461905c339a81baf1309b5e94eaedc180b7447be228b2da1e45d3ca46aa8cfa013182e3d"

RPROVIDES:${PN} += "libraw-devel \
libraw-devel(aarch-64) \
pkgconfig(libraw) \
pkgconfig(libraw_r)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libraw23 \
pkgconfig(lcms2)"

inherit rpm
