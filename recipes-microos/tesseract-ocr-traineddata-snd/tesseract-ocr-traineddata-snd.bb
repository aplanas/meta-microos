SUMMARY = "Sindhi language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Sindhi language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-snd-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "99f6f151c6f7d73fc3801341e69792655c176bee329cacc273119aedcc8aec3397a4c67ec3c0b008a443e8ce4001544244bcf736e2c19fe03186d1ea9243df66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-sindhi tesseract-ocr-traineddata-snd tesseract-traineddata-sindhi"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
