SUMMARY = "Tesseract Open Source OCR Engine Development files"
DESCRIPTION = "This package contains development files for the Tesseract Open Source OCR \
Engine."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "5.3.0"

RPM_NAME = "tesseract-ocr-devel-5.3.0-3.3.aarch64.rpm"
RPM_HASH = "87c4662ab35fa99b8986d3fb069f64452d43268d0ad732622554bb56b0bd5a5f3626967a933da542c221af48cfd17b1f68e99cb4477d6a39bda3e3fe6565712d"

RPROVIDES:${PN} += "cmake(Tesseract) pkgconfig(tesseract) tesseract-ocr-devel tesseract-ocr-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libtesseract-5_3_0 pkgconfig(lept) pkgconfig(libarchive)"

inherit rpm
