SUMMARY = "Luxembourgish language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Luxembourgish language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-ltz-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "02174eecf39acc2ee10d17b4cd30e9e1b2da8cbc862469d467e663d8bf0e431b55df6c121e94923153fa7bff97fdd9fc0bdb1670d37fecdf37cd0b517ac61d1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-ltz tesseract-ocr-traineddata-luxembourgish tesseract-traineddata-luxembourgish"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
