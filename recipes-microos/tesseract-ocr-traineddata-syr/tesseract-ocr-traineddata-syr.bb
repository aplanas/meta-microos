SUMMARY = "Syriac language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Syriac language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-syr-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "b1cc712645040ce4afacabb1cce8670e43930e3440a8a2872778891cc97a6df35e439fe4d85ca8541c2c09d7480ac76178b020681a6e4172ccfb323a5bfb0801"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-syr \
tesseract-ocr-traineddata-syriac \
tesseract-traineddata-syriac"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
