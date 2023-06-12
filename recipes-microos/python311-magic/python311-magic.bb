SUMMARY = "Python module to use libmagic"
DESCRIPTION = "This package contains the Python binding that require the magic 'file' \
interface."
LICENSE = "BSD-3-Clause & BSD-4-Clause"

PV = "5.44"

RPM_NAME = "python311-magic-5.44-2.1.aarch64.rpm"
RPM_HASH = "56f591008e288405b509c2bb18297a751530f5c4e99e92d66b16d717075398af364d56bb12d9f5af0f51e1435347d1cac048d1f1ac5fd1b1547ed4ee7ac80726"

RPROVIDES:${PN} += "python3.11dist(file-magic) \
python311-file-magic \
python311-magic \
python311-magic(aarch-64) \
python3dist(file-magic)"
RDEPENDS:${PN} += "libmagic1 \
python(abi)"

inherit rpm
