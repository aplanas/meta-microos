SUMMARY = "Kazakh language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Kazakh language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-kaz-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "7eb64aedd668a614c47b27c27da390ba119652864b4a01b636a093988b320dc1186e2e1d7291edbc9aaee420679ccbf2ed740844e7bf2ebfd8e5d4eae7e2fc3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-kaz tesseract-ocr-traineddata-kazakh tesseract-traineddata-kazakh"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
