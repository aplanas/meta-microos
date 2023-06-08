SUMMARY = "Tamil script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Tamil script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-script-tamil-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "11fb3cd65bded8525cb39976b5ec1fe4c8ac3935c441adb5c9ad307f447097fcdb6ce3a78bf99a1642a537f9b9bac6761b8c258d2ea903720bfac8479d660046"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-tamil"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
