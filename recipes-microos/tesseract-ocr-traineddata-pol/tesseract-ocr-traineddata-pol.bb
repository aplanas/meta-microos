SUMMARY = "Polish language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Polish language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-pol-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "3016eb8d84ef3f22e19db8177725bf0711c5343214513cfcb583d3405b69a4baba37a84bdcbee9faf089c00eb3299976b803f8c165d453c85a42efd66524371a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-pol \
tesseract-ocr-traineddata-polish \
tesseract-traineddata-polish"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
