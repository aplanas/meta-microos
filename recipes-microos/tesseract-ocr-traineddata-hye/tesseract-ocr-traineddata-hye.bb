SUMMARY = "Armenian language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Armenian language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-hye-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "4143d6f6ef07be3fc2589a2586f5ef891f75664e107be8a1a265630e5320e4310d94d49d690860e25c6882d7f85e0ccce0fab50f3aeb80514dc1fd0462c0562a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-armenian \
tesseract-ocr-traineddata-hye \
tesseract-traineddata-armenian"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
