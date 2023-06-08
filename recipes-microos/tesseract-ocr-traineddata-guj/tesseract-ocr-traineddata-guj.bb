SUMMARY = "Gujarati language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Gujarati language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-guj-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "9045956a0c18f6494c26961add3379f3312048f5446d257a929eb06044ed2246f3d2d243cd4d18178790ee19ce2889e06f27362bca78f13457e5e38a2790e450"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-guj tesseract-ocr-traineddata-gujarati tesseract-traineddata-gujarati"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
