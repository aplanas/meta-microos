SUMMARY = "Breton language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Breton language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-bre-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "f4641f33c9e007f492e4bc15d79b0633c00f8e9d7db185aab4b90b24edd96de5fa769c40083c18984ff00a8023ac241b06cbfc9e62ebcc3179b526de499ab073"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-bre \
tesseract-ocr-traineddata-breton \
tesseract-traineddata-breton"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
