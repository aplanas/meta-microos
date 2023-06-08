SUMMARY = "Telugu script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Telugu script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-script-telugu-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "d177f228094e111d4d8ac3511cbcfda056e447b942a46aea7bf4a1d9a81d1bfe6b65ec24f39564f376b66cb4d59a6b8613bef71812e4155a5a4e2df4ba82a491"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-telugu"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
