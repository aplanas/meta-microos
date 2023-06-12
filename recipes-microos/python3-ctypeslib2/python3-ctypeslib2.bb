SUMMARY = "Python FFI toolkit using clang"
DESCRIPTION = "Python FFI toolkit using clang."
LICENSE = "MIT"

PV = "2.3.4"

RPM_NAME = "python3-ctypeslib2-2.3.4-1.1.noarch.rpm"
RPM_HASH = "49099df56f1eed2a2fd14cb9cdb662261186aecf58ac1408902deead86aceacb6f0d7e95cdcda271f0206114684efb2eab9075cfb54072dfc8327f6f718eae64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ctypeslib2 \
python3.10dist(ctypeslib2) \
python310-ctypeslib2 \
python3dist(ctypeslib2)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
python(abi) \
python3-clang15 \
update-alternatives"

inherit rpm
