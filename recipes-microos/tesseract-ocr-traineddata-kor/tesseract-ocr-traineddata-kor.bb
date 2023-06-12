SUMMARY = "Korean language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Korean language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-kor-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "3a242cf61412049b291690095e802c6d69d1099125e0b9d3f8d16cbb9d10d9442ce8cdf9148f75efdfb24cba171c2af7c0752bcdb3e181dd4a1b23dd6ad76e9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-kor \
tesseract-ocr-traineddata-korean \
tesseract-traineddata-korean"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
