SUMMARY = "Tongan language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Tongan language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-ton-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "8a2fc9ba926087849c8d7ae2ee081003f6af9b843d197975b281db53baf47be688c0fbee786f4dc9daed1dd9683bca4528d4b1c32097a414276122ab99c30694"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-ton tesseract-ocr-traineddata-tongan tesseract-traineddata-tongan"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
