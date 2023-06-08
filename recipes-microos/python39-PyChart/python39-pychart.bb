SUMMARY = "Python Chart Generator"
DESCRIPTION = "Pychart is a Python library for creating high-quality \
charts in Postscript, PDF, PNG, and SVG. \
It produces line plots, bar plots, range-fill plots, and pie \
charts."
LICENSE = "GPL-2.0-or-later"

PV = "1.39"

RPM_NAME = "python39-PyChart-1.39-1.14.noarch.rpm"
RPM_HASH = "0a27ab49bba5ef663d09107bd9aaf0d06c0d8f4a651483c593e77bdcc7075de3a5bbe3bad36b9b6bcd9701307d2a8d75acaf78a5ffe75e9c54e6af84d8de295b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pychart) python39-PyChart python3dist(pychart)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
