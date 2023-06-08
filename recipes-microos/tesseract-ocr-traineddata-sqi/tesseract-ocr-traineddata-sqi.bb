SUMMARY = "Albanian language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Albanian language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-sqi-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "2cdc34edfe04c93353ac034338177a2fdc6a087688a7bc36b83fb6a5366f744cdb3f95f2f6695b5fba28ef84614f797a4347842987603866c6570266864cfcca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-albanian tesseract-ocr-traineddata-sqi tesseract-traineddata-albanian"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
