SUMMARY = "Uzbek language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Uzbek language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-uzb-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "76c0b21c4305a24f72705ffb797d35150ac60ac05c044ff7ec8e6948c747fdeda93d2a09c3a8a8c9c910b9e5856a3c709324f56039a74bc2d3ab226d034acb86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-uzb \
tesseract-ocr-traineddata-uzbek \
tesseract-traineddata-uzbek"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
