SUMMARY = "Development files for the YUV scaling and conversion library"
DESCRIPTION = "This package contains the development files \
for the YUV scaling and conversion library"
LICENSE = "BSD-3-Clause"

PV = "20220920+f9fda6e"

RPM_NAME = "libyuv-devel-20220920+f9fda6e-1.3.aarch64.rpm"
RPM_HASH = "831f202a8c90e3a1528997f5438587d4fb193ecf56204068fb3c8400a656749654594b5d52e506ec3ddfeed21036c25ac26957c5705c0be403bed89f32046952"

RPROVIDES:${PN} += "libyuv-devel libyuv-devel(aarch-64) pkgconfig(libyuv)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libyuv0"

inherit rpm
