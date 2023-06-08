SUMMARY = "Czech language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Czech language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-ces-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "3d9abaae43b16654b5226e4b4185ea58f1493973c84a58d27d403778d0118b1a18a8bc37454b15301e399d5e7fdf1146b79ea6658f1965906fdf7244507555d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-ces tesseract-ocr-traineddata-czech tesseract-traineddata-czech"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
