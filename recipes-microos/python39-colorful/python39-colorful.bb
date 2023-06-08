SUMMARY = "Terminal string styling done right, in Python"
DESCRIPTION = "colorful gives you control over terminal string styling in Python \
with an easy to use API."
LICENSE = "MIT"

PV = "0.5.5"

RPM_NAME = "python39-colorful-0.5.5-1.3.noarch.rpm"
RPM_HASH = "fc6bb630dca5c682d5ed0b256c5a57331b9627df1fae496a1a9d0711a4cbb21c24ac9b7b50d31f2bd88afabefba02e38f53099f6475c36ca757a43208ba5f1bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(colorful) python39-colorful python3dist(colorful)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
