SUMMARY = "Javascript parser based on esprimajs"
DESCRIPTION = "A JavaScript parser - a manual translation of esprima.js to Python. \
It supports the whole of ECMAScript 5.1 and parts of ECMAScript 6."
LICENSE = "MIT"

PV = "2.7.1"

RPM_NAME = "python310-pyjsparser-2.7.1-2.1.noarch.rpm"
RPM_HASH = "9f19b3156b42e3450796a36a1cf42f99b23890ca811934ac4772b578df367d2db913f3b188b56853b06ba403b57b2b08cc23991069f64fa736dc25737d88bb31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyjsparser \
python3.10dist(pyjsparser) \
python310-pyjsparser \
python3dist(pyjsparser)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
