SUMMARY = "'Japanese language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the 'Japanese language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-jpn_vert-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "c7eae544e5cc7a815d3002f554cbe4957847b36dd2d03ea379f84d6416e10487ebe7dec49781ce5af2634c2d886b148a4c2c7937ba66ae1f673e3785fe2a66b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-japanese_vertical \
tesseract-ocr-traineddata-jpn_vert \
tesseract-traineddata-japanese_vertical"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
