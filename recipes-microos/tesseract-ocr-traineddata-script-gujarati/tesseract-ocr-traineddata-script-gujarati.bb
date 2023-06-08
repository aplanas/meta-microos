SUMMARY = "Gujarati script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Gujarati script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-script-gujarati-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "bffb175d8bafb60a0d6227f687ad2ee7a1b13b07f36f8a9e976c939c7736dfa8f87b91cdf063d6815170947a6023dacd51e94801c457976bae17245f6c616b3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-gujarati"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
