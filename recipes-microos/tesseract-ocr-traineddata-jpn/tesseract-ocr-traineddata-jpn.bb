SUMMARY = "Japanese language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Japanese language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-jpn-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "bff0491b7d546e8ef268ce6a88761b2883a78e8c2d43d4369245e6a576583605cf5d956ae01a0024a9f5370c0e640ce8fd2510b9950325b947b6c5ad4aa83071"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-japanese \
tesseract-ocr-traineddata-jpn \
tesseract-traineddata-japanese"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
