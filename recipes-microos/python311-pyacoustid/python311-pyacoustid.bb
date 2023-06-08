SUMMARY = "Bindings for Chromaprint acoustic fingerprinting and the Acoustid API"
DESCRIPTION = "Chromaprint and Acoustid for Python \
 \
Chromaprint and its associated Acoustid Web service make up a \
high-quality, open-source acoustic fingerprinting system. This package provides \
Python bindings for both the fingerprinting algorithm library, which is written \
in C but portable, and the Web service, which provides fingerprint lookups."
LICENSE = "MIT"

PV = "1.2.2"

RPM_NAME = "python311-pyacoustid-1.2.2-1.4.noarch.rpm"
RPM_HASH = "6f6b252cbb9a8294533bcf3c0a18e8e45d30ea378d8219ac3242d79757be7331c826b5e29ee1d891318339455e14d45082b4f633e4c2e7e9aeb4d5213561e2d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyacoustid) python311-pyacoustid python3dist(pyacoustid)"
RDEPENDS:${PN} += "python(abi) python311-audioread python311-requests"

inherit rpm
