SUMMARY = "Thaana script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Thaana script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-script-thaana-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "ecc1535771ed3bd54098e5d088f908ddbf7e4ccb8b8ee5db195e8723c66c6a9df6b13c053976dfe49ff7cdb76ba447109d48918849bc8d4af816b3ffb0181e32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-thaana"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
