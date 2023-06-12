SUMMARY = "Log formatting with colors"
DESCRIPTION = "colorlog.ColoredFormatter is a formatter for use with Python's logging module. \
It allows colors to be placed in the format string, which is mostly useful \
when paired with a StreamHandler that is outputting to a terminal. \
This is accomplished by added a set of terminal color codes to the record \
before it is used to format the string."
LICENSE = "MIT"

PV = "6.7.0"

RPM_NAME = "python311-colorlog-6.7.0-1.3.aarch64.rpm"
RPM_HASH = "50995b56f0f86014a03728046e90a6229b42444edb21d3b9549ed62626a1c36b6dee8a470cca545803735960e5623d0485124947be58168e01ddca909059fb68"

RPROVIDES:${PN} += "python3.11dist(colorlog) \
python311-colorlog \
python311-colorlog(aarch-64) \
python3dist(colorlog)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
