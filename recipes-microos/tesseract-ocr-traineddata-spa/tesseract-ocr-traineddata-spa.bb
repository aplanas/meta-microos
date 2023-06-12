SUMMARY = "Spanish language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Spanish language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-spa-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "53d2bb69f4ab2f054c8a9a867cdd5f9dfac6b9d67256eb17bfd29fc05f69c876d3413883798812c7ddc1effba1912dde58fcec1fbf17d0caa81080e3574545cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-spa \
tesseract-ocr-traineddata-spanish \
tesseract-traineddata-spanish"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
