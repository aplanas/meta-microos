SUMMARY = "Oriya language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Oriya language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-ori-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "b05e2a9f278676e6c1b9e32b6c5c9dde2393516ef51c4f9de438ac50973094182b9fe8b90d7d5d42a1e43a80b1fae8c4ee9e221e35053ad2d8003a6280cf7429"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-ori \
tesseract-ocr-traineddata-oriya \
tesseract-traineddata-oriya"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
