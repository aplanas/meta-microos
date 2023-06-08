SUMMARY = "Kurmanji language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Kurmanji language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-kmr-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "17b40256d5a45f55041475aeb6dd2f40e06e2f99b19ba7caeab44da60245f9356b18b71a1f97a9554b400a2101c2cfd8f28275a59f11e844a5ff919915c19054"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-kmr tesseract-ocr-traineddata-kurmanji tesseract-traineddata-kurmanji"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
