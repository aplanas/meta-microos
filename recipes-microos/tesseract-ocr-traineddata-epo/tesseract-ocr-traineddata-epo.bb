SUMMARY = "Esperanto language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Esperanto language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-epo-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "ec9c4a9a7820759fda56e1900401699bb67367373d733c1ddf162bb24dc3a12afacc6c21e68e0fb461ef2f5e6448b1520deed0e4b640489eccca579710a72ca4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-epo \
tesseract-ocr-traineddata-esperanto \
tesseract-traineddata-esperanto"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
