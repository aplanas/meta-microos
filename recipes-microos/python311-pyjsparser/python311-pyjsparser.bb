SUMMARY = "Javascript parser based on esprimajs"
DESCRIPTION = "A JavaScript parser - a manual translation of esprima.js to Python. \
It supports the whole of ECMAScript 5.1 and parts of ECMAScript 6."
LICENSE = "MIT"

PV = "2.7.1"

RPM_NAME = "python311-pyjsparser-2.7.1-2.1.noarch.rpm"
RPM_HASH = "2b52296175e2a942fc79bf4f1863f96afbbf4d3cfe278c8b426d7af32170a2d6ea5f45593f8af073932c6535fa7da1ee51bbc07cb683a90b3ecf8d20de22b1f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyjsparser) \
python311-pyjsparser \
python3dist(pyjsparser)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
