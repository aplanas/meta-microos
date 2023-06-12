SUMMARY = "Development package for opusfile"
DESCRIPTION = "Files for development with opusfile."
LICENSE = "BSD-3-Clause"

PV = "0.12"

RPM_NAME = "opusfile-devel-0.12-2.3.aarch64.rpm"
RPM_HASH = "43a7c79c1e78711a158ca5088e722cf0c04bd4e77f0daad60195ec51bb87597cab1f08afb8e25ecd588f9ca4f96f13cd3301d3f8011f5ced6cced6bb8037eb3d"

RPROVIDES:${PN} += "opusfile-devel \
opusfile-devel(aarch-64) \
pkgconfig(opusfile) \
pkgconfig(opusurl)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopusfile0 \
pkgconfig \
pkgconfig(ogg) \
pkgconfig(openssl) \
pkgconfig(opus) \
pkgconfig(opusfile)"

inherit rpm
