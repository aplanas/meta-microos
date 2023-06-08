SUMMARY = "Inuktitut language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Inuktitut language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-iku-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "c011a165c730389d07d06d30323eccb387a7e4435ab13989363ef5cb57c10c6aa48ff3ca4dcf94885c9a5de8e3f786340ca87b0c47b5ea368dd594d80de8efa2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-iku tesseract-ocr-traineddata-inuktitut tesseract-traineddata-inuktitut"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
