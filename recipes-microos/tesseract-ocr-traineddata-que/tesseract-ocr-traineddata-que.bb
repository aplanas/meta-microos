SUMMARY = "Quechuan language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Quechuan language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-que-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "0dee40fd8204895a976d5211d00b3cf6a5830d79dd91ba5589b3b7b808ee5e25189f60d2f7e99a58d871cdb87bdc24038f620ec54f106c62b39715e943fb51a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-que \
tesseract-ocr-traineddata-quechuan \
tesseract-traineddata-quechuan"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
