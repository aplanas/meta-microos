SUMMARY = "Vietnamese language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Vietnamese language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-vie-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "7cef3e073ab6edf797f18f22a656eefcf3599e1085f58067aea8b56b7d29c26dab1e08b56fc0fe8def5d452c550e7cd9ebc8b0a90daea3e3a1b2613338badf69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-vie tesseract-ocr-traineddata-vietnamese tesseract-traineddata-vietnamese"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
