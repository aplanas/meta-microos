SUMMARY = "Dzongkha language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Dzongkha language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-dzo-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "81459cf960fa42cedfae34ebada8d3f65ec105ca8080297bdf0ac4156c842d519567cee289452938646ffd5694796e69020e22a2bb5b06d96a3df42d38d3c1a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-dzo tesseract-ocr-traineddata-dzongkha tesseract-traineddata-dzongkha"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
