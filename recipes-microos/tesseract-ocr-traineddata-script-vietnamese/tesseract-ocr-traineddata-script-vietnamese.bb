SUMMARY = "Vietnamese script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Vietnamese script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-script-vietnamese-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "5c5ae95819216f0c2653ab39efb91b4442c4a607b5de2ac13bc3ef52fa8e4a7ab25505e4a49d6b16ecb6fb710f13261fb729314b159b59b3b86a8c484acaed14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-vietnamese"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
