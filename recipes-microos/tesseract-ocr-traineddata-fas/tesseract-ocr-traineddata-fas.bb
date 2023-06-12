SUMMARY = "Persian (Farsi) language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Persian (Farsi) language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-fas-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "a17201cc553ee3c52de1bf331999347825d0defe9eb496132114772696d5fe6565c5c9dad119bb1ae7647d5d1ffffc8b42975ff38150dd9901a9a1f84ea474df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-fas \
tesseract-ocr-traineddata-persian \
tesseract-traineddata-persian"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
