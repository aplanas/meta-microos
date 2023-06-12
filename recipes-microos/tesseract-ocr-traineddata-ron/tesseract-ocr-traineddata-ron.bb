SUMMARY = "Romanian language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Romanian language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-ron-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "2b30b0d4bcda2c7e5ae8f6c661c53374aa62b811c48aacf715073761438f98ee258e43ff776d7fd7fb7a774eb661a64c2d1a799a5e6d58dc95d7779068abb0e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-romanian \
tesseract-ocr-traineddata-ron \
tesseract-traineddata-romanian"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
