SUMMARY = "Yiddish language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Yiddish language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-yid-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "775246ed90f2243555d5ad78efc8b15b3e7ee19b0e281e1ef2be375390c219ab589fa0fede9ad9d5a36c357edd5f73fbcdfcdfec8f882d53faac27eafda61608"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-yid \
tesseract-ocr-traineddata-yiddish \
tesseract-traineddata-yiddish"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
