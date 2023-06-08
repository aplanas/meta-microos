SUMMARY = "Dutch language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Dutch language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-nld-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "8fbe472049a4b5f63d82caa2bb1c3471356eec871b65996c40a640b9f5afc7c32eb87e7fdac065bb1c79409b861e614cef31265f62ee0110d7cd372eadd6bbe7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-dutch tesseract-ocr-traineddata-nld tesseract-traineddata-dutch"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
