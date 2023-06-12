SUMMARY = "Tajik language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Tajik language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-tgk-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "1a67e38dc2759780e82498c687bc2f48421937b53c01ddd63a344962ee57f449351ac9acafc2028f96f1915aedf369871eb017eec204150a9e19214dd9561edf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-tajik \
tesseract-ocr-traineddata-tgk \
tesseract-traineddata-tajik"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
