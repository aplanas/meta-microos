SUMMARY = "Irish language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Irish language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-gle-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "9449f01783b14d86943cd170cc16eff7b5c53e7cd1923c8124853ebb5b64fc6ad3e88043efc2ca720a1a8d37efd351b8866a6b3d5bd5692708a75b90ad895f19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-gle tesseract-ocr-traineddata-irish tesseract-traineddata-irish"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
