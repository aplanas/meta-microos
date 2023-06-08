SUMMARY = "A Python wrapper around tesseract-ocr"
DESCRIPTION = "A wrapper around the tesseract-ocr API for Optical Character \
Recognition (OCR). \
 \
tesserocr integrates directly with Tesseract's C++ API using Cython \
which allows for Pythonic source code. It enables real concurrent \
execution when used with Python's threading module by releasing the \
GIL while processing an image in tesseract."
LICENSE = "MIT"

PV = "2.6.0"

RPM_NAME = "python310-tesserocr-2.6.0-1.4.aarch64.rpm"
RPM_HASH = "c54d6ef1c8da681f5b369e3a77012ef65fab895b49abc866ecaf94cea342bc3d43725698a017cbe167e7a4cb646389819e21fee37f7044ef9f44768f15d463cd"

RPROVIDES:${PN} += "python3-tesserocr python3.10dist(tesserocr) python310-tesserocr python310-tesserocr(aarch-64) python3dist(tesserocr)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libleptonica.so.6()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libtesseract.so.5.3.0()(64bit) python(abi) tesseract-ocr-traineddata-english tesseract-ocr-traineddata-orientation_and_script_detection"

inherit rpm
