SUMMARY = "Danish language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Danish language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-dan-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "d27a1354e5bd9ce614454df576d9ae7fbf5494c32b61de4c29e8f17952c61a4827bd65b418c0d1e793c2d6890b56145d82ac47e442d0fa058d865261df7cac98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-dan tesseract-ocr-traineddata-danish tesseract-traineddata-danish"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
