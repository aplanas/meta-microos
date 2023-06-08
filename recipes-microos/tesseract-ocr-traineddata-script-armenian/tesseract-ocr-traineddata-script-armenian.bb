SUMMARY = "Armenian script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Armenian script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-script-armenian-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "4ddf9f9777d044dfeccaa01b81fd6705094d3b04d91445d4a8bde1ed41b067aa9d41f032cce7fd04c04be231d056229694f1359a10ae7527fbbb8218bcb644ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-armenian"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
