SUMMARY = "Faroese language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Faroese language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-fao-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "d65383269d2e02568e95341b6f8b585cca64abe0d374b22edd0a1dea35695749c037bd7a38b120ebe5af332991e4b1f2d7599998f4d9f1d89232686639406b30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-fao tesseract-ocr-traineddata-faroese tesseract-traineddata-faroese"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
