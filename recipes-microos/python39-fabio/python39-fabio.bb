SUMMARY = "Image IO for images produced by 2D X-ray detectors"
DESCRIPTION = "FabIO is an I/O library for images produced by 2D X-ray detectors."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LGPL-3.0-or-later & MIT"

PV = "0.14.0"

RPM_NAME = "python39-fabio-0.14.0-2.5.aarch64.rpm"
RPM_HASH = "efc8cf7394452aa63d3fdba0790844a169a25ec359d53246364752b1307e99164b2993815d1e26a84cc537c90ce22c8c8a7802bf7a017fdbe9744808d5edd2b3"

RPROVIDES:${PN} += "python3.9dist(fabio) \
python39-fabio \
python39-fabio(aarch-64) \
python3dist(fabio)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python39-Pillow \
python39-h5py \
python39-lxml \
python39-numpy \
python39-qt5 \
update-alternatives"

inherit rpm
