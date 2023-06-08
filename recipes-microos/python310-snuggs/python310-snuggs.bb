SUMMARY = "S-expressions tool for Numpy"
DESCRIPTION = "Snuggs are s-expressions for Numpy."
LICENSE = "MIT"

PV = "1.4.7"

RPM_NAME = "python310-snuggs-1.4.7-2.7.noarch.rpm"
RPM_HASH = "0ce2ebe0d68a3f2fb120982bb519e796c591a939b07c2872ac37b6aee9315e1919a6b0d5484fcbf060b74bec342be3f4d9b5cc7fa9eadd356220402acbd3687b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-snuggs python3.10dist(snuggs) python310-snuggs python3dist(snuggs)"
RDEPENDS:${PN} += "python(abi) python310-numpy python310-pyparsing"

inherit rpm
