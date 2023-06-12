SUMMARY = "Italian language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Italian language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-ita-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "d6de1ec4af9e04d7398f91021709e7566becce7a6d8cec6aaf1f1038e2cfbf4be17ff73efc27d7df1ce0dcbd0648feed5e6a3ab4715d1a81947156421209b682"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-ita \
tesseract-ocr-traineddata-italian \
tesseract-traineddata-italian"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
