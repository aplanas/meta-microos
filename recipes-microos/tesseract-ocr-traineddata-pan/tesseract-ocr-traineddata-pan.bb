SUMMARY = "Punjabi language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Punjabi language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-pan-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "9fb1ec1a338dd36103cca1362a54d29a287b65213842dff2aa7a3d5755689027f8dede1838e0dffec02cf41a4f5ddbd5f3aac9087a691fbb311859d1cf11b65e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-pan \
tesseract-ocr-traineddata-punjabi \
tesseract-traineddata-punjabi"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
