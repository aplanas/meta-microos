SUMMARY = "Welsh language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Welsh language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-cym-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "77bd51b5c7a8eb1e3b1567bf8dd52f65a5b61086e08cc67318eea6490f982fe3e31fdd90d5440c77da47e9c0cc4d2a0b751ff871fda2a4e98a3c3bdac1c6666e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-cym \
tesseract-ocr-traineddata-welsh \
tesseract-traineddata-welsh"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
