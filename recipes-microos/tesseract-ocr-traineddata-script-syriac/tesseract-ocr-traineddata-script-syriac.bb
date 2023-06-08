SUMMARY = "Syriac script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Syriac script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-script-syriac-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "ca9daae62076f07da1b1b0407d4dd4ac52d6a7446c7a3f5d4ce5a48889b490cf42880d3fe91f6c6f21568474669bdae5c74ad8d5faa0020bab5d22eb31601aa1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-syriac"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
