SUMMARY = "Python3 bindings for the exiv2 library"
DESCRIPTION = "python3-exiv2 is a Python 3 binding to exiv2, the C++ library for manipulation \
of EXIF, IPTC and XMP image metadata. It is a python 3 module that allows your \
scripts to read and write metadata (EXIF, IPTC, XMP, thumbnails) embedded in \
image files (JPEG, TIFF, ...). \
 \
It is designed as a high-level interface to the functionalities offered by \
libexiv2. Using python’s built-in data types and standard modules, it provides \
easy manipulation of image metadata."
LICENSE = "GPL-3.0-only"

PV = "0.11.0"

RPM_NAME = "python310-exiv2-0.11.0-1.7.aarch64.rpm"
RPM_HASH = "b46566eee0f6587e1d8e7c4202a463be5c847db9d1cf91a2060ef6910640f7f1cf4a9913efc63f55ca464fdd5f46c4e8d6ffa5d15acf8a7881d9a671a6c3da16"

RPROVIDES:${PN} += "libexiv2python.cpython-310-aarch64-linux-gnu.so()(64bit) \
python3-exiv2 \
python3.10dist(py3exiv2) \
python310-exiv2 \
python310-exiv2(aarch-64) \
python3dist(py3exiv2)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libboost_python-py3.so.1.82.0()(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libexiv2.so.27()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
python(abi)"

inherit rpm
