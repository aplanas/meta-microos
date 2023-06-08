SUMMARY = "Icelandic language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Icelandic language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-isl-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "e04ba3b1e666e731124378b189608e3935570c62d307fb764bff565e43416413f555e7a7f653b7741095d8d2f8d5f1b7a97c6d570891867b57d7674fa9d02fea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-icelandic tesseract-ocr-traineddata-isl tesseract-traineddata-icelandic"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
