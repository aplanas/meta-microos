SUMMARY = "Python container testing library"
DESCRIPTION = "Python container testing library."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-conu-1.0.0-2.3.noarch.rpm"
RPM_HASH = "b0a2d6232213b38bad6f9ea52b08ea01d65a4de8a12c452d7121e6b419e9f9a7d5d5ae733a60b106f47cd17cc1b76adf94a5455be53f6c99a4d4923ab459376e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(conu) \
python39-conu \
python3dist(conu)"
RDEPENDS:${PN} += "python(abi) \
python39-docker \
python39-flexmock \
python39-kubernetes \
python39-pytest \
python39-requests"

inherit rpm
