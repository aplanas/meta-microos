SUMMARY = "Georgian language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Georgian language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-kat-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "da689a8c31118d073b07744ded5d66df432b4922be0f38b2bbb5cd91a077569b1d47c9b185aec64e47fadf35deaefd048f10f95102a48dbb13f27a0496451611"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-georgian tesseract-ocr-traineddata-kat tesseract-traineddata-georgian"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
