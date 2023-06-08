SUMMARY = "Kannada language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Kannada language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-kan-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "9f7a5049a027138a9111938148bef6e1c9a99547abb0adca5480e66bc960e4f192c38a2cd6fc87d595bfff870765d8e2f6c2f929d1c0017279920b524b407aeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-kan tesseract-ocr-traineddata-kannada tesseract-traineddata-kannada"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
