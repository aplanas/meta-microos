SUMMARY = "Tesseract Open Source OCR Engine Development files"
DESCRIPTION = "This package contains development files for the Tesseract Open Source OCR \
Engine."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "5.3.0"

RPM_NAME = "tesseract-ocr-devel-5.3.0-3.4.aarch64.rpm"
RPM_HASH = "fdad5f3ee93368b75322b2e7335a75b79a30231f2bd99a1e59d7416c6cc17bd5caf9cbb080dd58acfeecb33269d56dbf28c3cf23443b10093e4ef4627ada68cb"

RPROVIDES:${PN} += "cmake(Tesseract) pkgconfig(tesseract) tesseract-ocr-devel tesseract-ocr-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libtesseract-5_3_0 pkgconfig(lept) pkgconfig(libarchive)"

inherit rpm
