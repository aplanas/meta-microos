SUMMARY = "Finnish language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Finnish language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-fin-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "bd5fb98ba4fe4383260c76413d2be51361d60df7ac1c24837e7f555d7dd95a7a90c3063d9f03a19da224a29b0e2c306bafafb1d05792c3378063ff2f6cb9fa50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-fin tesseract-ocr-traineddata-finnish tesseract-traineddata-finnish"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
