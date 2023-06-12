SUMMARY = "Assamese language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Assamese language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-asm-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "f9f07ea15351717950c175699ebe8d6a2cc74c9539173f620211ec364623ffe1ad9cea3cc6310206b9cd9332a4c0a40f40affab95b575420569732e85517d3bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-asm \
tesseract-ocr-traineddata-assamese \
tesseract-traineddata-assamese"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
