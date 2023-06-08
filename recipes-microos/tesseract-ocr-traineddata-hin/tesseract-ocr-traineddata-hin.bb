SUMMARY = "Hindi language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Hindi language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-hin-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "004469a3a1daeadb3679504af6e7aa9f3f82250205d636e1327209a27671f8587a4f78e851560d981b4744e9c60fc515adccded3ddc03cb5694964cd372b7b13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-hin tesseract-ocr-traineddata-hindi tesseract-traineddata-hindi"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
