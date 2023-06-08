SUMMARY = "Hebrew language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Hebrew language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-heb-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "e3395dd70c63d4bfcd5d277cbbc196ac4b56bbc1b312cc7388c1bd78e8c92c739aa10ffa574b46ad51133e95c9d12ec6c7a4e13861407c9d63886725611062e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-heb tesseract-ocr-traineddata-hebrew tesseract-traineddata-hebrew"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
