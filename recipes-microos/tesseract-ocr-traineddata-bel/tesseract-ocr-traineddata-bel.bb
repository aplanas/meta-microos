SUMMARY = "Belarusian language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Belarusian language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-bel-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "e2f15288dc40d7786fef58a8814dcab388b78877b481f68298f8c5aae1083cd22a373d6fd99fc661fe73f3bae3602504a66bcdc985c018cd4ec06c0f8c0a9ac1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-bel \
tesseract-ocr-traineddata-belarusian \
tesseract-traineddata-belarusian"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
