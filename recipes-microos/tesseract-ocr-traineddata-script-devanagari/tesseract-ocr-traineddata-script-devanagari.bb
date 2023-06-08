SUMMARY = "Devanagari script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Devanagari script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-script-devanagari-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "47575d86553c943f2caeab4cd956cd7108fdbf7c70d414b3bae0bf11ad1ebe1b11fbffbccf7e74e09537b6b13baaa5d1101027f9dc9476854c9dc1092089b2ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-devanagari"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
