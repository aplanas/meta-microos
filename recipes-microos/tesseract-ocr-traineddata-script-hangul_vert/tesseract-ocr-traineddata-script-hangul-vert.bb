SUMMARY = "Hangul (Vertical) script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Hangul (Vertical) script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-script-hangul_vert-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "ec4750c37faf622b3ceed1d057a2bdfadca850bf5fd7453807bd2f0ce47d6b55be2ef7cf6d4e9e21546f2690e65c126d5f839572c393815e6ef9eb9652d7c246"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-hangul_vert"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
