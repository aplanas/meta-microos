SUMMARY = "Russian language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Russian language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-rus-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "db57df5046e8a9349e37ac435d70385613a56c91d2f5bcd9aabd04550bf4f0228e2f04fbf5e0cb1624bfda38b84e5e0daba2a09b85e8d59e4b1a3d43ba7904d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-rus tesseract-ocr-traineddata-russian tesseract-traineddata-russian"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
