SUMMARY = "Pashto language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Pashto language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-pus-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "f4d7b5ffac464b220fbcf68532f9eb48719695a5e80a543a7cdb8d66300a7782dc265b07209971d62c7580967bf1277e030751fdedc96edb2ee04044a95e308c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-pashto tesseract-ocr-traineddata-pus tesseract-traineddata-pashto"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
