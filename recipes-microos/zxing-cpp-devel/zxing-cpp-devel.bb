SUMMARY = "Header files for zxing, a library for processing 1D and 2D barcodes"
DESCRIPTION = "ZXing ('zebra crossing') is an multi-format 1D/2D barcode image \
processing library. This package provides header files to use ZXing in \
other applications."
LICENSE = "Apache-2.0 & Zlib & LGPL-2.1-with-Qt-Company-Qt-exception-1.1"

PV = "2.0.0"

RPM_NAME = "zxing-cpp-devel-2.0.0-2.1.aarch64.rpm"
RPM_HASH = "a483005c9a3e6b631af66438a67536077673f08503736f412368b3ecb488c62a51681958e7015f9b13daffdb87d95b4a1d182b2a4a8e62fa95f1a7f418f2c7e8"

RPROVIDES:${PN} += "cmake(ZXing) pkgconfig(zxing) zxing-cpp-devel zxing-cpp-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libZXing3"

inherit rpm
