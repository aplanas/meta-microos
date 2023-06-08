SUMMARY = "Greek language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Greek language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-ell-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "e4ac3912f6e5e26ee217200becdb9d2b29b33f4c429e39affbf5e396a727f960063fba4a9b5029f46a51c3c36a4fdbd4ed340d9baca366feb484187addbcbc8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-ell tesseract-ocr-traineddata-greek tesseract-traineddata-greek"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
