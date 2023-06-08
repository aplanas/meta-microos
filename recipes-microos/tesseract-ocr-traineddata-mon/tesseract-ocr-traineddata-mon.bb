SUMMARY = "Mongolian language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Mongolian language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-mon-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "8c4e2aded1d07fc75cf8f721a8ccf03d410e4aeadcb8fa416fcfd0b8430945d62b8382838a2c19b47ecf86a5d9728c053d25eb1945ca47ead4aaaac7fef61ce4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-mon tesseract-ocr-traineddata-mongolian tesseract-traineddata-mongolian"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
