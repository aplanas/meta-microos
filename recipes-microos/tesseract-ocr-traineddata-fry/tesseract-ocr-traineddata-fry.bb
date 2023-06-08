SUMMARY = "Western Frisian language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Western Frisian language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-fry-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "89a568d11556e2bbe94ca369214c2e2512f5b982542711cc968d7621b18976ae3bbd7aadbc03dead68fd1845f7aff7482b0ccd613cde4a99f4d367465590c6be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-frisian tesseract-ocr-traineddata-fry tesseract-traineddata-frisian"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
