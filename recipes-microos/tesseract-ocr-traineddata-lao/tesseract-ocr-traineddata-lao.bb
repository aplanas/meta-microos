SUMMARY = "Lao language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Lao language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-lao-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "7e0c2908308ceb441aac1aab86fb328f5e445ed46d05f7942191b4e048f1f8a3d51cc2077e51e43307c8e334c02225d79ae4a6ce3501296b08eaa5cda05b7103"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-lao tesseract-traineddata-lao"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
