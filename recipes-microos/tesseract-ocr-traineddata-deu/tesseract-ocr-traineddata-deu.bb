SUMMARY = "German language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the German language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-deu-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "ce1d70b82240f3083ae4948ddf81ff1fa1ef89925cf036986fbe236fd8e2836daa5d816ddef0c117ce9c93d5443c4bfeacb29cf6043394adf3c3315290189a5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-deu \
tesseract-ocr-traineddata-german \
tesseract-traineddata-german"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
