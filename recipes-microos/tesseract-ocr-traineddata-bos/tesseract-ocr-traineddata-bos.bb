SUMMARY = "Bosnian language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Bosnian language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-bos-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "c5c7d6c2e4074eb79cbc4102ee5ca126c11cf65d8458181ff2a9febcccedee9ea533252a0663a92f343f80bbae8f527078f4d3ff431519fc712a97fac605ff01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-bos tesseract-ocr-traineddata-bosnian tesseract-traineddata-bosnian"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
