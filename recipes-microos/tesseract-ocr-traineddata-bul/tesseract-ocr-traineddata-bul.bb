SUMMARY = "Bulgarian language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Bulgarian language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-bul-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "cfa0d409389b4c64006de6f7c64d228791e04c59564f11f5a0d962966f68bc61118244c4987bcefa482293160c5153cad7a83b5af6150e88326520e53ca491c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-bul \
tesseract-ocr-traineddata-bulgarian \
tesseract-traineddata-bulgarian"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
