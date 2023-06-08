SUMMARY = "Malayalam language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Malayalam language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-mal-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "c5dfd7ad675b58785a2cf7d0e8f006db0f0a8c40acfd926c129e325f3abcfa03c3ec9b0cd975b9ec4daac7acb3ac491e09589c2fbbbc5acab7d39938fed54e97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-mal tesseract-ocr-traineddata-malayalam tesseract-traineddata-malayalam"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
